machinedata-simulator
=====================

Welcome to the Machine Data Simulator.  This service randomly generates data in a range that you specify in order to simulate Timeseries Data coming from a machine.  This is helpful when testing services in the cloud.

The simulator requires the [Reference App](https://github.com/PredixDev/predix-rmd-ref-app) to be installed and calls the [data-ingestion](https://github.com/PredixDev/dataingestion-service) service.   Please visit our tutorial series on [installing Reference App](https://predix.io/resources/tutorials/journey.html#Journey.Connect Devices Using Reference App).

The Data Ingestion service leverages the Reference App asset model and looks up the Asset.  The Asset model is a one-to-many of Asset to AssetMeter.  Each AssetMeter represents a Sensor and the AssetMeter object has various attributes about it.  The Data Ingestion service traverses the Asset Meters and finds the one with the matching Node Name. It then gets the Timeseries Tag attribute and pushes the data to the Predix Time Series.

Why do we not pass the Time Series tag directly?  From experience, we know that Time Series tags are transient.  For many reasons a Tag Name might change over time (bugs, changes to logic, etc). This is why we treat the Node Name as the primary key and do a look up in the Reference App asset model.  

In the future, we will provide a bypass, so the simulator can push the data to Time Series directly.


To start/stop the Simulator execute the following command

cf start machinedata-simulator

cf stop machinedata-simulator

Download the Machinedata-Simulator service

      git clone https://github.com/PredixDev/machinedata-simulator.git

Build it

      mvn clean install

Launch the service locally

      java -jar target/machinedata-simulator-1.0.2-SNAPSHOT.jar
      
Look for the log entry indicating the port used.  e.g. "Tomcat started on port(s): 8184 (http)".  

Or you can push it to the cloud

      cf push 
      or
      cf push <my-machinedata-simulator-name>
      
Stop the simulator in cloud

      cf stop <my-machinedata-simulator-name>
      
Start the simulator in cloud

      cf start <my-machinedata-simulator-name>


##Tech Stack
- Spring
- SpringBoot
- SpringTest
- Maven

##Microcomponents
- [AssetBootstrap](https://github.com/predixdev/asset-bootstrap)
- [TimeseriesBootstrap](https://github.com/predixdev/timeseries-bootstrap)
- [PredixBoot](https://github.com/predixdev/predix-boot)
- [PredixRestClient](https://github.com/predixdev/predix-boot)

### More Details
* [More GE resources](http://github.com/predixdev/predix-rmd-ref-app/docs/resources.md)
* [RMD Reference App](http://github.com/predixdev/predix-rmd-ref-app)
