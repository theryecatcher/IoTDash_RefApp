
# Function to check out of GitHub
def checkoutProject(gitUrl ,git_branch):
	print("Getting project from "+gitUrl)
	statementStatus  = subprocess.call('git clone --branch '+git_branch+' '+gitUrl, shell=True)
	if statementStatus == 1 :
		sys.exit("Error cloning project"+GITHUB_HOST+predixProject)

	return statementStatus

#Sets up a working directory
def setUpRefAppWorkingDirectory():
	
	if os.path.exists(BASE_PREDIX_DIR):
		shutil.rmtree(BASE_PREDIX_DIR)

	os.makedirs(BASE_PREDIX_DIR)
	print("Setting working Directory as "+BASE_PREDIX_DIR)
	os.chdir(BASE_PREDIX_DIR)		

# build project
def buildProject(mavenCommand,projectDir):
	statementStatus  = subprocess.call(mavenCommand, shell=True)
	if statementStatus == 1 :
		sys.exit("Error building the project "+projectDir)

	return statementStatus	

# deploy project
def deployProject(cfCommand,projectDir):
	print("Deploying project as  "+cfCommand)
	statementStatus  = subprocess.call(cfCommand, shell=True)
	if statementStatus == 1 :
		sys.exit("Error deploying the project"+projectDir)

	return statementStatus		

# Check Requirements : cf 
def checkRequirements():
	try:
		cfTarget= subprocess.check_output(["cf", "target"])
		print (cfTarget)
		user=cfTarget.split('User:')[1].split('Org:')[0]
		org=cfTarget.split('Org:')[1].split('Space:')[0]
		space=cfTarget.split('Space')[1]
		print("cf login detected")
		return (user.strip(),org,space)	
	except subprocess.CalledProcessError as e:
		  sys.exit( "Please login to Cf ")
	

def deleteExistingApplications():
	#create Predix Boot instance

	deleteRequest = "cf delete -f -r " +predixbootAppName
	statementStatus  = subprocess.call(deleteRequest, shell=True)
	if statementStatus == 1 :
		print("Error creating a deleting service instance" +deleteRequest)
	
	return statementStatus					

