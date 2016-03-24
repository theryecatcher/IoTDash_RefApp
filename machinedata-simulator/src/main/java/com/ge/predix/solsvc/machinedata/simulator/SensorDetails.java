package com.ge.predix.solsvc.machinedata.simulator;

import java.util.ArrayList;

public class SensorDetails {
	private String sensorName;
	private String SensorID; //This is the column number
	private String MaxValue;
	private String MinValue;
	private ArrayList<SensorReading> SensorReadings;
	
	public String getSensorName() {
		return sensorName;
	}
	
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	
	public String getSensorID() {
		return SensorID;
	}
	
	public void setSensorID(String sensorID) {
		SensorID = sensorID;
	}
	
	public String getMaxValue() {
		return MaxValue;
	}
	
	public void setMaxValue(String maxValue) {
		MaxValue = maxValue;
	}
	
	public String getMinValue() {
		return MinValue;
	}
	
	public void setMinValue(String minValue) {
		MinValue = minValue;
	}
	
	public ArrayList<SensorReading> getSensorReadings() {
		return SensorReadings;
	}
	
	public void setSensorReadings(ArrayList<SensorReading> sensorReadings) {
		SensorReadings = sensorReadings;
	}		
}
