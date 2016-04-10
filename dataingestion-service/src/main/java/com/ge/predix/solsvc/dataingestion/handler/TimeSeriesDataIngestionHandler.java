package com.ge.predix.solsvc.dataingestion.handler;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import com.ge.predix.solsvc.bootstrap.ams.dto.AssetMeter;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionBody;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetric;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetricBuilder;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesWSConfig;
import com.ge.predix.solsvc.bootstrap.tsb.factories.TimeseriesFactory;
import com.ge.predix.solsvc.dataingestion.api.Constants;
import com.ge.predix.solsvc.dataingestion.service.type.JSONData;
import com.ge.predix.solsvc.dataingestion.service.type.SensorDetails;
import com.ge.predix.solsvc.dataingestion.service.type.SimulateSchema;
import com.ge.predix.solsvc.dataingestion.websocket.WSClientEndpointConfig;
import com.ge.predix.solsvc.dataingestion.websocket.WebSocketClient;
import com.ge.predix.solsvc.dataingestion.websocket.WebSocketConfig;
import com.ge.predix.solsvc.dataingestion.websocket.WebSocketServerClient;

import scala.annotation.meta.getter;

/**
 * 
 * @author predix -
 */
@Component
public class TimeSeriesDataIngestionHandler extends BaseFactoryIT
{
    private static Logger tsDiHandlerlog = Logger.getLogger(TimeSeriesDataIngestionHandler.class);
    @Autowired
    private TimeseriesFactory timeSeriesFactory;

    @Autowired
    private AssetDataHandler  assetDataHandler;
    
    
	@Autowired
	private TimeseriesWSConfig tsInjectionWSConfig;

	@Autowired
	private WebSocketConfig wsConfig;
	
	@Autowired
	private WebSocketClient wsClient;
	
	@Autowired
	private WebSocketServerClient wsServerClient;
	
	private String[] simulateSets = new String[]{"Tst8", "Tst9", "Tst10", "Tst11", "Tst12"};
	private List<SimulateSchema> dataList = new ArrayList<SimulateSchema>();
	private String tenantId = "";
	private String controllerId = "";
	private String authorization = "";
	
