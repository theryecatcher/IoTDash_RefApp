package com.ge.predix.solsvc.dataingestion.service.type;

import java.util.ArrayList;

public class SimulateSchema {
		
	private String name;
    private ArrayList<SimulateSchemaSensors> readings;
    
	/**
	 * @return the readings
	 */
	public ArrayList<SimulateSchemaSensors> getReadings() {
		return readings;
	}
	
	/**
	 * @param readings the readings to set
	 */
	public void setReadings(ArrayList<SimulateSchemaSensors> readings) {
		this.readings = readings;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
