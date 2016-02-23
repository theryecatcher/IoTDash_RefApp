package com.ge.predix.solsvc.dataingestion.service.type;

import java.util.ArrayList;

public class SensorDetails {
	public String sensorName;
	public String SensorID; //This is the column number
    public String MaxValue;
    public String MinValue;
    public ArrayList<SensorReading> SensorReadings;	
}
