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

import org.springframework.stereotype.Component;

@Component
@ClientEndpoint
public class WebsocketEndpoint
{

    @OnOpen
    public void onOpen(Session session, EndpointConfig config)
    {
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
        
    }

}
