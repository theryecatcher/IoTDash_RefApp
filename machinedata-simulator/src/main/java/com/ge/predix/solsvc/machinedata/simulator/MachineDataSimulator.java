package com.ge.predix.solsvc.machinedata.simulator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 * @author predix -
 */
@Component
public class MachineDataSimulator
{
    /**
     * 
     */
    static final Logger         log = LoggerFactory.getLogger(MachineDataSimulator.class);

    /**
	 * 
	 */
    @Autowired
    ApplicationProperties applicationProperties;

    
    /**
     *  -
     */
    @Scheduled(fixedDelay=3000)
    public void run()
    {
        
        try
        {
            runTest();
        }
        catch (Throwable e)
        {
            log.error("unable to run Machine DataSimulator Thread", e); //$NON-NLS-1$
        }
    }

    /**
     * @return String  Response string
     * @throws Exception -
     */
    public String runTest() throws Exception
    {
        List<JSONData> list = generateMockDataMap_RT();
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        
            mapper.writeValue(writer, list);
            return postData(writer.toString());
        
    }
    /**
     * @return -
     */
    List<JSONData> generateMockDataMap_RT()
    {
        String machineControllerId = this.applicationProperties.getMachineControllerId();
        List<JSONData> list = new ArrayList<JSONData>();
        JSONData data = new JSONData();
        data.setName("Compressor-2015:CompressionRatio"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(2.5, 3.0) - 1) * 65535.0 / 9.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:DischargePressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 23.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:SuctionPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.21) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MaximumPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(22.0, 26.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MinimumPressure"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue(0.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Temperature"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(65.0, 80.0) * 65535.0) / 200.0);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Velocity"); //$NON-NLS-1$
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.1) * 65535.0) / 0.5);
        data.setDatatype("DOUBLE"); //$NON-NLS-1$
        data.setRegister(""); //$NON-NLS-1$
        data.setUnit(machineControllerId);
        list.add(data);

        return list;
    }

    private Timestamp getCurrentTimestamp()
    {
        java.util.Date date = new java.util.Date();
        Timestamp ts = new Timestamp(date.getTime());
        return ts;
    }

    private static double generateRandomUsageValue(double low, double high)
    {
        return low + Math.random() * (high - low);
    }
    
    @SuppressWarnings("resource")
	private String postData(String content)
    {

    	
        HttpClient client = null;
        try
        {
            HttpClientBuilder builder = HttpClientBuilder.create();
            if ( this.applicationProperties.getDiServiceProxyHost() != null
                    && !"".equals(this.applicationProperties.getDiServiceProxyHost()) //$NON-NLS-1$
                    && this.applicationProperties.getDiServiceProxyPort() != null
                    && !"".equals(this.applicationProperties.getDiServiceProxyPort()) ) //$NON-NLS-1$
            {
                HttpHost proxy = new HttpHost(this.applicationProperties.getDiServiceProxyHost(),
                        Integer.parseInt(this.applicationProperties.getDiServiceProxyPort()));
                builder.setProxy(proxy);
            }
            client = builder.build();
            String serviceURL = null;
            if ( this.applicationProperties.getPredixDataIngestionURL() == null )
            {
                serviceURL = "http://" + this.applicationProperties.getDiServiceHost() + ":" //$NON-NLS-1$ //$NON-NLS-2$
                        + this.applicationProperties.getDiServicePort() + "/SaveTimeSeriesData"; //$NON-NLS-1$
            }
            else
            {
                serviceURL = this.applicationProperties.getPredixDataIngestionURL() + "/SaveTimeSeriesData"; //$NON-NLS-1$

            }
            log.info("Service URL : " + serviceURL); //$NON-NLS-1$
            HttpPost request = new HttpPost(serviceURL);
            HttpEntity reqEntity = MultipartEntityBuilder.create().addTextBody("content", content) //$NON-NLS-1$
                    .addTextBody("destinationId", "TimeSeries").addTextBody("clientId", "TimeSeries") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    .addTextBody("tenantId", this.applicationProperties.getTenantId()).build(); //$NON-NLS-1$
            request.setEntity(reqEntity);
            HttpResponse response = client.execute(request);
            log.debug("Send Data to Ingestion Service : Response Code : " + response.getStatusLine().getStatusCode()); //$NON-NLS-1$
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer result = new StringBuffer();
            String line = ""; //$NON-NLS-1$
            while ((line = rd.readLine()) != null)
            {
                result.append(line);
            }
            log.debug("Response : "+result.toString());
            if (result.toString().startsWith("You successfully posted")) { //$NON-NLS-1$
            	return "SUCCESS : "+result.toString(); //$NON-NLS-1$
            }
			return "FAILED : "+result.toString(); //$NON-NLS-1$
            
        }
        catch (Throwable e)
        {
            log.error("unable to post data ", e); //$NON-NLS-1$
            return "FAILED : "+e.getLocalizedMessage(); //$NON-NLS-1$
        }
    }
}
