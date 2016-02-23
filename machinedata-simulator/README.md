machinedata-simulator
=====================

Welcome to the Machine Data Simulator.  This service randomly generates data in a range that you specify in order to simulate Timeseries Data coming from a machine.  This is helpful when testing services in the cloud.

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
