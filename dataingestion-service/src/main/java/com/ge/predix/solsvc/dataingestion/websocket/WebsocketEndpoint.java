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

import javax.websocket.ClientEndpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@ClientEndpoint(configurator=WSClientEndpointConfig.class)
public class WebsocketEndpoint
{
	private static Logger logger = LoggerFactory.getLogger(WebsocketEndpoint.class);
	
    @OnOpen
    public void onOpen(Session session, EndpointConfig config)
    {
    	logger.info("OnOpen");
        /*try
        {
            session.getBasicRemote().sendText((String) config.getUserProperties().get("payload")); //$NON-NLS-1$
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        */
    }
    
    @OnMessage
    public void onMessage(String data)
    {
    	logger.info("onMessage:" + data);
    }

}