def deleteExistingServices():
	#delete UAA instance

	deleteRequest = "cf delete-service -f "
	statementStatus  = subprocess.call(deleteRequest+rmdUaaName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdUaaName)

	statementStatus  = subprocess.call(deleteRequest+rmdAcsName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdAcsName)	

	statementStatus  = subprocess.call(deleteRequest+rmdPredixAssetName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdPredixAssetName)

	statementStatus  = subprocess.call(deleteRequest+rmdPredixTimeseriesName, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdPredixTimeseriesName)	
	
	statementStatus  = subprocess.call(deleteRequest+rmdPostgre, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdPostgre)
	
	statementStatus  = subprocess.call(deleteRequest+rmdRedis, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a deleting service instance" +rmdRedis)						
		
	return statementStatus			

def createPredixUAASecurityService():
	#create UAA instance
	uaaJsonrequest = "cf cs "+predixUaaService+" "+predixUaaServicePlan +" "+rmdUaaName+ " -c \'{\"adminClientSecret\": \""+uaaAdminSecret+"\"}\'" 
	print uaaJsonrequest
	statementStatus  = subprocess.call(uaaJsonrequest, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a uaa service instance")
	return statementStatus	

def getVcapJsonForPredixBoot ():
	predixBootEnv = subprocess.check_output(["cf", "env" ,predixbootAppName])
	systemProvidedVars=predixBootEnv.split('System-Provided:')[1].split('No user-defined env variables have been set')[0]
	formattedJson = systemProvidedVars.replace("\n","").replace("'","").replace("}{","},{")
	return "["+formattedJson+"]"

def addUAAUser(userId , password, email):
	addUserCommand = "uaac user add "+userId +" -p "+password+" --emails "+email
	statementStatus  = subprocess.call(addUserCommand, shell=True)
	if statementStatus == 1 :
		sys.exit("Error Adding a User")


def deployAndBindUAAToPredixBoot():
	checkoutProject(GITHUB_HOST+predixProject , git_branch)
	# change directory to the project
	os.chdir(projectDir)
	# mvn clean on the project
	buildProject('mvn clean package',projectDir)
	#change to the predix-boot-cf
	os.chdir("predix-boot-cf")
	#deploy
	deployProject('cf push '+predixbootAppName,projectDir)
	statementStatus  = subprocess.call("cf bs "+predixbootAppName +" " + rmdUaaName , shell=True)
	if statementStatus == 1 :
			sys.exit("Error binding a uaa service instance to boot ")

	statementStatus  = subprocess.call("cf restage "+predixbootAppName, shell=True)		
	if statementStatus == 1 :
			sys.exit("Error restaging a uaa service instance to boot")


def createClientIdAndAddUser():
	statementStatus  = subprocess.call("uaac  target "+UAA_URI + "  --skip-ssl-validation", shell=True)
	if statementStatus == 1 :
		sys.exit("Error targeting to the UAA instance ")

	# uaac token client get admin -s rmd_uaa_secret
	statementStatus  = subprocess.call("uaac token client get admin -s "+uaaAdminSecret, shell=True)
	if statementStatus == 1 :
		sys.exit("Error binding a Login admin for the UAA instance ")

	# create a client id 
	
	print("****************** Creating client id ******************")
	uaaAddClientRequest =  " --authorized_grant_types authorization_code,client_credentials,refresh_token,password --autoapprove openid "

	uaaAddClientRequest  = uaaAddClientRequest+clientAuthorites+clientScope
	uuacCommandAddClient = " uaac client add " +rmdAppClientId+ " -s "+rmdAppSecret +" "+uaaAddClientRequest
	#uaac client add mvp3_ref_app --scope uaa.none,openid --authorized_grant_types authorization_code,client_credentials,refresh_token,password --authorities uaa.resource,uaa.none --autoapprove openid -s mvp3ref@pp 	
	print uuacCommandAddClient
	statementStatus  = subprocess.call(uuacCommandAddClient, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a uaa client id")

	# Add users 
	print("****************** Adding users ******************")
	addUAAUser("rmd_user_1" , "RMD_user_1", "rmd_user_1@gegrctest.ge.com")
	addUAAUser("rmd_admin_1" , "RMD_admin_1", "rmd_admin_1@gegrctest.com")

def createBindPredixACSService(rmdAcsName):
	#create UAA instance
	acsJsonrequest = "cf cs "+predixAcsService+" "+predixAcsServicePlan +" "+rmdAcsName+ " -c \'{\"trustedIssuerIds\": [ \""+uaaIssuerId+"\"] }\'" 
	print acsJsonrequest
	statementStatus  = subprocess.call(acsJsonrequest, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a uaa service instance")

	statementStatus  = subprocess.call("cf bs "+predixbootAppName +" " + rmdAcsName , shell=True)
	if statementStatus == 1 :
			sys.exit("Error binding a uaa service instance to boot ")


	statementStatus  = subprocess.call("cf restage "+predixbootAppName, shell=True)		
	if statementStatus == 1 :
			sys.exit("Error restaging a uaa service instance to boot")

	return statementStatus	

def addAdminUserPolicyGroup(policyGrp,userName):

	statementStatus  = subprocess.call("uaac group get "+policyGrp, shell=True)	

	if statementStatus == 1 :
		statementStatus  = subprocess.call("uaac group add "+policyGrp, shell=True)	

	acsAdminAttributes = "uaac member add "+ policyGrp+ " "+userName  
	print ("UAAC group cmd "+acsAdminAttributes)
	statementStatus  = subprocess.call(acsAdminAttributes, shell=True)
	if statementStatus == 1 :
		print ("Error adding " +userName + " to the group "+policyGrp)

def updateUsersClientId( ):
	#try:
	#	cfTarget= subprocess.check_output(["uaac", "client" , "update" ,rmdAppClientId,clientAuthorites])
	#except subprocess.CalledProcessError as e:
	#	print(e.output)
	#	sys.exit( " Error Updating the client Id  "+clientAuthorites)	
	updateClientId()
	addAdminUserPolicyGroup("acs.policies.read","RMD_admin_1")
	addAdminUserPolicyGroup("acs.policies.write","RMD_admin_1")
	addAdminUserPolicyGroup("acs.attributes.read","RMD_admin_1")
	addAdminUserPolicyGroup("acs.attributes.write","RMD_admin_1")

	addAdminUserPolicyGroup("acs.policies.read","RMD_user_1")
	addAdminUserPolicyGroup("acs.attributes.read","RMD_user_1")


def updateClientId( ):
	cmd = "uaac client update "+rmdAppClientId +clientAuthorites+clientScope
	print ("updating client cmd "+cmd)
	statementStatus  = subprocess.call(cmd , shell=True)	
	if statementStatus == 1 :
		sys.exit("Error updating client for zone" +cmd)

def getTokenFromUAA():
	url = uaaIssuerId
	oauthRelam = rmdAppClientId+":"+rmdAppSecret
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

def createRefAppACSZone():
	adminUserTOken = getTokenFromUAA()
	#print("adminUserTOken  createRefAppACSZone() "+ adminUserTOken)
	rmd_app_acs_zone_body = {
	    "name": "refapp-acs-zone",
	    "subdomain": "rmdsubdomain",
	    "description": "ACS zone for RMD reference application",
	    "issuers": [
	        {
	            "issuerId": "$issuerId",
	            "issuerCheckTokenUrl": "$checktokenuri"
	        }
	    ]
	}

	acsZoneBodyStr = json.dumps(rmd_app_acs_zone_body)
	acsZoneBody = acsZoneBodyStr.replace("$issuerId",uaaIssuerId).replace("$checktokenuri",uaaIssuerId)

	headers = ' -H "Authorization:'+adminUserTOken+'\" -H \"Content-Type: application/json\" '+' -H \"'+acsPredixZoneHeaderName+':'+acsPredixZoneHeaderValue+"\""
	acsCurl = "curl -X PUT "+ACS_URI+"/v1/zone/refapp-acs-zone " +"-d '"+acsZoneBody+"'"+headers
	print ("Creating ACS zone "+acsCurl)
	statementStatus  = subprocess.call(acsCurl, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating policy zone" )
	else :	
		print("Success creating "+"refapp-acs-zone")	

def createRefAppACSPolicy():
	adminUserTOken = getTokenFromUAA()
	headers = ' -H "Authorization:'+adminUserTOken+'\" -H \"Content-Type: application/json\" '
	headers = headers + ' -H "Acs-Zone-Subdomain:rmdsubdomain"'
	acsPolicyCurl = "curl -X PUT "+ACS_URI+"/v1/policy-set/refapp-acs-policy -v " +" -d ./acs/rmd_app_policy.json"+headers
	print ("Adding ACS policy "+acsPolicyCurl)
	statementStatus  = subprocess.call(acsPolicyCurl, shell=True)
	print(statementStatus)
	if statementStatus == 1 :
		sys.exit("Error creating policy zone" )

def createUserAttributes(): 

	adminUserTOken = getTokenFromUAA()
	headers = ' -H "Authorization:'+adminUserTOken+'\" -H \"Content-Type: application/json\" '
	headers = headers + ' -H "Acs-Zone-Subdomain:rmdsubdomain"'

	acsSubjectCurl = "curl -X PUT "+ACS_URI+"/v1/subject/rmd_admin_1 -v" +" -d ./acs/rmd_admin_1_role_attribute.json"+headers
	print ("Adding Subject "+acsSubjectCurl)
	statementStatus  = subprocess.call(acsSubjectCurl, shell=True)

	acsSubjectCurl = "curl -X PUT "+ACS_URI+"/v1/subject/rmd_user_1 -v" +" -d ./acs/rmd_user_1_role_attribute.json"+headers
	print ("Adding Subject "+acsSubjectCurl)		
	statementStatus  = subprocess.call(acsSubjectCurl, shell=True)

def createAsssetInstance(rmdPredixAssetName ,predixAssetName ):
	assetJsonrequest = "cf cs "+predixAssetName+" "+predixAssetServicePlan +" "+rmdPredixAssetName+ " -c \'{\"trustedIssuerIds\": [\""+uaaIssuerId+"\"]}\'" 
	print ("Creating Service cmd "+assetJsonrequest)
	statementStatus  = subprocess.call(assetJsonrequest, shell=True)
	#if statementStatus == 1 :
		#sys.exit("Error creating a assset service instance")	

def createTimeSeriesInstance(rmdPredixTimeSeriesName,predixTimeSeriesName):
	tsJsonrequest = "cf cs "+predixTimeSeriesName+" "+predixTimeSeriesServicePlan +" "+rmdPredixTimeSeriesName+ " -c \'{\"trustedIssuerIds\": [\""+uaaIssuerId+"\"]}\'" 
	print ("Creating Service cmd "+tsJsonrequest)
	statementStatus  = subprocess.call(tsJsonrequest, shell=True)
	if statementStatus == 1 :
		sys.exit("Error creating a assset service instance")

def getPredixUAAConfigfromVcaps():
	formattedJson = getVcapJsonForPredixBoot()
	d = json.loads(formattedJson)
	uaaIssuerId =  d[0]['VCAP_SERVICES'][predixUaaService][0]['credentials']['issuerId']
	UAA_URI = d[0]['VCAP_SERVICES'][predixUaaService][0]['credentials']['uri']
	uaaZoneHttpHeaderName = d[0]['VCAP_SERVICES'][predixUaaService][0]['credentials']['zone']['http-header-name']
	uaaZoneHttpHeaderValue = d[0]['VCAP_SERVICES'][predixUaaService][0]['credentials']['zone']['http-header-value']
	return (uaaIssuerId ,UAA_URI,uaaZoneHttpHeaderName ,uaaZoneHttpHeaderValue)	

def getPredixACSConfigfromVcaps():
	formattedJson = getVcapJsonForPredixBoot()
	d = json.loads(formattedJson)
	ACS_URI = d[0]['VCAP_SERVICES'][predixAcsService][0]['credentials']['uri']
	acsPredixZoneHeaderName = d[0]['VCAP_SERVICES'][predixAcsService][0]['credentials']['zone']['http-header-name']
	acsPredixZoneHeaderValue = d[0]['VCAP_SERVICES'][predixAcsService][0]['credentials']['zone']['http-header-value']
	acsOauthScope = d[0]['VCAP_SERVICES'][predixAcsService][0]['credentials']['zone']['oauth-scope']
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
	assetZone = d[0]['VCAP_SERVICES'][predixAssetService][0]['credentials']['instanceId']
	assetUrl = d[0]['VCAP_SERVICES'][predixAssetService][0]['credentials']['uri']
	return assetUrl,assetZone

def getTimeseriesURLandZone(formattedVcapJson):	 
	timeseriesUrl = ''
	timeseriesZone =''
	d = json.loads(formattedJson)
	timeseriesZone = d[0]['VCAP_SERVICES'][predixTimeSeriesService][0]['credentials']['query']['zone-http-header-value']
	timeseriesUrl = d[0]['VCAP_SERVICES'][predixTimeSeriesService][0]['credentials']['query']['uri']
	return timeseriesUrl,timeseriesZone	

def getClientAuthoritiesforAssetAndTimeSeriesService(formattedVcapJson):
	d = json.loads(formattedJson)
	 
	assetAuthorities = predixAssetService+".zones."+d[0]['VCAP_SERVICES'][predixAssetService][0]['credentials']['instanceId']+".user"
	#get Ingest authorities	
	tsInjest = d[0]['VCAP_SERVICES'][predixTimeSeriesService][0]['credentials']['ingest']
	timeSeriesInjestAuthorities = tsInjest['zone-token-scopes'][0] +"," + tsInjest['zone-token-scopes'][1] 
	# get query authorities
	tsQuery = d[0]['VCAP_SERVICES'][predixTimeSeriesService][0]['credentials']['query']
	timeSeriesQueryAuthorities = tsQuery['zone-token-scopes'][0] +"," + tsQuery['zone-token-scopes'][1]
    
	print ("returning timeseries client zone scopes query -->"+timeSeriesQueryAuthorities + " timeSeriesInjestAuthorities -->"+timeSeriesInjestAuthorities )

	return assetAuthorities,timeSeriesInjestAuthorities,timeSeriesQueryAuthorities



def checkoutAndDeploy(repoName,manifestLocation,appDeploymentName):
	print ("deploying"+repoName)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)
	print ("Changing the Base dire to "+os.getcwd())
	checkoutProject(GITHUB_HOST+repoName+".git" , git_branch)
	os.chdir(repoName)
	if(manifestLocation):
		os.chdir(manifestLocation)
	print ("Changing the Base repoName to "+os.getcwd())
	buildProject('mvn clean package',repoName)
	configureManifest()
	deployProject('cf push '+appDeploymentName,projectDir)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)	
	
def checkoutDeploytHttpRiver(repoName,manifestLocation,appDeploymentName):
	print ("deploying"+repoName)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)
	print ("Changing the Base dire to "+os.getcwd())
	gitUrl = GITHUB_HOST+repoName+".git" 
	print("Getting project from "+gitUrl)
	statementStatus  = subprocess.call('git clone '+gitUrl, shell=True)
	if statementStatus == 1 :
		sys.exit("Error cloning project"+GITHUB_HOST+predixProject)
	os.chdir(repoName)
	if(manifestLocation):
		os.chdir(manifestLocation)
	print ("Changing the Base repoName to "+os.getcwd())
	configureManifest()
	statementStatus  = subprocess.call('cf push '+appDeploymentName, shell=True)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)
	
	
def checkoutAndDeployUI(repoName,manifestLocation,appDeploymentName):
	print ("deploying"+repoName)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)
	print ("Changing the Base dire to "+os.getcwd())
	checkoutProject(GITHUB_HOST+repoName+".git" , git_branch)
	os.chdir(repoName)
	if(manifestLocation):
		os.chdir(manifestLocation)
	print ("Changing the Base repoName to "+os.getcwd())
	statementStatus  = subprocess.call("npm install", shell=True)
	statementStatus  = subprocess.call("bower install", shell=True)
	statementStatus  = subprocess.call("grunt dist", shell=True)
	configureManifest()
	deployProject('cf push '+appDeploymentName,projectDir)
	os.chdir(BASE_DIR+"/"+BASE_PREDIX_DIR)				


