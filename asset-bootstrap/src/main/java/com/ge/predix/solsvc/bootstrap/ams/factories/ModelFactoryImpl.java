package com.ge.predix.solsvc.bootstrap.ams.factories;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ge.dsp.pm.ext.entity.model.Model;
import com.ge.dsp.pm.ext.entity.model.ModelList;

/**
 * 
 * @author 212438846
 */
@Component(value = "ModelFactory")
public class ModelFactoryImpl extends FixtureFactory
        implements ModelFactory
{
    


    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(ModelFactoryImpl.class);

    @Override
    public <T> CloseableHttpResponse createModel(List<T> objs, List<Header> headers)
    {
    	CloseableHttpResponse response = null; 
    	try { 
         response = createCustomModels(objs, headers);
        boolean expected = (response == null || response.getStatusLine() == null || response.getStatusLine()
                .getStatusCode() != HttpStatus.SC_NO_CONTENT) ? false : true;
        if ( !expected ) handleException(objs, headers, response);
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
        return response;
    }

    @Override
    public <T> CloseableHttpResponse updateModel(T obj, List<Header> headers)
    {
    	CloseableHttpResponse response = null; 
    	try { 
         response = updateCustomModel(obj, headers);
        boolean expected = (response == null || response.getStatusLine() == null || response.getStatusLine()
                .getStatusCode() != HttpStatus.SC_NO_CONTENT) ? false : true;
        if ( !expected ) handleException(obj, headers, response);
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
        return response;
    }

    @Override
    public <T> CloseableHttpResponse updateModel(T obj, String modelName, List<Header> headers)
    {
    	CloseableHttpResponse response = null;  
    	try { 
	        response = updateCustomModel(obj, modelName, headers);
	        boolean expected = (response == null || response.getStatusLine() == null || response.getStatusLine()
	                .getStatusCode() != HttpStatus.SC_NO_CONTENT) ? false : true;
	        if ( !expected ) handleException(obj, headers, response);
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
        return response;
    }

    @SuppressWarnings("nls")
    @Override
    public <T> List<T> getModels(String filter, String model, TypeReference valueTypeRef, List<Header> headers)
    {
    	CloseableHttpResponse response = null;  
    	try { 
         response = getCustomModels(filter, model, headers);
        if ( response == null
                || response.getStatusLine() == null
                || (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK && response.getStatusLine()
                        .getStatusCode() != HttpStatus.SC_NOT_FOUND) )
        {
            handleException(model, headers, response);
        }
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            String body = EntityUtils.toString(response.getEntity());
            List<T> list = mapper.readValue(body, valueTypeRef);
            return list;
        }
        catch (ParseException | IOException e)
        {
            throw new RuntimeException("Failed to unmarshall response. ", e);
        }
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
    }

    @SuppressWarnings("nls")
    @Override
    public List<Model> getModels(String filter, String modelName, List<Header> headers)
    {
    	CloseableHttpResponse response = null;   
    	try { 
	        response = getCustomModels(filter, modelName, headers);
	        if ( response == null
	                || response.getStatusLine() == null
	                || (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK && response.getStatusLine()
	                        .getStatusCode() != HttpStatus.SC_NOT_FOUND) )
	        {
	            handleException(modelName, headers, response);;
	        }
	        try
	        {
	            String body = EntityUtils.toString(response.getEntity());
	            if ( body.equals("[]") ) return null;
	            Object mappedObject = this.jsonMapper.fromJson(body, Object.class);
	            @SuppressWarnings("unchecked")
	            List<LinkedHashMap<String, Object>> list = (List<LinkedHashMap<String, Object>>) mappedObject;
	            List<Model> models = new ArrayList<Model>();
	            LinkedHashMapModel linkedModel = null;
	            for (LinkedHashMap<String,Object> map : list)
	            {
	                linkedModel = new LinkedHashMapModel();
	                linkedModel.setMap(map);
	                //linkedModel.getAttributes().addAll((List)map.get("attributes"));
	                //map.remove("additionalAttributes");
	//                linkedModel.setUri((String) map.get("uri"));
	//                map.remove("uri");
	//                linkedModel.setName((String) map.get("name"));
	//                map.remove("name");
	//                linkedModel.setClassificationUri((String) map.get("classificationUri"));
	//                map.remove("classificationUri");
	                map.put("@type", getBaseModelName(modelName));
	            }
	            String listBody = this.jsonMapper.toJson(list);
	            listBody = "{ \"model\":" + listBody + "}";
	            ModelList modelList;
	            try
	            {
	                modelList = this.jsonMapper.fromJson(listBody, ModelList.class);
	                models.addAll(modelList.getModel());
	            }
	            catch (RuntimeException e)
	            {
	                models.add(linkedModel);
	            }
	            return models;
	        }
	        catch (ParseException | IOException e)
	        {
	            throw new RuntimeException("Failed to unmarshall response. ", e);
	        }
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
    }

    /**
     * @param modelName
     * @return -
     */
    @SuppressWarnings("nls")
    private String getBaseModelName(String modelName)
    {
        if ( modelName.contains("."))
            return modelName.substring(modelName.lastIndexOf(".")+1);
        return modelName;
    }

    /**
     * @return -
     */
    private <M extends Model> org.codehaus.jackson.type.TypeReference<List<M>> getTypeRef()
    {
        org.codehaus.jackson.type.TypeReference<List<M>> type = new org.codehaus.jackson.type.TypeReference<List<M>>()
        {
            //
        };
        return type;
    }

    @SuppressWarnings("nls")
    @Override
    public CloseableHttpResponse deleteModel(String modelUri, List<Header> headers)
    {
    	CloseableHttpResponse response = null;   
    	try {
        String assetUri = this.assetRestConfig.getAssetUri();
        if ( !assetUri.endsWith("/") && !modelUri.startsWith("/") )
            assetUri += "/" + modelUri;
        else 
            assetUri += modelUri;
        response = delete(assetUri, headers);
        boolean expected = (response == null || response.getStatusLine() == null || response.getStatusLine()
                .getStatusCode() != HttpStatus.SC_NO_CONTENT) ? false : true;
        if ( !expected ) handleException(assetUri, headers, response);
    	}finally {
    		if (response!=null )
				try {
					response.close();
				} catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}	
    	}
        return response;
    }


}
