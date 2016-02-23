package com.ge.predix.solsvc.dataingestion.service.type;

import java.sql.Timestamp;

/**
 * 
 * @author predix -
 */
public class JSONData {
	private String name;
	private String unit;
	private String register;
	private String datatype;
	private Object value;
	private Timestamp timestamp;
	/**
	 * @return -
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @param name -
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return -
	 */
	public String getUnit() {
		return this.unit;
	}
	/**
	 * @param unit -
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return -
	 */
	public String getRegister() {
		return this.register;
	}
	/**
	 * @param register -
	 */
	public void setRegister(String register) {
		this.register = register;
	}
	/**
	 * @return -
	 */
	public String getDatatype() {
		return this.datatype;
	}
	/**
	 * @param datatype -
	 */
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	/**
	 * @return -
	 */
	public Object getValue() {
		return this.value;
	}
	/**
	 * @param value -
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	/**
	 * @return -
	 */
	public Timestamp getTimestamp() {
		return this.timestamp;
	}
	/**
	 * @param timestamp -
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
