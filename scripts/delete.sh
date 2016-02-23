cf delete -f integration-predix-dataingestion
cf delete -f integration-predix-dataseed
cf delete -f integration-predix-machinedata-simulator
cf delete -f integration-rmd-datasource
cf delete -f integration-rmd-kairosdb-app
cf delete -f integration-rmd-refapp
cf delete -f integration-rmd-ui-service
cf ds -f newRelic
cf ds -f predixAsset
cf ds -f predixTimeseries
cf ds -f viewPersistenceService

cf delete-orphaned-routes -f