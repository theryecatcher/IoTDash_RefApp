package com.ge.predix.solsvc.dataingestion.websocket;

import javax.websocket.ClientEndpointConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WSClientEndpointConfig extends ClientEndpointConfig.Configurator
{ 
	private static Logger logger = LoggerFactory.getLogger(WSClientEndpointConfig.class);

	private static String uaaAuthorization;
	private static String zoneId;

	public static void SetAuthorizationAndZone(String authorization, String predixZoneId)
	{
		
		uaaAuthorization = authorization;
		zoneId = predixZoneId;        
	}

	@Override
	public void beforeRequest(Map<String, List<String>> headers)
	{
		super.beforeRequest(headers);
		logger.info("Enter Before Request");

		{
			List<String> attribList = new ArrayList<String>();
			attribList.add(uaaAuthorization);
			headers.put("Authorization", attribList);

			logger.info("AddHeader Authorization: " + attribList.get(0));

		}

		{
			List<String> attribList = new ArrayList<String>();
			attribList.add(zoneId);
			headers.put("Predix-Zone-Id", attribList);
			logger.info("AddHeader Predix-Zone-Id: " + attribList.get(0));
		}

		{
			List<String> attribList = new ArrayList<String>();
			attribList.add("http://dummyhost");
			headers.put("Origin", attribList);
			logger.info("AddHeader Origin: " + attribList.get(0));
		}

		logger.info("Headers: " + headers.toString()); 
	}
}