def configureManifest():
	# create a backup
	shutil.copy("manifest.yml", "manifest.yml.bak")
	# copy template as manifest
	shutil.copy("manifest.yml.template", "manifest.yml")
	s = open("manifest.yml").read()
	s = s.replace('${assetService}', rmdPredixAssetName)
	s = s.replace('${uaaService}', rmdUaaName)
	s = s.replace('${acsService}', rmdAcsName)
	s = s.replace('${oauthRestHost}', UAA_URI.replace('https://',''))
	s = s.replace('${clientId}', rmdAppClientId)
	s = s.replace('${secret}', rmdAppSecret)
	s = s.replace('${acsURI}', ACS_URI)
	s = s.replace('${timeSeriesService}', rmdPredixTimeseriesName)
	s = s.replace('${acssubdomain}', 'rmdsubdomain')
	s = s.replace('${postgresqService}', rmdPostgre)
	s = s.replace('${dataIngestionUrl}', DATA_INGESTION_URL)
	s = s.replace('${sessionService}', rmdRedis)
	s = s.replace('${UAA_SERVER_URL}', UAA_URI)
	s = s.replace('${ASSET_URL}', ASSET_URI)
	s = s.replace('${ASSET_ZONE}', ASSET_ZONE)
	s = s.replace('${TS_URL}', TS_URI.split('/api/')[0])
	s = s.replace('${TS_ZONE}', TS_ZONE)
	s = s.replace('${ENCODED_CLIENTID}', base64.b64encode(rmdAppClientId+":"+rmdAppSecret))
	s = s.replace('${RMD_DATASOURCE_URL}', RMD_DATASOURCE_URL)
	s = s.replace('${WEB_SOCKET_HOST}', WEB_SOCKET_HOST)
	s = s.replace('${LIVE_DATA_WS_URL}', LIVE_DATA_WS_URL)
	f = open("manifest.yml", 'w')
	f.write(s)
	f.close()
	with open('manifest.yml', 'r') as fin:
		print fin.read()

