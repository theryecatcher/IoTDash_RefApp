# checkout submodules
def checkoutSubmodules():
	print("Pulling Submodules ")
	statementStatus  = subprocess.call('git submodule init', shell=True)
	if statementStatus == 1 :
		sys.exit("Error when init submodule ")
	statementStatus  = subprocess.call('git submodule update --init --remote', shell=True)
	if statementStatus == 1 :
		sys.exit("Error when updating submodules")

	return statementStatus


def buildProject(mavenCommand,projectDir):
	statementStatus  = subprocess.call(mavenCommand, shell=True)
	if statementStatus == 1 :
		sys.exit("Error building the project "+projectDir)

	return statementStatus


def deployProject(cfCommand, projectDir):
	print("Deploying project as  "+cfCommand)
	statementStatus  = subprocess.call(cfCommand, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deploying the project"+projectDir)

	return statementStatus


def deleteExistingApplications():
	deleteRequest = "cf delete -f -r " +config.predixbootAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.dataSeedAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.dataSourceAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.websocketAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.dataIngestionAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.machineSimulatorAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(5)  # Delay for 60 seconds
	deleteRequest = "cf delete -f -r " +config.uiAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error deleting an application: " +deleteRequest)
	time.sleep(25)  # Delay for 120 seconds
	return statementStatus

def deleteExistingServices():
	#delete UAA instance

	deleteRequest = "cf delete-service -f "
	statementStatus  = subprocess.call(deleteRequest+config.rmdUaaName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdUaaName)
	time.sleep(5)  # Delay for 60 seconds
	statementStatus  = subprocess.call(deleteRequest+config.rmdAcsName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdAcsName)
	time.sleep(5)  # Delay for 60 seconds
	statementStatus  = subprocess.call(deleteRequest+config.rmdPredixAssetName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdPredixAssetName)
	time.sleep(5)  # Delay for 60 seconds
	statementStatus  = subprocess.call(deleteRequest+config.rmdPredixTimeseriesName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdPredixTimeseriesName)
	time.sleep(5)  # Delay for 60 seconds
	statementStatus  = subprocess.call(deleteRequest+config.rmdPostgre, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdPostgre)
	time.sleep(5)  # Delay for 60 seconds
	statementStatus  = subprocess.call(deleteRequest+config.rmdRedis, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deleting an service instance: " +config.rmdRedis)
	time.sleep(5)  # Delay for 60 seconds
	return statementStatus

def createPredixUAASecurityService():
	#create UAA instance
    uaa_payload_filename = 'uaa_payload.json'
    data = {}
    data['adminClientSecret'] = config.uaaAdminSecret

    with open(uaa_payload_filename, 'w') as outfile:
        json.dump(data, outfile)
        outfile.close()

	uaaJsonrequest = "cf cs "+config.predixUaaService+" "+config.predixUaaServicePlan +" "+config.rmdUaaName+ " -c " + os.getcwd()+'/'+uaa_payload_filename
	print uaaJsonrequest
	statementStatus  = subprocess.call(uaaJsonrequest, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a uaa service instance")
	return statementStatus

def getVcapJsonForPredixBoot ():
	predixBootEnv = subprocess.check_output(["cf", "env" ,config.predixbootAppName])
	systemProvidedVars=predixBootEnv.split('System-Provided:')[1].split('No user-defined env variables have been set')[0]
	formattedJson = systemProvidedVars.replace("\n","").replace("'","").replace("}{","},{")
	return "["+formattedJson+"]"

def addUAAUser(userId , password, email,adminToken):
	createUserBody = {"userName":"","password":"","emails":[{"value":""}]}
	createUserBody["userName"] = userId
	createUserBody["password"] = password
	createUserBody["emails"][0]['value'] = email

	createUserBodyStr = json.dumps(createUserBody)
	print(createUserBodyStr)


	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\" '
	createUserCurl = "curl -X POST '"+UAA_URI+"/Users' " +"-d '"+createUserBodyStr+"'"+headers
	print ("*****************")
	print ("Creating User command : "+createUserCurl)
	print ("*****************")

	clientResponse  = subprocess. check_output(createUserCurl, shell=True)
	statementStatusJson = json.loads(clientResponse)
	#print("print the json response is "+ clientResponse)
	if statementStatusJson.get('error'):
		statementStatus = statementStatusJson['error']
		statementStatusDesc = statementStatusJson['error_description']
	else :
		statementStatus = 'success'
		statementStatusDesc = statementStatusJson['id']

	if statementStatus == 'success' or  'scim_resource_already_exists' not in statementStatusDesc :
		print("User is UAA ")
	else :
		sys.exit("Error adding Users "+statementStatusDesc )




def deployAndBindUAAToPredixBoot():
	deployProject('cf push '+config.predixbootAppName+' -f '+'predix-microservice-cf-jsr311/manifest.yml',config.predixbootJSRRepoName)
	statementStatus  = subprocess.call("cf bs "+config.predixbootAppName +" " + config.rmdUaaName , shell=True)
	if statementStatus == 1 :
			sys.exit("Error binding a uaa service instance to boot ")

	#statementStatus  = subprocess.call("cf restage "+config.predixbootAppName, shell=True)
	#if statementStatus == 1 :
	#		sys.exit("Error restaging a uaa service instance to boot")


def getUAAAdminToken():
	adminRealm = "admin:"+config.uaaAdminSecret
	adminRelmKey = base64.b64encode(adminRealm)
	headers = {"Content-Type":"application/x-www-form-urlencoded", "Authorization":"Basic " + adminRelmKey}
	jsonPostBody= "grant_type=client_credentials"

	request = urllib2.Request(uaaIssuerId)
	request.add_data(jsonPostBody)
	for key,value in headers.items():
  		request.add_header(key,value)

  	response = urllib2.urlopen(request)
  	data_respo = response.read()
  	jsonResponse = json.loads(data_respo)
  	print("Admin Token is "+jsonResponse['token_type']+" "+jsonResponse['access_token'])
  	return (jsonResponse['token_type']+" "+jsonResponse['access_token'])


def createClientIdAndAddUser():
	# setup the UAA login
	adminToken = processUAAClientId(UAA_URI+"/oauth/clients","POST")

	# Add users
	print("****************** Adding users ******************")
	addUAAUser("rmd_user_1" , "RMD_user_1", "rmd_user_1@gegrctest.ge.com",adminToken)
	addUAAUser("rmd_admin_1" , "RMD_admin_1", "rmd_admin_1@gegrctest.com",adminToken)

def createBindPredixACSService(rmdAcsName):
	if config.cleanDeployment in ('y','Y'):
	    acs_payload_filename = 'acs_payload.json'
	    data = {}
	    data['trustedIssuerIds'] = uaaIssuerId
	    with open(acs_payload_filename, 'w') as outfile:
	        json.dump(data, outfile)
	        outfile.close()

		#create UAA instance
		acsJsonrequest = "cf cs "+config.predixAcsService+" "+config.predixAcsServicePlan +" "+rmdAcsName+ " -c "+ os.getcwd()+'/'+ acs_payload_filename
		print acsJsonrequest
		statementStatus  = subprocess.call(acsJsonrequest, shell=True)
		if statementStatus == 1 :
			sys.exit("Error creating a uaa service instance")

	statementStatus  = subprocess.call("cf bs "+config.predixbootAppName +" " + rmdAcsName , shell=True)
	if statementStatus == 1 :
			sys.exit("Error binding a uaa service instance to boot ")


	#statementStatus  = subprocess.call("cf restage "+config.predixbootAppName, shell=True)
	#if statementStatus == 1 :
	#		sys.exit("Error restaging a uaa service instance to boot")

	return statementStatus

def createGroup(adminToken,policyGrp):
	print("****************** Add Group ******************")
	createGroupBody = {"displayName":""}
	createGroupBody["displayName"] = policyGrp
	createGroupBodyStr = json.dumps(createGroupBody)

	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\" '
	uaaGroupCurl = "curl -X POST '"+UAA_URI+"/Groups' -d '"+createGroupBodyStr+"'"+headers
	print ("*****************")
	print (" UAA Client Group Command"+uaaGroupCurl)
	print ("*****************")

	clientResponse  = subprocess. check_output(uaaGroupCurl, shell=True)
	statementStatusJson = json.loads(clientResponse)

	if statementStatusJson.get('error'):
		statementStatus = statementStatusJson['error']
		statementStatusDesc = statementStatusJson['error_description']
	else :
		statementStatus = 'success'
		statementStatusDesc = 'success'

	if statementStatus == 'success' or  'scim_resource_exists' not in statementStatusDesc :
		print("Success creating or reusing the Group")
	else :
		sys.exit("Error Processing Adding Group on UAA "+statementStatusDesc )

def getGroup(adminToken ,grpname):
	#check Get Group
	# https://9938f377-5b07-4677-a951-cfeb36858836.predix-uaa-sysint.grc-apps.svc.ice.ge.com/Groups?filter=displayName+eq+%22test%22&startIndex=1
	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\" '
	uaaGroupCurl = 'curl -X GET "'+UAA_URI+'/Groups/?filter=displayName+eq+%22'+grpname+'%22&startIndex=1"'+headers
	print ("*****************")
	print (" UAA Client Group Command "+uaaGroupCurl)
	print ("*****************")
	getGroupResponse  = subprocess. check_output(uaaGroupCurl, shell=True)
	getGroupResponseJson = json.loads(getGroupResponse)
	groupFound = True
	statementStatus = 'success'

	if getGroupResponseJson.get('totalResults') <=0 :
		statementStatus = 'not found'
		groupFound = False

	print ("print Group "+str(groupFound) + "JSON "+getGroupResponse)

	return groupFound ,getGroupResponseJson

def getUserbyDisplayName(adminToken ,username):
	#check Get Group
	# get https://9938f377-5b07-4677-a951-cfeb36858836.predix-uaa-sysint.grc-apps.svc.ice.ge.com/Users?attributes=id%2CuserName&filter=userName+eq+%22rmd_admin_1%22&startIndex=1
	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\" '
	uaaUserCurl = 'curl -X GET "'+UAA_URI+'/Users/?attributes=id%2CuserName&filter=userName+eq+%22'+username+'%22&startIndex=1"'+headers
	print ("*****************")
	print (" UAA Client User Command "+uaaUserCurl)
	print ("*****************")
	getUserResponse  = subprocess. check_output(uaaUserCurl, shell=True)
	getUserResponseJson = json.loads(getUserResponse)
	userFound = True
	statementStatus = 'success'

	if getUserResponseJson.get('totalResults') <= 0 :
		statementStatus = 'not found'
		userFound = False

	return userFound ,getUserResponseJson


def addAdminUserPolicyGroup(policyGrp,userName):

	adminToken = getUAAAdminToken()
	if not adminToken :
		sys.exit("Error getting admin token from the UAA instance ")

	#check Get Group
	groupFound,groupJson = getGroup(adminToken,policyGrp)

	if not groupFound :
		createGroup(adminToken,policyGrp)
		groupFound,groupJson = getGroup(adminToken,policyGrp)



	userFound,userJson = getUserbyDisplayName(adminToken,userName)

	if not userFound :
		sys.exit(" User is not found in the UAA - error adding member to the group")

	members = []
	if groupJson.get('resources') :
		grpName = groupJson['resources'][0]
		if grpName.get('members') :
			groupMeberList = grpName.get('members')
			for groupMeber in groupMeberList:
				members.insert(0 ,groupMeber['value'])

	members.insert(0, userJson['resources'][0]['id'])

	print (' Member to be updated for the Group ,'.join(members))

	#update Group
	groupId = groupJson['resources'][0]['id']
	updateGroupBody = { "meta": {}, "schemas": [],"members": [],"id": "","displayName": ""}
	updateGroupBody["meta"] = groupJson['resources'][0]['meta']
	updateGroupBody["members"] = members
	updateGroupBody["displayName"] = groupJson['resources'][0]['displayName']
	updateGroupBody["schemas"] = groupJson['resources'][0]['schemas']
	updateGroupBody["id"] = groupId

	updateGroupBodyStr = json.dumps(updateGroupBody)
	uuaGroupURL = UAA_URI + "/Groups/"+groupId

	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\"  -H \"if-match: *\" -H \"accept: application/json\" '
	uaaGroupPutCurl = "curl -X  PUT '"+uuaGroupURL+"' -d '"+updateGroupBodyStr+"'"+headers
	print ("*****************")
	print (" UAA Client Command UAA group member add "+uaaGroupPutCurl)
	print ("*****************")

	clientResponse  = subprocess. check_output(uaaGroupPutCurl, shell=True)
	statementStatusJson = json.loads(clientResponse)

	if statementStatusJson.get('error'):
		statementStatus = statementStatusJson['error']
		statementStatusDesc = statementStatusJson['error_description']
	else :
		statementStatus = 'success'
		statementStatusDesc = 'success'

	if statementStatus == 'success' or  'Client already exists' not in statementStatusDesc :
		print ("User Successful adding " +userName + " to the group "+policyGrp)
	else :
		sys.exit("Error adding " +userName + " to the group "+policyGrp )


def updateUsersClientId( ):
	updateClientId()
	addAdminUserPolicyGroup("acs.policies.read","rmd_admin_1")
	addAdminUserPolicyGroup("acs.policies.write","rmd_admin_1")
	addAdminUserPolicyGroup("acs.attributes.read","rmd_admin_1")
	addAdminUserPolicyGroup("acs.attributes.write","rmd_admin_1")

	addAdminUserPolicyGroup("acs.policies.read","rmd_user_1")
	addAdminUserPolicyGroup("acs.attributes.read","rmd_user_1")

def processUAAClientId (uuaClientURL,method):
	adminToken = getUAAAdminToken()
	if not adminToken :
		sys.exit("Error getting admin token from the UAA instance ")

	# create a client id
	print("****************** Creating client id ******************")

	createClientIdBody = {"client_id":"","client_secret":"","scope":[],"authorized_grant_types":[],"authorities":[],"autoapprove":["openid"]}
	createClientIdBody["client_id"] = config.rmdAppClientId
	createClientIdBody["client_secret"] = config.rmdAppSecret
	createClientIdBody["scope"] = clientScope
	createClientIdBody["authorized_grant_types"] = config.clientGrantType
	createClientIdBody["authorities"] = clientAuthorites

	createClientIdBodyStr = json.dumps(createClientIdBody)

	headers = ' -H "Authorization:'+adminToken+'\" -H \"Content-Type: application/json\" '
	#uaaCreateClientCurl = 'curl -X '+method+' "'+uuaClientURL+'" -d "'+createClientIdBodyStr+'"'+headers
	uaaCreateClientCurl = "curl -X "+method+" '"+uuaClientURL+"' -d '"+createClientIdBodyStr+"'"+headers
	print ("*****************")
	print (" UAA Client Command"+uaaCreateClientCurl)
	print ("*****************")

	clientResponse  = subprocess. check_output(uaaCreateClientCurl, shell=True)
	statementStatusJson = json.loads(clientResponse)


	if statementStatusJson.get('error'):
		statementStatus = statementStatusJson['error']
		statementStatusDesc = statementStatusJson['error_description']
	else :
		statementStatus = 'success'
		statementStatusDesc = 'success'

	if statementStatus == 'success' or  'Client already exists' not in statementStatusDesc :
		print("Success creating or reusing the Client Id")
	else :
		sys.exit("Error Processing ClientId on UAA "+statementStatusDesc )

	return adminToken


def updateClientId():
	processUAAClientId(UAA_URI+"/oauth/clients/"+config.rmdAppClientId,"PUT")

def getTokenFromUAA():
	url = uaaIssuerId
	oauthRelam = config.rmdAppClientId+":"+config.rmdAppSecret
	authKey = base64.b64encode(oauthRelam)
	print ( authKey)
	headers = {"Content-Type":"application/x-www-form-urlencoded", "Authorization":"Basic " + authKey}
	#jsonPostBody = "grant_type=password&username=rmd_admin_1&password=RMD_admin_1"
	jsonPostBody= "response_type=password&grant_type=client_credentials&client_id=mvp3_ref_app"
	print(url , "body " +jsonPostBody +"auth keys "+authKey)
	request = urllib2.Request(url)
	request.add_data(jsonPostBody)
	for key,value in headers.items():
  		request.add_header(key,value)
  	response = urllib2.urlopen(request)
  	data_respo = response.read()
  	jsonResponse = json.loads(data_respo)
  	return (jsonResponse['token_type']+" "+jsonResponse['access_token'])

def createRefAppACSPolicyAndSubject(acs_zone_header):
	adminUserTOken = getTokenFromUAA()
	headers = ' -H "Authorization:'+adminUserTOken+'\" -H \"Content-Type: application/json\" '
	headers = headers + ' -H "Predix-Zone-Id:'+acs_zone_header+'"'
	acsPolicyCurl = 'curl -X PUT "'+ACS_URI+'/v1/policy-set/refapp-acs-policy" ' +'-d "@./acs/rmd_app_policy.json"'+headers
	#acsPolicyCurl = "curl -X PUT "+ACS_URI+"/v1/policy-set/refapp-acs-policy " +" -d @./acs/rmd_app_policy.json"+headers
	print ("Adding ACS policy "+acsPolicyCurl)
	statementStatus  = subprocess.call(acsPolicyCurl, shell=True)
	print(statementStatus)
	if statementStatus == 1 :
		sys.exit("Error creating ACS policy " )

	headers = ' -H "Authorization:'+adminUserTOken+'\" -H \"Content-Type: application/json\" '
	headers = headers + ' -H "Predix-Zone-Id:'+acs_zone_header+'"'

	acsSubjectCurl = 'curl -X PUT "'+ACS_URI+'/v1/subject/rmd_admin_1"' +' -d "@./acs/rmd_admin_1_role_attribute.json"'+headers
	print ("Adding Subject "+acsSubjectCurl)
	statementStatus  = subprocess.call(acsSubjectCurl, shell=True)
	acsSubjectCurl = 'curl -X PUT "'+ACS_URI+'/v1/subject/rmd_user_1"' +' -d "@./acs/rmd_user_1_role_attribute.json"'+headers
	print ("Adding Subject "+acsSubjectCurl)
	statementStatus  = subprocess.call(acsSubjectCurl, shell=True)

def createAsssetInstance(rmdPredixAssetName ,predixAssetName ):
    asset_payload_filename = 'asset_payload.json'
    uaaList = [uaaIssuerId]
    data = {}
    data['trustedIssuerIds'] = uaaList
    with open(asset_payload_filename, 'w') as outfile:
        json.dump(data, outfile)
        print(data)
        outfile.close()

	assetJsonrequest = "cf cs "+predixAssetName+" "+config.predixAssetServicePlan +" "+rmdPredixAssetName+ " -c "+os.getcwd()+'/' +asset_payload_filename
	print ("Creating Service cmd "+assetJsonrequest)
	statementStatus  = subprocess.call(assetJsonrequest, shell=True)
	#if statementStatus == 1 :
		#sys.exit("Error creating a assset service instance")

def createTimeSeriesInstance(rmdPredixTimeSeriesName,predixTimeSeriesName):
    timeSeries_payload_filename = 'timeseries_payload.json'
    uaaList = [uaaIssuerId]
    data = {}
    data['trustedIssuerIds'] =uaaList
    with open(timeSeries_payload_filename, 'w') as outfile:
        json.dump(data, outfile)
        outfile.close()

	tsJsonrequest = "cf cs "+predixTimeSeriesName+" "+config.predixTimeSeriesServicePlan +" "+rmdPredixTimeSeriesName+ " -c "+os.getcwd()+'/'+timeSeries_payload_filename
	print ("Creating Service cmd "+tsJsonrequest)
	statementStatus  = subprocess.call(tsJsonrequest, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a assset service instance")

def getPredixUAAConfigfromVcaps():
	formattedJson = getVcapJsonForPredixBoot()
	d = json.loads(formattedJson)
	uaaIssuerId =  d[0]['VCAP_SERVICES'][config.predixUaaService][0]['credentials']['issuerId']
	UAA_URI = d[0]['VCAP_SERVICES'][config.predixUaaService][0]['credentials']['uri']
	uaaZoneHttpHeaderName = d[0]['VCAP_SERVICES'][config.predixUaaService][0]['credentials']['zone']['http-header-name']
	uaaZoneHttpHeaderValue = d[0]['VCAP_SERVICES'][config.predixUaaService][0]['credentials']['zone']['http-header-value']
	return (uaaIssuerId ,UAA_URI,uaaZoneHttpHeaderName ,uaaZoneHttpHeaderValue)

def getPredixACSConfigfromVcaps():
	formattedJson = getVcapJsonForPredixBoot()
	d = json.loads(formattedJson)
	ACS_URI = d[0]['VCAP_SERVICES'][config.predixAcsService][0]['credentials']['uri']
	acsPredixZoneHeaderName = d[0]['VCAP_SERVICES'][config.predixAcsService][0]['credentials']['zone']['http-header-name']
	acsPredixZoneHeaderValue = d[0]['VCAP_SERVICES'][config.predixAcsService][0]['credentials']['zone']['http-header-value']
	acsOauthScope = d[0]['VCAP_SERVICES'][config.predixAcsService][0]['credentials']['zone']['oauth-scope']
	return (ACS_URI,acsPredixZoneHeaderName,acsPredixZoneHeaderValue,acsOauthScope)

def bindService(applicationName , rmdServiceInstanceName):
	statementStatus  = subprocess.call("cf bs "+applicationName +" " + rmdServiceInstanceName , shell=True)
	if statementStatus == 1 :
		sys.exit("Error binding a "+rmdServiceInstanceName+" service instance to boot ")


def restageApplication(applicationName):
	statementStatus  = subprocess.call("cf restage "+applicationName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error restaging a uaa service instance to boot")

def getAssetURLandZone(formattedVcapJson):
	assetUrl = ''
	assetZone =''
	d = json.loads(formattedJson)
	assetZone = d[0]['VCAP_SERVICES'][config.predixAssetService][0]['credentials']['instanceId']
	assetUrl = d[0]['VCAP_SERVICES'][config.predixAssetService][0]['credentials']['uri']
	return assetUrl,assetZone

def getTimeseriesURLandZone(formattedVcapJson):
	timeseriesUrl = ''
	timeseriesZone =''
	d = json.loads(formattedJson)
	timeseriesZone = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['query']['zone-http-header-value']
	timeseriesUrl = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['query']['uri']
	return timeseriesUrl,timeseriesZone

def getClientAuthoritiesforAssetAndTimeSeriesService(formattedVcapJson):
	d = json.loads(formattedJson)

	assetAuthorities = config.predixAssetService+".zones."+d[0]['VCAP_SERVICES'][config.predixAssetService][0]['credentials']['instanceId']+".user"
	#get Ingest authorities
	tsInjest = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['ingest']
	timeSeriesInjestAuthorities = tsInjest['zone-token-scopes'][0] +"," + tsInjest['zone-token-scopes'][1]
	# get query authorities
	tsQuery = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['query']
	timeSeriesQueryAuthorities = tsQuery['zone-token-scopes'][0] +"," + tsQuery['zone-token-scopes'][1]

	print ("returning timeseries client zone scopes query -->"+timeSeriesQueryAuthorities + " timeSeriesInjestAuthorities -->"+timeSeriesInjestAuthorities )

	return assetAuthorities,timeSeriesInjestAuthorities,timeSeriesQueryAuthorities


def checkoutAndDeployUI(repoName,appDeploymentName):
	print ("deploying "+repoName)
	os.chdir(repoName)
	print ("Changed directory to "+os.getcwd())
	statementStatus  = subprocess.check_output("npm install", shell=True)
	statementStatus  = subprocess.check_output("bower install", shell=True)
	statementStatus  = subprocess.check_output("grunt dist", shell=True)
	configureManifest(".")
	configureConnectServer("./tasks/options/")
	deployProject('cf push '+appDeploymentName,config.projectDir)
	os.chdir("..")


def configureManifest(manifestLocation):
	# create a backup
	if os.path.isfile(manifestLocation + "/manifest.yml"):
		shutil.copy(manifestLocation+"/manifest.yml", manifestLocation+"/manifest.yml.bak")
	# copy template as manifest
	shutil.copy(manifestLocation+"/manifest.yml.template", manifestLocation+"/manifest.yml")
	s = open(manifestLocation+"/manifest.yml").read()
	s = s.replace('${assetService}', config.rmdPredixAssetName)
	s = s.replace('${uaaService}', config.rmdUaaName)
	s = s.replace('${acsService}', config.rmdAcsName)
	s = s.replace('${oauthRestHost}', UAA_URI.replace('https://',''))
	s = s.replace('${clientId}', config.rmdAppClientId)
	s = s.replace('${secret}', config.rmdAppSecret)
	s = s.replace('${acsURI}', ACS_URI)
	s = s.replace('${timeSeriesService}', config.rmdPredixTimeseriesName)
	s = s.replace('${acssubdomain}', 'rmdsubdomain')
	s = s.replace('${postgresqService}', config.rmdPostgre)
	s = s.replace('${dataIngestionUrl}', DATA_INGESTION_URL)
	s = s.replace('${sessionService}', config.rmdRedis)
	s = s.replace('${UAA_SERVER_URL}', UAA_URI)
	s = s.replace('${ASSET_URL}', ASSET_URI)
	s = s.replace('${ASSET_ZONE}', ASSET_ZONE)
	s = s.replace('${TS_URL}', TS_URI.split('/api/')[0])
	s = s.replace('${TS_ZONE}', TS_ZONE)
	s = s.replace('${ENCODED_CLIENTID}', base64.b64encode(config.rmdAppClientId+":"+config.rmdAppSecret))
	s = s.replace('${RMD_DATASOURCE_URL}', RMD_DATASOURCE_URL)
	s = s.replace('${WEB_SOCKET_HOST}', WEB_SOCKET_HOST)
	s = s.replace('${LIVE_DATA_WS_URL}', LIVE_DATA_WS_URL)
	f = open(manifestLocation+"/manifest.yml", 'w')
	f.write(s)
	f.close()
	with open(manifestLocation+'/manifest.yml', 'r') as fin:
		print (fin.read())

def configureConnectServer(fileLocation):
	# create a backup
	if os.path.isfile(fileLocation + "/connect.js"):
		shutil.copy(fileLocation+"/connect.js", fileLocation+"/connect.js.bak")
	# copy template as manifest
	# shutil.copy(fileLocation+"/connect.js.template", fileLocation+"/connect.js")
	s = open(fileLocation+"/connect.js").read()
	s = s.replace('${clientId}', config.rmdAppClientId)
	s = s.replace('${secret}', config.rmdAppSecret)
	s = s.replace('${UAA_SERVER_URL}', UAA_URI)
	s = s.replace('${ASSET_URL}', ASSET_URI)
	s = s.replace('${ASSET_ZONE}', ASSET_ZONE)
	s = s.replace('${TS_URL}', TS_URI.split('/api/')[0])
	s = s.replace('${TS_ZONE}', TS_ZONE)
	s = s.replace('${ENCODED_CLIENTID}', base64.b64encode(config.rmdAppClientId+":"+config.rmdAppSecret))
	s = s.replace('${RMD_DATASOURCE_URL}', RMD_DATASOURCE_URL)
	s = s.replace('${LIVE_DATA_WS_URL}', LIVE_DATA_WS_URL)
	f = open(fileLocation+"/connect.js", 'w')
	f.write(s)
	f.close()
	with open(fileLocation+'/connect.js', 'r') as fin:
		print (fin.read())

def updateUAAUsers(serviceGroups):
	groups = serviceGroups.split(",")
	#print (groups)
	for group in groups:
		#print (group)
		addAdminUserPolicyGroup(group,"RMD_admin_1")
		addAdminUserPolicyGroup(group,"RMD_user_1")


#######################################
# Begin Main script
#######################################
import subprocess
import sys,getopt
import os
import json
import urllib
import urllib2
import base64
import random
import string
import shutil
import time
import getopt
import argparse
import installConfig as config


print ('environment : '+config.environment)
print("****************** Installing Reference Application ******************")

#setup Redis
result = []
process = subprocess.Popen('cf m',
    shell=True,
    stdout=subprocess.PIPE,
    stderr=subprocess.PIPE )
for line in process.stdout:
    result.append(line)
errcode = process.returncode
#print (errcode)
search_redis = config.predixRedis
for line in result:
	if(line.find(search_redis) > -1):
		#print(line)
		config.predixRedis = line.split()[0].strip()
		print ("Setting Redis config.predixRedis as "+ config.predixRedis)

#setUpRefAppWorkingDirectory()
if config.pullsubmodules == 'y':
	checkoutSubmodules()
	print "Build using maven setting : "+config.mvnsettings +" Maven Repo : "+config.mavenRepo
if config.mavenRepo != "":
	os.removedirs(config.mavenRepo)
	#statementStatus  = subprocess.call("rm -rf "+config.mavenRepo, shell=True)
	statementStatus  = subprocess.call("mvn clean package -s "+config.mvnsettings+" -Dmaven.repo.local="+config.mavenRepo, shell=True)
else:
	 #statementStatus  = subprocess.call("rm -rf ~/.m2/repository/com/ge/predix/", shell=True)
	 statementStatus  = subprocess.call("mvn clean package -s "+config.mvnsettings, shell=True)
	 if statementStatus != 0:
		print("Maven build failed.")
		sys.exit(1);
# these two are modified by some other functions.
clientAuthorites = list(config.clientAuthorites)
clientScope = list(config.clientScope)

# Deleting existing Applications and Services
deleteExistingApplications()
print "Delete Services>? : "+config.cleanDeployment
if config.cleanDeployment in ('y','Y'):
	deleteExistingServices()
	#create a UAA instanse
	createPredixUAASecurityService()

#Bind to Predix Boot
deployAndBindUAAToPredixBoot()
uaaIssuerId,UAA_URI,uaaZoneHttpHeaderName,uaaZoneHttpHeaderValue = getPredixUAAConfigfromVcaps()
print("****************** UAA configured As ******************")
print ("\n uaaIssuerId = " + uaaIssuerId + "\n UAA_URI = " + UAA_URI + "\n "+uaaZoneHttpHeaderName+" = " +uaaZoneHttpHeaderValue+"\n")
print("****************** ***************** ******************")

if config.cleanDeployment in ('y','Y'):
	#Create Client Id and Users
	createClientIdAndAddUser()

# acs integration
createBindPredixACSService(config.rmdAcsName)
ACS_URI,acsPredixZoneHeaderName,acsPredixZoneHeaderValue,acsOauthScope = getPredixACSConfigfromVcaps()
print("****************** ACS configured As ******************")
print ("\n ACS_URI = " + ACS_URI + "\n "+acsPredixZoneHeaderName+"= " +acsPredixZoneHeaderValue)
print (" ACS zone "+acsOauthScope)
print("****************** ***************** ******************")

#ACS integration
clientAuthorites.append(acsOauthScope)
updateUsersClientId()

# setting up ACS policy and Subject
createRefAppACSPolicyAndSubject(acsPredixZoneHeaderValue)

if config.cleanDeployment in ('y','Y'):
	# create a Asset Service
	print("****************** Predix Asset Timeseries ******************")
	createAsssetInstance(config.rmdPredixAssetName,config.predixAssetService)

	# create a Timeseries
	createTimeSeriesInstance(config.rmdPredixTimeseriesName,config.predixTimeSeriesService)

bindService(config.predixbootAppName,config.rmdPredixAssetName)
bindService(config.predixbootAppName,config.rmdPredixTimeseriesName)

DATA_INGESTION_URL=''
RMD_DATASOURCE_URL=''
WEB_SOCKET_HOST=''
LIVE_DATA_WS_URL=''
formattedJson = getVcapJsonForPredixBoot()
ASSET_URI,ASSET_ZONE = getAssetURLandZone(formattedJson)
TS_URI,TS_ZONE = getTimeseriesURLandZone(formattedJson)
assetScopes,timeSeriesInjestScopes,timeSeriesQueryScopes = getClientAuthoritiesforAssetAndTimeSeriesService(getVcapJsonForPredixBoot())

clientAuthorites.append(assetScopes)
clientAuthorites.append(timeSeriesInjestScopes)
clientAuthorites.append(timeSeriesQueryScopes)
clientScope.append(assetScopes)
clientScope.append(timeSeriesInjestScopes)
clientScope.append(timeSeriesQueryScopes)

updateClientId()
updateUAAUsers(timeSeriesQueryScopes+","+timeSeriesInjestScopes+","+assetScopes)


dataSeedRepoName = "data-seed-service"
configureManifest(dataSeedRepoName)
deployProject('cf push '+config.dataSeedAppName+' -f '+dataSeedRepoName+'/manifest.yml',dataSeedRepoName)



cfTarget= subprocess.check_output(["cf", "app",config.dataSeedAppName])
print (cfTarget)
dataSeedUrl="https://"+cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
#calling data loading on dataseedURl
curlStatement = "curl -F \"username=${rmdUser1}\" -F \"password=${rmdUser1Pass}\" -F \"file=@./${dataSeedRepoName}/src/main/resources/rmdapp/AssetData.xls\" "
curlStatement = curlStatement.replace('${rmdUser1}', config.rmdUser1)
curlStatement = curlStatement.replace('${rmdUser1Pass}', config.rmdUser1Pass)
curlStatement = curlStatement.replace('${dataSeedRepoName}', dataSeedRepoName)
curlStatement = curlStatement+" "+dataSeedUrl+"/login"
print (str(curlStatement))
statementStatus= subprocess.call(str(curlStatement), shell=True)
print (statementStatus)

dataSourceRepoName = "rmd-datasource"
configureManifest(dataSourceRepoName)
deployProject('cf push '+config.dataSourceAppName+' -f '+dataSourceRepoName+'/manifest.yml',dataSourceRepoName)

cfTarget= subprocess.check_output(["cf", "app",config.dataSourceAppName])
print (cfTarget)
RMD_DATASOURCE_URL="http://"+cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
print ('Data dataSourceAppName URL '+RMD_DATASOURCE_URL)


#postgreJsonrequest = "cf cs "+config.predixPostgre+" "+config.predixPostgrePlan+" "+config.rmdPostgre
#print ("Creating Postgre cmd "+postgreJsonrequest)
#statementStatus  = subprocess.call(postgreJsonrequest, shell=True)

#httpDatariverRepoName = "predix-http-datariver"
#checkoutDeploytHttpRiver(httpDatariverRepoName,"",httpDataRiverAppName)

#https://github.build.ge.com/adoption/predix-websocket-server.git
websocketServerRepoName = "predix-websocket-server"
configureManifest(websocketServerRepoName)
deployProject('cf push '+config.websocketAppName+' -f '+websocketServerRepoName+'/manifest.yml',websocketServerRepoName)

cfTarget= subprocess.check_output(["cf", "app",config.websocketAppName])
print (cfTarget)
WEB_SOCKET_HOST=cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
print ('WS ingestion URL '+WEB_SOCKET_HOST)
LIVE_DATA_WS_URL="wss://"+WEB_SOCKET_HOST+"/livestream"
print ('LIVE_DATA_WS_URL '+LIVE_DATA_WS_URL)


dataIngestionRepoName = "dataingestion-service"
configureManifest(dataIngestionRepoName)
deployProject('cf push '+config.dataIngestionAppName+' -f '+dataIngestionRepoName+'/manifest.yml',dataIngestionRepoName)


cfTarget= subprocess.check_output(["cf", "app",config.dataIngestionAppName])
print (cfTarget)
DATA_INGESTION_URL="https://"+cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
print ('Data Ingestion URL '+DATA_INGESTION_URL)


machineSimulatorRepoName = "machinedata-simulator"
configureManifest(machineSimulatorRepoName)
deployProject('cf push '+config.machineSimulatorAppName+' -f '+machineSimulatorRepoName+'/manifest.yml',machineSimulatorRepoName)

print("*********Deploying UI application********************")
radisJsonrequest = "cf cs "+config.predixRedis+" "+config.predixRedisPlan+" "+config.rmdRedis
print ("Creating Redis cmd "+radisJsonrequest)
statementStatus = subprocess.call(radisJsonrequest, shell=True)

uiRepoName = "rmd-ref-app-ui"
checkoutAndDeployUI(uiRepoName, config.uiAppName)

print("********* DONE deploying UI application ********************")


stopSimulatorRequest = "cf stop "+config.machineSimulatorAppName
statementStatus  = subprocess.call(stopSimulatorRequest, shell=True)

restageApplication(config.predixbootAppName)
print("***********************Restage Predix Boot Completed**********************")

# Sanity checks:
jsonrequest = "cf apps | grep "+config.instanceAppender
statementStatus  = subprocess.call(jsonrequest, shell=True)

jsonrequest = "cf s | grep "+ config.instanceAppender
statementStatus  = subprocess.call(jsonrequest, shell=True)

cfTarget= subprocess.check_output(["cf", "app",config.uiAppName])
print (cfTarget)
uiUrl="https://"+cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()

print("*******************************************")
print("**************** SUCCESS!! ****************")
print("*******************************************")
print ('Visit your live Reference App in the browser: '+ uiUrl)
print ('(Optional) Visit the DataSeedService to load asset data in to the Predix Reference App: '+dataSeedUrl)
print ('(Optional) Start the machine data simulator with this command: cf start ' + config.machineSimulatorAppName)
