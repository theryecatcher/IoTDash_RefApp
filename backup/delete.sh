cf delete -f training3-predix-dataingestion
cf delete -f training3-predix-dataseed
cf delete -f training3-predix-machinedata-simulator
cf delete -f training3-rmd-datasource
cf delete -f training3-rmd-kairosdb-app
cf delete -f training3-rmd-refapp
cf delete -f training3-rmd-ui-service
cf ds -f newRelic
cf ds -f predixAsset
cf ds -f predixTimeseries
cf ds -f viewPersistenceService