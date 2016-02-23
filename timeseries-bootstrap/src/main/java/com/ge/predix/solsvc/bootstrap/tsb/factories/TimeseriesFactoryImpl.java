package com.ge.predix.solsvc.bootstrap.tsb.factories;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.kairosdb.client.deserializer.GroupByDeserializer;
import org.kairosdb.client.response.GetResponse;
import org.kairosdb.client.response.GroupResult;
import org.kairosdb.client.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.ge.predix.solsvc.bootstrap.tbs.api.TimeSeriesAPIV1;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.DatapointsLatestQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.DatapointsQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetricBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.response.entity.TimeseriesQueryResponse;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesRestConfig;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesWSConfig;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesWebsocketClient;
import com.ge.predix.solsvc.ext.util.JsonMapper;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author 212421693
 *
 */
@Component
public class TimeseriesFactoryImpl
        implements TimeseriesFactory
{

    private static Logger             log = LoggerFactory.getLogger(TimeseriesFactory.class);

    @Autowired
    private CxfAwareRestClient        restClient;

    @Autowired
    private TimeseriesRestConfig      timeseriesRestConfig;

    @Autowired
    private TimeseriesWSConfig        tsInjectionWSConfig;

    @Autowired
    private TimeseriesWebsocketClient timeseriesWebsocketClient;

    @Autowired
    private ApplicationContext        applicationContext;

    @Autowired
    private IOauthRestConfig                restConfig;
    
    @Autowired
    protected JsonMapper jsonMapper;
    
 
 /*   @PostConstruct
    public void init() {
        this.jsonMapper.addAllXmlSeeAlsoSubtypes(CustomModel.class);

    }
*/
    @Override
    public Response create(InjectionMetricBuilder metricBuilder)
    {

        Response response = new Response();
        try
        {
            response = this.timeseriesWebsocketClient.pushMetrics(metricBuilder);
            log.debug("Response for metrics" + metricBuilder.getInjectionRequest().getMessageId() //$NON-NLS-1$
                    + " " + response.getStatusCode()); //$NON-NLS-1$
        }
        catch (URISyntaxException | IOException e)
        {
            log.debug("Exception in URI formation " + e);//$NON-NLS-1$
            throw new RuntimeException(e);
        }
        return response;

    }
    
    @Override
    public DatapointsResponse queryForDatapoints(String baseUrl, DatapointsQuery datapoints, List<Header> headers){
    	DatapointsResponse response = null;
    	
    	if (datapoints==null){
    		log.debug("datapoints request obj is null");
    		return response;
    	}
    	CloseableHttpResponse httpResponse = null ;
    	try{
    		 String request = this.jsonMapper.toJson(datapoints);
    		 log.debug(request);
    		 httpResponse = this.restClient.post(baseUrl+TimeSeriesAPIV1.datapointsURI,  this.jsonMapper.toJson(datapoints), headers);		
    		 String responseEntity = processHttpResponseEntity(httpResponse.getEntity());
    		 if(responseEntity==null) return null;
    		 response = this.jsonMapper.fromJson(responseEntity, DatapointsResponse.class);
    		 return response;
    	} 
    	catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
           if ( httpResponse != null )
			try {
				httpResponse.close();
			} catch (IOException e) {
				 throw new RuntimeException(e);
			}
        }
		
    }
    
    @Override
    public DatapointsResponse queryForLatestDatapoint(String baseUrl, DatapointsLatestQuery latestDatapoints, List<Header> headers){
    	DatapointsResponse response = null;
    	
    	if (latestDatapoints==null){
    		log.debug("datapoints obj is null");
    		return response;
    	}
    	CloseableHttpResponse httpResponse = null ;
    	try{
    		 String request = this.jsonMapper.toJson(latestDatapoints);
    		 log.debug(request);
    		 httpResponse = this.restClient.post(baseUrl+TimeSeriesAPIV1.latestdatapointsURI,  this.jsonMapper.toJson(latestDatapoints), headers);
    		 String responseEntity = processHttpResponseEntity(httpResponse.getEntity());
    		 log.debug("Response from TS service = " + responseEntity);
    		 if(responseEntity==null) return null;
    		 response = this.jsonMapper.fromJson(responseEntity, DatapointsResponse.class);
    		 return response;
    	} 
    	catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
           if ( httpResponse != null )
			try {
				httpResponse.close();
			} catch (IOException e) {
				 throw new RuntimeException(e);
			}
        }
		
    }
    
    public String  processHttpResponseEntity(org.apache.http.HttpEntity entity) throws IOException{
    	if(entity==null) return null;
    	if (entity instanceof GzipDecompressingEntity){   		
    		return IOUtils.toString(((GzipDecompressingEntity)entity).getContent(), "UTF-8");
    	}   	
		return EntityUtils.toString(entity);    		
    }
    

    @SuppressWarnings("nls")
    @Override
    public List<String> getAttributeNames(List<Header> headers)
    {
        try
        {
            String uri = this.timeseriesRestConfig.getHostUri() + "/attributenames";
            headers.add(new BasicHeader(this.timeseriesRestConfig.getPredixZoneIdHeaderName(), this.timeseriesRestConfig.getZoneId()));
            HttpResponse httpResponse = this.restClient.get(uri, headers);
            org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(responseEntity);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            GetResponse response = gson.fromJson(responseString, GetResponse.class);
            return response.getResults();

        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
//          if ( client != null ) client.shutdown();
        }
    }

    @SuppressWarnings("nls")
    @Override
    public List<String> getTagNames(List<Header> headers)
    {
        try
        {
            String uri = this.timeseriesRestConfig.getHostUri() + "/tagnames";
            headers.add(new BasicHeader(this.timeseriesRestConfig.getPredixZoneIdHeaderName(), this.timeseriesRestConfig.getZoneId()));
            HttpResponse httpResponse = this.restClient.get(uri, headers);
            org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(responseEntity);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            GetResponse response = gson.fromJson(responseString, GetResponse.class);
            return response.getResults();

        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
//            if ( client != null ) client.shutdown();
        }
    }

    @SuppressWarnings("nls")
    @Override
    public Response deleteMetric(String tag, List<Header> headers)
    {
        try
        {
            String uri = this.timeseriesRestConfig.getHostUri() + "/metric/" + tag;
            headers.add(new BasicHeader(this.timeseriesRestConfig.getPredixZoneIdHeaderName(), this.timeseriesRestConfig.getZoneId()));
            HttpResponse httpResponse = this.restClient.get(uri, headers);
            org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(responseEntity);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Response response = gson.fromJson(responseString, Response.class);
            return response;

        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
//            if ( client != null ) client.shutdown();
        }
    }

    @SuppressWarnings("nls")
    @Override
    public Response delete(TimeseriesQueryBuilder query, List<Header> headers)
    {
        try
        {
            String uri = this.timeseriesRestConfig.getHostUri() + "/delete";
            HttpResponse httpResponse = this.restClient.post(uri, query.build(), headers);
            org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(responseEntity);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Response response = gson.fromJson(responseString, Response.class);
            return response;

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
//            if ( client != null ) client.shutdown();
        }
    }

    @SuppressWarnings(
    {
            "rawtypes", "nls"
    })
    @Override
    public Class getDataPointValueClass(String groupType)
    {
        switch (groupType)
        {
            case "number":
                return Number.class;
            case "text":
                return String.class;

            default:
                throw new UnsupportedOperationException("unknown GroupType=" + groupType);
        }
    }

    @SuppressWarnings("nls")
    @Override
    public List<String> getVersion(List<Header> headers)
    {
        try
        {
            String uri = this.timeseriesRestConfig.getHostUri() + "/version";
            headers.add(new BasicHeader(this.timeseriesRestConfig.getPredixZoneIdHeaderName(), this.timeseriesRestConfig.getZoneId()));
            HttpResponse httpResponse = this.restClient.get(uri, headers);
            org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(responseEntity);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            GetResponse response = gson.fromJson(responseString, GetResponse.class);
            return response.getResults();

        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
//            if ( client != null ) client.shutdown();
        }
    }
}
