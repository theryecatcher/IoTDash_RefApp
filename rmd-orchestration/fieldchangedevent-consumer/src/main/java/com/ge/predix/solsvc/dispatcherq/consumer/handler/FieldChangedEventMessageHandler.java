/*
 * Copyright (c) 2015 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.ge.predix.solsvc.dispatcherq.consumer.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.cxf.helpers.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ge.dsp.pm.analytic.entity.runanalytic.RunAnalyticRequest;
import com.ge.dsp.pm.ext.entity.asset.Asset;
import com.ge.dsp.pm.solution.service.entity.fieldchanged.FieldChanged;
import com.ge.dsp.pm.solution.service.fieldchanged.FieldChangedEvent;
import com.ge.predix.solsvc.dispatcherq.orchestrationclient.clientstub.RmdOrchestrationClient;
import com.ge.predix.solsvc.ext.util.JsonMapper;

/**
 * 
 * @author 212367843
 */
@SuppressWarnings(
{
    "nls"
})
@Component
public class FieldChangedEventMessageHandler
        implements MessageListener
{

    private static final Logger    logger = LoggerFactory.getLogger(FieldChangedEventMessageHandler.class.getName());

    @Autowired
    private MessageConverter       fieldChangedEventMessageConverter;

    @Autowired
    private RmdOrchestrationClient client;

    @Autowired
    private JsonMapper             jsonMapper;

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.amqp.core.MessageListener#onMessage(org.springframework
     * .amqp.core.Message)
     */
    @Override
    public void onMessage(Message message)
    {
        // Get the java object from the payload
        FieldChangedEvent fce = getFieldChangedEventFromPayload(message);
        logger.info("Listener received message----->" + fce);

        // Convert the retreived java object to the REST service request object
        // and Invoke the REST service
        try {
			convertFCEtoRunAnalytic(fce);
		} catch (JsonProcessingException e) {
			logger.error("JsonProcessingException", e);
		} catch (IOException e) {
			logger.error("IOException",e);
		}

    }

    private FieldChangedEvent getFieldChangedEventFromPayload(Message payload)
    {
        FieldChangedEvent fieldChangedEvent = (FieldChangedEvent) this.fieldChangedEventMessageConverter
                .fromMessage(payload);

        logger.info("Listener received message----->" + fieldChangedEvent);

        return fieldChangedEvent;
    }

    private void convertFCEtoRunAnalytic(final FieldChangedEvent fieldChangedEvent) throws JsonProcessingException, IOException
    {

        for (FieldChanged fieldChanged : fieldChangedEvent.getFieldChangedList().getFieldChanged())
        {
            Long solutionId = Long.parseLong(fieldChanged.getSolutionIdentifier().getId().toString());
            logger.info("solutionId   : " + solutionId);

            logger.info("Field Identifier1 ="
                    + fieldChanged.getFieldIdentifierValueList().getFieldIdentifierValue().get(0));

            logger.info("Field Identifier2 ="
                    + fieldChanged.getFieldIdentifierValueList().getFieldIdentifierValue().get(0).getFieldIdentifier());

            for (Asset asset : fieldChanged.getAssetList().getAsset())
            {

                logger.info("Asset Id =" + asset.getAssetIdentifier());
                logger.info("Asset Id =" + asset.getAssetIdentifier().getId());

                RunAnalyticRequest runAnalyticRequest = RunAnalyticTemplate.getActualRunAnalyticFromTemplate(
                        solutionId, (String) fieldChanged.getFieldIdentifierValueList().getFieldIdentifierValue()
                                .get(0).getFieldIdentifier().getId(), (String) asset.getAssetIdentifier().getId(),
                        asset.getAssetIdentifier().getName(), asset.getAssetIdFieldIdentifier());

                String orchestrationRequest = constructOrchRqstFromRunAnalyticRqst(runAnalyticRequest);
                try
                {
                    client.runOrchestration(orchestrationRequest);
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }

    }

    private String constructOrchRqstFromRunAnalyticRqst(RunAnalyticRequest runAnalyticRqst) throws JsonProcessingException, IOException
    {
        String orchRqst = null;

        putAnalyticRequestInTemplate(this.jsonMapper.toJson(runAnalyticRqst));

        try
        {
            File jarPath = new File(FieldChangedEventMessageHandler.class.getProtectionDomain().getCodeSource()
                    .getLocation().getPath());
            String propertiesPath = jarPath.getParent();
            propertiesPath = propertiesPath + "/predixOrchestrationRuntimeRequest.json";
            
            logger.info(" propertiesPath = " + propertiesPath);
            //logger.info("Predix Orch Request json from file = " + new FileInputStream(propertiesPath));
            File requestFile = new File("predixOrchestrationRuntimeRequest.json");
 
            orchRqst = IOUtils.toString(new FileInputStream(requestFile));
            logger.info("Predix Orch Request = " + orchRqst);

        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return orchRqst;
    }

    private void putAnalyticRequestInTemplate(String analyticRequestData) throws JsonProcessingException, IOException
    {
        logger.info("RMD Reference App: RMD Analytic request = " + analyticRequestData);

        ObjectMapper m = new ObjectMapper();
            logger.info("Predix Orch Request template json from file = "
                            + getClass().getClassLoader().getResourceAsStream(
                                    "predixOrchestrationRuntimeRequestTemplate.json"));
            JsonNode rootNode = m.readTree(getClass().getClassLoader().getResourceAsStream(
                    "predixOrchestrationRuntimeRequestTemplate.json"));
            ArrayNode analyticInputDataNode = (ArrayNode) rootNode.path("analyticInputData");
            for (int i = 0; i < analyticInputDataNode.size(); i++)
            {
                JsonNode dataNode1 = analyticInputDataNode.get(i);
                JsonNode dataNode = analyticInputDataNode.get(i).get("data");
                logger.info("dataNode = " + dataNode.asText());
                ((ObjectNode) dataNode1).put("data", analyticRequestData);
            }
            m.writeValue(new File("predixOrchestrationRuntimeRequest.json"), rootNode);
    } 
    
}
