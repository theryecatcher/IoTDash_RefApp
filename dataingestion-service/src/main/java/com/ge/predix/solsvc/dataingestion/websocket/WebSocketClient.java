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
public class WebSocketClient
{
	 private static Logger              log = Logger.getLogger(WebSocketClient.class);
    WebSocketContainer container = ContainerProvider.getWebSocketContainer();
    
    @Autowired
    WebSocketConfig endPointConfig;
    
    @Autowired
    WebsocketEndpoint websocketEndpoint;
    
    private Map<String,Session> sessions =  new HashMap<String,Session>();
    
    public Response postToWebSocketServer(String data)
    {
    	final Response statusResponse = new Response();
    	
        try
        {
        	Session predixWSSession = sessions.get("messages");
 			 if (predixWSSession == null || !predixWSSession.isOpen()) {
 				log.info("Opening New Connection : "+endPointConfig.getPredixWebSocketURI());
 				URI predixWebSocketURI = new URI(endPointConfig.getPredixWebSocketURI());
 	            websocketEndpoint = new WebsocketEndpoint();
 	            predixWSSession = container.connectToServer(websocketEndpoint, predixWebSocketURI);
 	            predixWSSession.setMaxIdleTimeout(0);
 	            sessions.put("messages", predixWSSession);
 			 }else {
 				log.info("Reusing existing Connection");
 			 }
       	     predixWSSession.getBasicRemote().sendText(data);
       	     /*predixWSSession.addMessageHandler(new MessageHandler.Whole<String>()
                  {
                      @Override
                      public void onMessage(String response)
                      {
                    	  log.
                    	  if (response != null && !"".equals(response)) {
	                          InjectionResponse injectionResponse = new Gson().fromJson(response, InjectionResponse.class);
	                          System.out.println("Status Response : "+injectionResponse.getStatusCode());
	                          statusResponse.setStatusCode(injectionResponse.getStatusCode());
                    	  }
                      }
                  });*/
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return statusResponse;
    }
                    
}
