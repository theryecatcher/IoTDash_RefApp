#!/bin/bash
date >starttime
BASEDIR=$(pwd)
echo $BASEDIR
cd $BASEDIR
SPACE=$(cf target | grep Space: | awk '{print $2}')
echo $SPACE
BRANCH=develop
echo $BRANCH
NEWRELIC_SVC_AND_PLAN='stc-monitoring beta-plan'
echo $NEWRELIC_SVC_AND_PLAN


echo cf delete -f $SPACE-predix-dataingestion >delete.sh
echo cf delete -f $SPACE-predix-dataseed >>delete.sh
echo cf delete -f $SPACE-predix-machinedata-simulator >>delete.sh
echo cf delete -f $SPACE-rmd-datasource >>delete.sh
echo cf delete -f $SPACE-rmd-kairosdb-app >>delete.sh
echo cf delete -f $SPACE-rmd-refapp >>delete.sh
echo cf delete -f $SPACE-rmd-ui-service >>delete.sh
echo cf ds -f newRelic >>delete.sh
echo cf ds -f predixAsset >>delete.sh
echo cf ds -f predixTimeseries >>delete.sh
echo cf ds -f viewPersistenceService  >>delete.sh
                                                                   

read -p "Push Reference App to Cloud Foundry.  Are you sure? " -n 1 -r
if [[ ! $REPLY =~ ^[Yy]$ ]]
then
    exit 1
fi

git clone https://github.build.ge.com/adoption/kairosdb-h2
git checkout 2.0

cd $BASEDIR/kairosdb-h2
cf push -t 120  $SPACE-rmd-kairosdb-app
VAR1=$(echo \'{\"queryUri\": \"https://)
VAR2=$(echo -rmd-kairosdb-app.grc-apps.svc.ice.ge.com/api/v1/datapoints/query\",\"ingestUri\": \"http://)
VAR3=$(echo -rmd-kairosdb-app.grc-apps.svc.ice.ge.com/api/v1/datapoints\"}\')
echo $VAR1
echo $VAR2
CMD=$(echo cf cups predixTimeseries -p $VAR1$SPACE$VAR2$SPACE$VAR3)
echo $CMD
eval $CMD

cf create-service $NEWRELIC_SVC_AND_PLAN newRelic
cf create-service stc-asset beta-plan predixAsset

cd $BASEDIR
git clone --branch $BRANCH https://github.build.ge.com/adoption/experience-datasource-bootstrap.git
git checkout 2.0
cd experience-datasource-bootstrap
git pull
mvn clean package
cd datasource-service
cf push -t 120 -f manifest-$SPACE.yml

mkdir -p $BASEDIR/rmd-ui-service
cd $BASEDIR
git clone --branch $BRANCH https://github.sw.ge.com/predix-integration/rmd-ui-service.git
git checkout 2.0
cd $BASEDIR/rmd-ui-service
git pull
mvn clean package
cf push -t 120 -f manifest-$SPACE.yml


VAR1=$(echo \'{\"uri\": \"https://)
VAR2=$(echo -rmd-ui-service.grc-apps.svc.ice.ge.com\"}\')
echo $VAR1
echo $VAR2
CMD=$(echo cf cups viewPersistenceService -p $VAR1$SPACE$VAR2)
echo $CMD
eval $CMD

cd $BASEDIR
git clone --branch $BRANCH https://github.sw.ge.com/adoption/rmd-predix-ui.git
git checkout 2.0
cd rmd-predix-ui
git pull
npm install
bower install
grunt dist
cf push -t 120 -f manifest-$SPACE.yml

cd $BASEDIR
git clone --branch $BRANCH https://github.build.ge.com/adoption/data-seed-service.git
git checkout 2.0
cd $BASEDIR/data-seed-service/dataseed-service/
git pull
mvn clean package
cf push -t 120 -f manifest-$SPACE.yml

cf create-service stc-postgresql-2 free postgresql93

cd $BASEDIR
git clone --branch master https://github.build.ge.com/adoption/predix-http-datariver.git
git checkout 2.0
cd predix-http-datariver
git pull
cf push -t 120 -f manifest-$SPACE.yml

cd $BASEDIR
git clone --branch $BRANCH https://github.build.ge.com/adoption/predix-dataingestion-service.git
git checkout 2.0
cd predix-dataingestion-service
git pull
mvn clean package
cf push -t 120 -f manifest-$SPACE.yml

cd $BASEDIR
git clone --branch $BRANCH https://github.build.ge.com/adoption/machinedata-simulator.git
git checkout 2.0
cd machinedata-simulator
git pull
mvn clean package
cf push -t 120 -f manifest-$SPACE.yml

echo 'sleep for 30 seconds to generate some timeseries data'
sleep 30

cf stop $SPACE-predix-machinedata-simulator

date > endtime
echo 'visit the DataSeedService to load data in to the Predix Reference App.  e.g. http://'$SPACE'-predix-dataseed.grc-apps.svc.ice.ge.com/'