	public void setDataForSimulation(String tenantId, String controllerId, String data, String authorization)
	{
		tsDiHandlerlog.debug(data);
		this.tenantId = tenantId;
		this.controllerId = controllerId;
		this.authorization = authorization;
		
    	if (StringUtils.isEmpty(this.authorization)) {
        	tsDiHandlerlog.info("reading credentials from "+restConfig.getOauthClientId());
        	String[] oauthClient  = restConfig.getOauthClientId().split(":");
        	this.authorization = "Bearer "+getRestTemplate(oauthClient[0],oauthClient[1]).getAccessToken().getValue();
        }
        try
        {
        	ObjectMapper mapper = new ObjectMapper();
        	this.dataList = mapper.readValue(data, new TypeReference<List<SimulateSchema>>()
        	{
        		
        	});        	
        }
        catch (JsonParseException e)
        {
            throw new RuntimeException(e);
        }
        catch (JsonMappingException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        
	}
	
	
	/**
	 *  -
	 */
	@Scheduled(fixedDelay=3000)
	public void simulateData()
	{

		try
		{
			runSimulator(dataList.get(0).getName(), dataList.remove(0).getReadings());
		}
		catch (Throwable e)
		{
			tsDiHandlerlog.error("unable to run Machine DataSimulator Thread", e); //$NON-NLS-1$
		}
	}
	
    /**
     *  -
     */
    @SuppressWarnings("nls")
    @PostConstruct
    public void intilizeDataIngestionHandler()
    {
    	tsDiHandlerlog.info("*******************TimeSeriesDataIngestionHandler Initialization complete*********************");
    }

    @Override
    @SuppressWarnings("nls")
    public void handleData(String tenentId, String controllerId, String data, String authorization)
    {
    	tsDiHandlerlog.debug(data);
        if (StringUtils.isEmpty(authorization)) {
        	tsDiHandlerlog.info("reading credentials from "+restConfig.getOauthClientId());
        	String[] oauthClient  = restConfig.getOauthClientId().split(":");
        	authorization = "Bearer "+getRestTemplate(oauthClient[0],oauthClient[1]).getAccessToken().getValue();
        }
        try
        {
            // data =
            // "[{\"name\":\"CompressionRatio\",\"unit\":\"1\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":13566.69088883387,\"timestamp\":1435693320269},{\"name\":\"DischgPressure\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":14673.170162468017,\"timestamp\":1435693320269},{\"name\":\"SuctPressure\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":20.762477268848848,\"timestamp\":1435693320269},{\"name\":\"MaxPressure\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":14462.28474207516,\"timestamp\":1435693320269},{\"name\":\"MinPressure\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":0.0,\"timestamp\":1435693320269},{\"name\":\"Temperature\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":25876.681922754717,\"timestamp\":1435693320269},{\"name\":\"Velocity\",\"unit\":\"2\",\"register\":\"\",\"datatype\":\"DOUBLE\",\"value\":6355.340893305594,\"timestamp\":1435693320269}]";
            ObjectMapper mapper = new ObjectMapper();
            List<SensorDetails> list = mapper.readValue(data, new TypeReference<List<SensorDetails>>()
            {
                //
            });
            tsDiHandlerlog.info("TimeSeries URL : " + this.tsInjectionWSConfig.getInjectionUri() );
            tsDiHandlerlog.info("WebSocket URL : " + this.wsConfig.getPredixTsWebSocketURI());
            for (SensorDetails details : list)
            {
            	// Long i=new Long(System.currentTimeMillis());
            	// String filter = "";
            	// String value = "";
            	// String nodeName=json.getName();
            	// Asset asset = this.assetDataHandler.retrieveAsset(null, filter, value, authorization);
            	/*if ( asset != null )
                {
            		LinkedHashMap<String, AssetMeter> meters = asset.getAssetMeter();
                    if ( meters != null )
                    {
                    	AssetMeter assetMeter = getAssetMeter(meters, nodeName);
                    	if (assetMeter != null) {
	                    	InjectionMetricBuilder builder = InjectionMetricBuilder.getInstance();
		                    InjectionMetric metric = new InjectionMetric(i);
		                    InjectionBody body = new InjectionBody(assetMeter.getSourceTagId());  
		                    
		                    if(!StringUtils.isEmpty(assetMeter.getSourceTagId())){
		                    	 String sourceTagAttribute = assetMeter.getSourceTagId().split(":")[1];
		                    	  body.addAttributes("sourceTagId",sourceTagAttribute);
		                    }
		                  
		                    body.addAttributes("assetId", asset.getAssetId());
		                    Double convertedValue =  getConvertedValue(assetMeter.getMeterDatasource().getNodeName(), Double.parseDouble(json.getValue().toString()));
		                    body.addDataPoint(converLocalTimeToUtcTime(json.getTimestamp().getTime()),
		                    		convertedValue);
		                    metric.getBody().add(body);
		            		builder.addMetrics(metric);
		            		
		                    log.debug(json.getName() + " " + assetMeter.getSourceTagId() + " = "
		                            + convertedValue);
		                    
		                    this.timeSeriesFactory.create(builder);
		                    log.info("Posted Data to Timeseries");
		                    wsClient.postToWebSocketServer(builder.build());
		                    log.info("Posted Data to Predix Websocket Server");
                    	}else {
                    		log.warn("assetMeterMap is empty, unable to find filter=attributes.machineControllerId.value=/asset/Bently.Nevada.3500.Rack" + json.getUnit() + " nodeName=" + json.getName() + " authorization=" + authorization);
                        }
                    }else{
                    	log.warn("3. asset has no meters, unable to find filter=" + filter + " = " + value + " nodeName="
                                + nodeName + " authorization=" + authorization);
                    }             
	            }else {
                	log.warn("4. asset not found, unable to find filter=" + filter + " = " + value + " nodeName="
                            + nodeName + " authorization=" + authorization);
                }*/
//            	WSClientEndpointConfig.SetAuthorizationAndZone(authorization, tenentId);
            	
                InjectionMetricBuilder builder = InjectionMetricBuilder.getInstance();
                InjectionMetric metric = new InjectionMetric(new Long(System.currentTimeMillis()));
                InjectionBody body = new InjectionBody(details.sensorName);
                
                /*log.info(details.sensorName);
                log.info(details.SensorID);
                log.info(details.MaxValue);
                log.info(details.MinValue);*/
                body.addAttributes("sourceTagName",details.sensorName);
                body.addAttributes("sourceTagID",details.SensorID);
                body.addAttributes("MaxValue",details.MaxValue);
                body.addAttributes("MinValue",details.MinValue);
                
                int count = details.SensorReadings.size();
                for (int i = 0 ; i <count; i++)
                {
                	// log.info(details.SensorReadings.get(i).epoch);
                	// log.info(details.SensorReadings.get(i).value);
                    body.addDataPoint(Long.parseLong(details.SensorReadings.get(i).epoch),Double.parseDouble(details.SensorReadings.get(i).value));
                }
                
                metric.getBody().add(body);
                builder.addMetrics(metric);
                
                this.timeSeriesFactory.create(builder);
                
                tsDiHandlerlog.info("Added Data to Timeseries");
                                                
//                wsClient.postToWebSocketServer(builder.build());
                wsServerClient.postToWebSocketServer(builder.build());
                tsDiHandlerlog.info("Posted Data to Timeseries Websocket Server");
            }                                    
        }
        catch (Exception e)
        {
        	tsDiHandlerlog.error("Error : Error in run data");
        }
    }
    
    @Override
    @SuppressWarnings("nls")
    public void runSimulator(String dataName, ArrayList<Double> dataReadings)
    {
    	tsDiHandlerlog.debug(dataName);
    	
        try
        {
        	tsDiHandlerlog.debug("TimeSeries URL : " + this.tsInjectionWSConfig.getInjectionUri() );
            tsDiHandlerlog.debug("WebSocket URL : " + this.wsConfig.getPredixTsWebSocketURI());
            tsDiHandlerlog.debug("WebSocket Server URL : " + this.wsConfig.getInfyWebSocketServerURI());
            
            InjectionMetricBuilder builder = InjectionMetricBuilder.getInstance();
			InjectionMetric metric = new InjectionMetric(new Long(System.currentTimeMillis()));
        	
			for (int i=0; i < dataReadings.size(); i++)
			{
	            InjectionBody body = new InjectionBody(simulateSets[i]);
				body.addDataPoint(dataReadings.get(i));
				metric.getBody().add(body);
			}
			builder.addMetrics(metric);
			
			wsServerClient.postToWebSocketServer(builder.build());
			tsDiHandlerlog.info("Posted Data to Infy Websocket Server"); //$NON-NLS-1$
		}
        catch (Throwable e)
		{
        	tsDiHandlerlog.error("Unable to post data to Infy Websocket Server " + e.getMessage()); //$NON-NLS-1$
		}
    }


    /**
     * @param nodeName -
     * @param value -
     * @return -
     */
    @SuppressWarnings("nls")
    public Double getConvertedValue(String nodeName, Double value)
    {
        Double convValue = null;
        switch (nodeName.toLowerCase())
        {
            case Constants.COMPRESSION_RATIO:
                convValue = value * 9.0 / 65535.0 + 1;
                break;
            case Constants.DISCHG_PRESSURE:
                convValue = value * 100.0 / 65535.0;
                break;
            case Constants.SUCT_PRESSURE:
                convValue = value * 100.0 / 65535.0;
                break;
            case Constants.MAX_PRESSURE:
                convValue = value * 100.0 / 65535.0;
                break;
            case Constants.MIN_PRESSURE:
                convValue = value * 100.0 / 65535.0;
                break;
            case Constants.VELOCITY:
                convValue = value * 0.5 / 65535.0;
                break;
            case Constants.TEMPERATURE:
                convValue = value * 200.0 / 65535.0;
                break;
            default:
                throw new UnsupportedOperationException("nameName=" + nodeName + " not found");
        }
        return convValue;
    }

    private long converLocalTimeToUtcTime(long timeSinceLocalEpoch)
    {
        return timeSinceLocalEpoch + getLocalToUtcDelta();
    }

    private long getLocalToUtcDelta()
    {
        Calendar local = Calendar.getInstance();
        local.clear();
        local.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        return local.getTimeInMillis();
    }

    private AssetMeter getAssetMeter(LinkedHashMap<String, AssetMeter> meters,String nodeName)
    {
    	AssetMeter ret = null;
		if ( meters != null ) {
            for (Entry<String, AssetMeter> entry : meters.entrySet())
            {
                AssetMeter assetMeter = entry.getValue();
                //MeterDatasource dataSource = assetMeter.getMeterDatasource();
                if ( assetMeter != null && !assetMeter.getSourceTagId().isEmpty() && nodeName !=null
                        && nodeName.toLowerCase().contains(assetMeter.getSourceTagId().toLowerCase()))
                {
                    ret = assetMeter;
                    return ret;
                }
            }
		}else {
			tsDiHandlerlog.warn("2. asset has no assetmeters with matching nodeName"+ nodeName);
        }
        return ret;
    }
    @SuppressWarnings("nls")
    private OAuth2RestTemplate getRestTemplate(String clientId, String clientSecret)
    {
        // get token here based on username password;
        // ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
        ClientCredentialsResourceDetails clientDetails = new ClientCredentialsResourceDetails();
        clientDetails.setClientId(clientId);
        clientDetails.setClientSecret(clientSecret);
        String url = this.restConfig.getOauthResourceProtocol() + "://" + this.restConfig.getOauthRestHost()
                + this.restConfig.getOauthResource();
        clientDetails.setAccessTokenUri(url);
        clientDetails.setGrantType("client_credentials");
       
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(clientDetails);

        return restTemplate;
    }
}
