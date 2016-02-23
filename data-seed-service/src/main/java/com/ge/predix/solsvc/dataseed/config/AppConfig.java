package com.ge.predix.solsvc.dataseed.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author predix -
 */
@Component
public class AppConfig {
	@Value("${dataseed.file:#{null}}")
	private String dataSeedFile;

	/**
	 * @return -
	 */
	public String getDataSeedFile() {
		return this.dataSeedFile;
	}

	/**
	 * @param dataSeedFile -
	 */
	public void setDataSeedFile(String dataSeedFile) {
		this.dataSeedFile = dataSeedFile;
	}
}
