package com.ge.predix.solsvc.machinedata.simulator;


public class SensorReading {
	private long epoch;
	private double value;
	
	public long getEpoch() {
		return epoch;
	}
	
	public void setEpoch(long epoch) {
		this.epoch = epoch;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
}