def updateUAAUsers(serviceGroups):
	groups = serviceGroups.split(",")
	print groups
	for group in groups: 
		print group
		addAdminUserPolicyGroup(group,"RMD_admin_1")
		addAdminUserPolicyGroup(group,"RMD_user_1")
		
 		
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

print("****************** Installing Reference Application ******************")
      
# check check login
user,org,space = checkRequirements()
instanceAppender = user.strip().split("@")[0].replace('.','_')
instanceAppender=''
print 'using Appender', instanceAppender


git_branch="develop"

# check or create a directory for Reference application
BASE_DIR = os.getcwd()
BASE_PREDIX_DIR = "PredixApps"
setUpRefAppWorkingDirectory()

# Reference App Service Instance Names 
rmdUaaName = "ogdf_uaa_"+instanceAppender
rmdAcsName = "ogdf_acs_"+instanceAppender
rmdPredixAssetName = "ogdf_asset_"+instanceAppender
rmdPredixTimeseriesName = "ogdf_time_series_"+instanceAppender
rmdPostgre="ogdf_postgre_"+instanceAppender
rmdRedis="ogdf_redis_"+instanceAppender

# Predix Application Names
predixbootAppName="predix_boot_cf_"+instanceAppender


# Predix Service Instance Name for VPC
predixUaaService = "predix-uaa-sysint"
predixAcsService = "predix-acs-sysint"
predixAssetService = "predix-asset-sysint"
predixTimeSeriesService = "predix-timeseries-sysint"
predixPostgre = "rdpg"
predixRedis = "p-redis"

