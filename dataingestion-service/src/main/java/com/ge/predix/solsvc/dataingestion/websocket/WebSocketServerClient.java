/*
 * Copyright (c) 2016 Infosys Limited. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * Infosys Limited. The software may be used and/or copied only
 * with the written permission of Infosys Limited or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.predix.solsvc.dataingestion.websocket;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.ContainerProvider;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.apache.log4j.Logger;
import org.kairosdb.client.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WebSocketServerClient
{
	private static Logger              log = Logger.getLogger(WebSocketClient.class);
    WebSocketContainer container = ContainerProvider.getWebSocketContainer();
    
    @Autowired
    WebSocketConfig endPointConfig;
    
    @Autowired
    WebSocketServerEndpoint wsServerEndpoint;
    
    private Map<String,Session> sessions =  new HashMap<String,Session>();
    
    public Response postToWebSocketServer(String data)
    {
    	log.info(data);
    	final Response statusResponse = new Response();
    	
        try
        {
        	Session predixWSSession = sessions.get("messages");
 			 if (predixWSSession == null || !predixWSSession.isOpen()) {
 				log.info("Opening New Connection : "+endPointConfig.getInfyWebSocketServerURI());
 				URI infyWebSocketServerURI = new URI(endPointConfig.getInfyWebSocketServerURI());
 				wsServerEndpoint = new WebSocketServerEndpoint();
 	            predixWSSession = container.connectToServer(wsServerEndpoint, infyWebSocketServerURI);
 	            predixWSSession.setMaxIdleTimeout(0);
 	            sessions.put("messages", predixWSSession);
 			 }else {
 				log.info("Reusing existing Connection");
 			 }
       	     predixWSSession.getBasicRemote().sendText(data);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return statusResponse;
    }                    
}
