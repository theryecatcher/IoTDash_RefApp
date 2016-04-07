package com.ge.predix.solsvc.dataingestion.service.type;

public class SimulateSchemaSensors {
	
	private double temperature;
	private double pressure;
	private double humidity;
	
	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}
	
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	/**
	 * @return the pressure
	 */
	public double getPressure() {
		return pressure;
	}
	
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	
	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}
	
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
}