predixUaaServicePlan = "free"
predixAcsServicePlan = "free"
predixAssetServicePlan = "Free"
predixTimeSeriesServicePlan = "Free"
predixPostgrePlan = "Free"
predixRedisPlan = "shared-vm"


#Reference application client id 
rmdAppClientId = "mvp3_ref_app"
rmdAppSecret= "mvp3ref@pp"
uaaAdminSecret="rmd_uaa_secret"
clientAuthorites = " --authorities openid,acs.policies.read,acs.policies.write,acs.attributes.read,acs.attributes.write,uaa.resource,uaa.none"
clientScope = " --scope uaa.none,openid,acs.policies.read,acs.policies.write,acs.attributes.read,acs.attributes.write"



#GITHUB_HOST = "https://github.com/predix/"
GITHUB_HOST = "https://github.build.ge.com/adoption/"
projectDir = "predix-boot"
predixProject = projectDir+".git"

# Deleting existing Applications and Services 
deleteExistingApplications()
deleteExistingServices()

#create a UAA instanse 
createPredixUAASecurityService()

#Bind to Predix Boot
deployAndBindUAAToPredixBoot()
uaaIssuerId,UAA_URI,uaaZoneHttpHeaderName,uaaZoneHttpHeaderValue = getPredixUAAConfigfromVcaps()
print("****************** UAA configured As ******************")
print ("\n uaaIssuerId = " + uaaIssuerId + "\n UAA_URI = " + UAA_URI + "\n "+uaaZoneHttpHeaderName+" = " +uaaZoneHttpHeaderValue+"\n")
print("****************** ***************** ******************")

