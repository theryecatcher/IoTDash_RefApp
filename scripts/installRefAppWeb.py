# Function to check out of GitHub
def checkoutProject(gitUrl, git_branch):
    print("Getting project from "+gitUrl)
    statementStatus = subprocess.call('git clone --branch '+git_branch+' '+gitUrl, shell=True)
    if statementStatus == 1:
        sys.exit("Error cloning project: " + gitUrl)

    return statementStatus


# deploy project
def deployProject(cfCommand, projectDir):
    print("Deploying project as  "+cfCommand)
    statementStatus = subprocess.call(cfCommand, shell=True)
    if statementStatus == 1:
        sys.exit("Error deploying the project"+projectDir)

    return statementStatus


def checkoutAndDeployUI(repoName, manifestLocation, appDeploymentName):
    print ("deploying"+repoName)
    os.chdir(config.BASE_DIR+"/"+config.BASE_PREDIX_DIR)

    shutil.rmtree(repoName)

    print ("Changing the Base dir to "+os.getcwd())
    checkoutProject(config.GITHUB_HOST+repoName+".git", config.git_branch)
    os.chdir(repoName)
    if(manifestLocation):
        os.chdir(manifestLocation)
    # print ("Changing the Base repoName to "+os.getcwd())
    statementStatus = subprocess.call("npm install", shell=True)
    statementStatus = subprocess.call("bower install", shell=True)
    statementStatus = subprocess.call("grunt dist", shell=True)
    configureUIManifest()
    print('cf push ' + appDeploymentName, repoName)
    deployProject('cf push ' + appDeploymentName, repoName)
    os.chdir(config.BASE_DIR+"/"+config.BASE_PREDIX_DIR)
    return statementStatus


def getVcapJsonForPredixBoot():
    predixBootEnv = subprocess.check_output(["cf", "env", config.predixbootAppName])
    systemProvidedVars=predixBootEnv.split('System-Provided:')[1].split('No user-defined env variables have been set')[0]
    formattedJson = systemProvidedVars.replace("\n","").replace("'","").replace("}{","},{")
    d = json.loads("["+formattedJson+"]")
    UAA_URI = d[0]['VCAP_SERVICES'][config.predixUaaService][0]['credentials']['uri']
    ASSET_ZONE = d[0]['VCAP_SERVICES'][config.predixAssetService][0]['credentials']['instanceId']
    ASSET_URL = d[0]['VCAP_SERVICES'][config.predixAssetService][0]['credentials']['uri']
    TS_ZONE = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['query']['zone-http-header-value']
    TS_URL = d[0]['VCAP_SERVICES'][config.predixTimeSeriesService][0]['credentials']['query']['uri']
    return UAA_URI,ASSET_URL,ASSET_ZONE,TS_URL,TS_ZONE


def configureUIManifest():
    # create a backup
    shutil.copy("manifest.yml", "manifest.yml.bak")
    # copy template as manifest
    shutil.copy("manifest.yml.template", "manifest.yml")
    s = open("manifest.yml").read()
    s = s.replace('${assetService}', config.rmdPredixAssetName)
    s = s.replace('${uaaService}', config.rmdUaaName)
    s = s.replace('${timeSeriesService}', config.rmdPredixTimeseriesName)
    s = s.replace('${sessionService}', config.rmdRedis)
    s = s.replace('${UAA_SERVER_URL}', UAA_URI)
    s = s.replace('${ASSET_URL}', ASSET_URL)
    s = s.replace('${ASSET_ZONE}', ASSET_ZONE)
    s = s.replace('${TS_URL}', TS_URL.split('/api/')[0])
    s = s.replace('${TS_ZONE}', TS_ZONE)
    s = s.replace('${ENCODED_CLIENTID}', base64.b64encode(rmdAppClientId+":"+rmdAppSecret))
    s = s.replace('${RMD_DATASOURCE_URL}', RMD_DATASOURCE_URL)
    s = s.replace('${LIVE_DATA_WS_URL}', LIVE_DATA_WS_URL)

    f = open("manifest.yml", 'w')
    f.write(s)
    f.close()
    with open('manifest.yml', 'r') as fin:
        print fin.read()

import subprocess
import sys
import os
import argparse
import base64
import json
import shutil
import config


parser = argparse.ArgumentParser(description='Deploying WEbapplication , assumes back-end services are created')
parser.add_argument("instanceAppender", help="set the instance appender")
parser.add_argument("git_branch", help="Set up git's branch for deployment")
parser.add_argument("rmdAppClientId", help="Client id for the app")
parser.add_argument("rmdAppSecret", help="Client secret for the app")
args = parser.parse_args()
git_branch = args.git_branch
rmdAppClientId = args.rmdAppClientId
rmdAppSecret = args.rmdAppSecret
instanceAppender = args.instanceAppender


# print ('Using git_branch' +git_branch+ ' using instanceAppender '+instanceAppender )

# # check or create a directory for Reference application
# GITHUB_HOST = "https://github.build.ge.com/adoption/"
# BASE_DIR = os.getcwd()
# BASE_PREDIX_DIR = "PredixApps"
# if not os.path.exists(BASE_PREDIX_DIR):
#   os.makedirs(BASE_PREDIX_DIR)
# print("Setting working Directory as "+BASE_PREDIX_DIR)
# os.chdir(BASE_PREDIX_DIR)

# # Reference App Service Instance Names
# rmdUaaName = "rmd_uaa_"+instanceAppender
# rmdPredixAssetName = "rmd_asset_"+instanceAppender
# rmdPredixTimeseriesName = "rmd_time_series_"+instanceAppender
# rmdRedis="rmd_redis_"+instanceAppender

# # Predix Application Names
# predixbootAppName="predix_boot_cf_"+instanceAppender
# dataSourceAppName="rmd_datasource_"+instanceAppender
# dataIngestionAppName="dataingestion_service_"+instanceAppender
# uiAppName= 'rmd_ref_app_ui_'+instanceAppender

# # Predix Service Instance Name for VPC
# predixRedis = "redis-1"
# predixRedisPlan = "shared-vm"


print("*********Deploying UI application********************")
# try:
#   cfTarget= subprocess.check_output(["cf", "service",rmdRedis])
# except subprocess.CalledProcessError as e:
#   print ("Redis instance not found creating one")
#   radisJsonrequest = "cf cs "+predixRedis+" "+predixRedisPlan+" "+rmdRedis
#   print ("Creating Redis cmd "+radisJsonrequest)
#   statementStatus  = subprocess.call(radisJsonrequest, shell=True)

uiRepoName = "rmd-ref-app-ui"
UAA_URI,ASSET_URL,ASSET_ZONE,TS_URL,TS_ZONE=getVcapJsonForPredixBoot()

cfTarget= subprocess.check_output(["cf", "app",config.dataSourceAppName])
print (cfTarget)
RMD_DATASOURCE_URL="http://"+cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
print ('Data dataSourceAppName URL '+RMD_DATASOURCE_URL)

cfTarget= subprocess.check_output(["cf", "app",config.websocketAppName])
print (cfTarget)
WEB_SOCKET_HOST=cfTarget.split('urls:')[1].strip().split('last uploaded:')[0].strip()
print ('WS ingestion URL '+WEB_SOCKET_HOST)
LIVE_DATA_WS_URL="wss://"+WEB_SOCKET_HOST+"/livestream"
print ('LIVE_DATA_WS_URL '+LIVE_DATA_WS_URL)

## deploy websocket

checkoutAndDeployUI(uiRepoName, "", config.uiAppName)

print("********* DONE deploying UI application ********************")
