/*
 * Copyright (c) 2015 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.predix.solsvc.dataingestion.websocket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class WebSocketConfig implements EnvironmentAware
{
    
    @Value("${predixTsWebSocketURI}")
    String predixTsWebSocketURI;
    
    @Value("${infyWebSocketServerURI}")
    String infyWebSocketServerURI;
    
    /**
	 * @return the predixWebSocketURI
	 */
	public String getPredixTsWebSocketURI() {
		return predixTsWebSocketURI.trim();
	}

	/**
	 * @param predixWebSocketURI the predixWebSocketURI to set
	 */
	public void setPredixWebSocketURI(String predixTsWebSocketURI) {
		this.predixTsWebSocketURI = predixTsWebSocketURI;
	}

	@Override
	public void setEnvironment(Environment env) {
		this.predixTsWebSocketURI = env.getProperty("predixWebSocketURI");
		this.infyWebSocketServerURI = env.getProperty("infyWebSocketServerURI");
		
		
	}
    
    /**
	 * @return the infyWebSocketServerURI
	 */
	public String getInfyWebSocketServerURI() {
		return infyWebSocketServerURI.trim();
	}

	/**
	 * @param infyWebSocketServerURI the infyWebSocketServerURI to set
	 */
	public void setinfyWebSocketServerURI(String infyWebSocketServerURI) {
		this.infyWebSocketServerURI = infyWebSocketServerURI;
	}    
}