#Create Client Id and Users
createClientIdAndAddUser()

# acs integration
createBindPredixACSService(rmdAcsName)
ACS_URI,acsPredixZoneHeaderName,acsPredixZoneHeaderValue,acsOauthScope = getPredixACSConfigfromVcaps()
print("****************** UAA configured As ******************")
print ("\n ACS_URI = " + ACS_URI + "\n "+acsPredixZoneHeaderName+"= " +acsPredixZoneHeaderValue)
print (" ACS zone "+acsOauthScope)
print("****************** ***************** ******************")

#ACS integration
clientAuthorites = clientAuthorites +","+acsOauthScope
updateUsersClientId()
##TcreateRefAppACSZone()
##TcreateRefAppACSPolicy()
##TcreateUserAttributes()
#print (" END call are failing " )

# create a Asset Service
print("****************** Predix Asset Timeseries ******************")
createAsssetInstance(rmdPredixAssetName,predixAssetService)

# create a Timeseries
createTimeSeriesInstance(rmdPredixTimeseriesName,predixTimeSeriesService)

bindService(predixbootAppName,rmdPredixAssetName)
bindService(predixbootAppName,rmdPredixTimeseriesName)
restageApplication(predixbootAppName)
print("***********************Restage Predix Boot Completed**********************")

DATA_INGESTION_URL=''
RMD_DATASOURCE_URL=''
WEB_SOCKET_HOST=''
LIVE_DATA_WS_URL=''
formattedJson = getVcapJsonForPredixBoot()
ASSET_URI,ASSET_ZONE = getAssetURLandZone(formattedJson)
TS_URI,TS_ZONE = getTimeseriesURLandZone(formattedJson)
assetScopes,timeSeriesInjestScopes,timeSeriesQueryScopes = getClientAuthoritiesforAssetAndTimeSeriesService(getVcapJsonForPredixBoot())

clientAuthorites = clientAuthorites +","+assetScopes+","+timeSeriesInjestScopes+","+timeSeriesQueryScopes
clientScope = clientScope + ","+assetScopes+","+timeSeriesInjestScopes+","+timeSeriesQueryScopes
updateClientId()
updateUAAUsers(timeSeriesQueryScopes+","+timeSeriesInjestScopes+","+assetScopes)






	

	
























