package com.ge.predix.solsvc.fdh.handler.timeseries;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map.Entry;
import java.util.TimeZone;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.http.Header;
import org.kairosdb.client.builder.TimeUnit;
import org.mimosa.osacbmv3_3.DMDataSeq;
import org.mimosa.osacbmv3_3.DataEvent;
import org.mimosa.osacbmv3_3.OsacbmDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.ge.dsp.pm.ext.entity.engunit.EngUnit;
import com.ge.dsp.pm.ext.entity.field.Field;
import com.ge.dsp.pm.ext.entity.fielddata.FieldData;
import com.ge.dsp.pm.ext.entity.fielddata.OsaData;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValue;
import com.ge.dsp.pm.ext.entity.fieldselection.FieldSelection;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.SelectionFilterDefinition;
import com.ge.dsp.pm.ext.entity.osa.selectionfilter.SelectionFilterType;
import com.ge.dsp.pm.ext.entity.selectionfilter.FieldSelectionFilter;
import com.ge.dsp.pm.ext.entity.selectionfilter.OsaSelectionFilter;
import com.ge.dsp.pm.ext.entity.selectionfilter.SelectionFilter;
import com.ge.dsp.pm.ext.entity.util.map.Map;
import com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria.FieldDataCriteria;
import com.ge.dsp.pm.fielddatahandler.entity.getfielddata.GetFieldDataRequest;
import com.ge.dsp.pm.fielddatahandler.entity.getfielddata.GetFieldDataResult;
import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import com.ge.predix.solsvc.bootstrap.ams.dto.AssetMeter;
import com.ge.predix.solsvc.bootstrap.ams.dto.Meter;
import com.ge.predix.solsvc.bootstrap.ams.factories.AssetFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.MeterFactory;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.DatapointsQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.response.entity.TimeseriesQueryResponse;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesRestConfig;
import com.ge.predix.solsvc.bootstrap.tsb.factories.TimeseriesFactory;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.RestClient;

/**
 * This could be exposed by Rest and called directly. But for now it's not
 * registering with CXF. If a Spring Bean MicroComponent called by the Adh
 * Router
 * 
 * @author predix
 */
@Component
@SuppressWarnings("nls")
public class TimeseriesDataRetrievalStrategy
        implements FieldDataHandlerGetFieldData
{
    private static final Logger  log = LoggerFactory.getLogger(TimeseriesDataRetrievalStrategy.class);

    // @Autowired
    // private AdaptingHandler<AssetProperty, GetFieldDataResult,
    // GetFieldDataRequest> adaptingHandler;
    // @Autowired
    // private AdapterNameFactory adapterNameFactory;

    @Autowired
    private TimeseriesFactory    timeseriesFactory;
    @Autowired
    private TimeseriesRestConfig timeseriesRestConfig;
    @Autowired
    private AssetRestConfig      assetRestConfig;
    @Autowired
    private RestClient           restClient;
    @Autowired
    private IOauthRestConfig      restConfig;
    @Autowired
    private AssetFactory         assetFactory;
    @Autowired
    private MeterFactory         meterFactory;

    /**
     * 
     */
    public TimeseriesDataRetrievalStrategy()
    {
        super();
    }

    /*******
     * This section is for GetFieldData API
     * *******/

    @Override
    public GetFieldDataResult getFieldData(String uri, List<Header> headers, GetFieldDataRequest request)
    {
        validateRequest(request);
  
        GetFieldDataResult result = new GetFieldDataResult();
        for (FieldDataCriteria criteria : request.getFieldDataCriteria())
        {
            validateCriteria(criteria);
            //TODO convert to generic Model attribute lookup
            this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());
            Asset asset = lookupAsset(criteria, headers);
            this.restClient.addZoneToHeaders(headers, this.timeseriesRestConfig.getZoneId());

            if ( asset != null )
            {
                log.debug("getOauthTimeseriesOverride=" + this.timeseriesRestConfig.getOauthTimeseriesOverride());
                if ( this.timeseriesRestConfig.getOauthTimeseriesOverride() )
                {
                    // override the Authorization - only if Timeseries has different UAA than Asset
                    List<Header> tokenHeaders = this.restClient.getSecureToken(this.restConfig.getOauthResource(),
                            this.timeseriesRestConfig.getOauthRestHost(), this.restConfig.getOauthRestPort(),
                            this.restConfig.getOauthGrantType(), this.restConfig.getOauthProxyHost(),
                            this.restConfig.getOauthProxyPort(), this.restConfig.getOauthTokenType(),
                            this.timeseriesRestConfig.getOauthClientId(), this.restConfig.getOauthClientIdEncode());
                    this.restClient.addSecureTokenToHeaders(headers, tokenHeaders.get(0).getValue());
                }

                AssetMeter assetMeter = null;
                String fieldUri = (String) criteria.getFieldSelection().get(0).getFieldIdentifier().getId();
                if ( fieldUri.startsWith("/asset/assetMeter/") ) fieldUri = fieldUri.substring(18);
                if ( fieldUri.startsWith("meter/") ) fieldUri = fieldUri.substring(6);
                if ( fieldUri.startsWith("classification/meter/") ) fieldUri = fieldUri.substring(21);
                for (Entry<String, AssetMeter> entry : asset.getAssetMeter().entrySet())
                {
                    if ( entry.getKey().equals(fieldUri) )
                    {
                        assetMeter = entry.getValue();
                        break;
                    }

                }
                if ( assetMeter != null )
                {
                    String sourceTag = assetMeter.getSourceTagId();
                    if ( sourceTag != null )
                    {
                        List<Double> dataPoints = getData(uri, fieldUri, sourceTag, criteria,
                                request.getExternalAttributeMap(), headers);
                        adaptData(result, criteria, dataPoints, assetMeter);
                    }
                }
            }

            // ModelField modelField = (ModelField) getMapEntry(request.getExternalAttributeMap(), "modelField");
        }
        return result;
    }

    private XMLGregorianCalendar getXMLDate(String sourceDateTime)
    {
        try
        {
            DatatypeFactory f = null;
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date dateTime = df.parse(sourceDateTime);
            f = DatatypeFactory.newInstance();
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTimeZone(TimeZone.getTimeZone("GMT"));
            cal.setTime(dateTime);
            XMLGregorianCalendar xmLGregorianCalendar = f.newXMLGregorianCalendar(cal);
            return xmLGregorianCalendar;
        }
        catch (DatatypeConfigurationException e)
        {
            throw new RuntimeException("convert to runtime exception", e);
        }
        catch (ParseException e)
        {
            throw new RuntimeException("convert to runtime exception", e);
        }
    }
    
    private Long getTimeAsMilliSecs(String sourceDateTime)
    {
       
            DatatypeFactory f = null;
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date dateTime;
			try {
				dateTime = df.parse(sourceDateTime);
			} catch (ParseException e) {
				throw new RuntimeException("convert to runtime exception", e);
			}
            return dateTime.getTime();
        
    }
    

    /**
     * @param criteria
     */
    private void validateCriteria(FieldDataCriteria criteria)
    {
        //
    }

    /**
     * @param result
     * @param criteria
     * @param dataPoints
     */
    private void adaptData(GetFieldDataResult result, FieldDataCriteria criteria, List<Double> dataPoints,
            AssetMeter assetMeter)
    {
        DataEvent dataEvent = null;
        FieldSelection projection = criteria.getFieldSelection().get(0);
        if ( projection.getExpectedDataType() == null
                || projection.getExpectedDataType().equals(OsacbmDataType.DM_DATA_SEQ.value()) )
            dataEvent = new DMDataSeq();
        else
            throw new UnsupportedOperationException("DataEvent type = " + projection.getExpectedDataType()
                    + " not supported");

        if ( projection.getResultId() != null && NumberUtils.isNumber(projection.getResultId()) )
            dataEvent.setId(Long.parseLong(projection.getResultId()));
        if ( dataPoints != null )
        {
            int i = 0;
            double prevTimestamp = 0;
            // for (DataPoint dataPoint : dataPoints)
            for (Double dataPoint : dataPoints)
            {
                if ( i++ == 0 )
                {
                    // ((DMDataSeq) dataEvent).setXAxisStart(new Double(dataPoint.getTimestamp()));
                    ((DMDataSeq) dataEvent).setXAxisStart(dataPoint);
                    ((DMDataSeq) dataEvent).getXAxisDeltas().add(0d);
                    if ( dataPoint != null )
                    {
                        // ((DMDataSeq) dataEvent).getValues().add(new Double(dataPoint.getValue().toString()));
                        ((DMDataSeq) dataEvent).getValues().add(dataPoint);
                    }
                }
                else
                {
                    // ((DMDataSeq) dataEvent).getXAxisDeltas().add(new Double(dataPoint.getTimestamp() - prevTimestamp));
                    ((DMDataSeq) dataEvent).getXAxisDeltas().add(dataPoint - prevTimestamp);
                    if ( dataPoint != null ) ((DMDataSeq) dataEvent).getValues().add(dataPoint);
                }
                if ( dataPoint != null )
                {
                    prevTimestamp = dataPoint.doubleValue();
                }
            }
        }
        FieldData fieldData = new FieldData();
        fieldData.setResultId(projection.getResultId());
        OsaData osaData = new OsaData();
        osaData.setDataEvent(dataEvent);
        fieldData.setData(osaData);
        Meter meter = lookupMeter(assetMeter);
        if ( meter != null )
        {
            EngUnit engUnit = new EngUnit();
            engUnit.setName(meter.getUom());
            fieldData.setEngUnit(engUnit);
        }
        Field field = new Field();
        field.setFieldIdentifier(criteria.getFieldSelection().get(0).getFieldIdentifier());
        fieldData.setField(field);

        result.getFieldData().add(fieldData);
    }

    /**
     * @param criteria
     * @return
     */
    private Asset lookupAsset(FieldDataCriteria criteria, List<Header> headers)
    {
        this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());

        SelectionFilter selectionFilter = criteria.getSelectionFilter();
        if ( selectionFilter instanceof FieldSelectionFilter )
        {
            for (FieldIdentifierValue fieldIdentifierValue : ((FieldSelectionFilter) selectionFilter)
                    .getFieldIdentifierValue())
            {
                if ( fieldIdentifierValue.getFieldIdentifier().getId().toString().contains("assetId") )
                {
                    String assetUri = (String) fieldIdentifierValue.getValue();
                    if ( assetUri.startsWith("/asset/") ) assetUri = assetUri.substring(7);
                    Asset asset = this.assetFactory.getAsset(assetUri, headers);
                    return asset;
                }
            }
        }
        else if ( selectionFilter instanceof OsaSelectionFilter )
        {
            // this is to be backwards compatible to some predix 1.0 features
            org.mimosa.osacbmv3_3.SelectionFilter osaSelectionFilter = ((OsaSelectionFilter) selectionFilter)
                    .getSelectionFilter();
            if ( osaSelectionFilter instanceof SelectionFilterDefinition )
            {
                SelectionFilterDefinition selectionFilterDefinition = (SelectionFilterDefinition) osaSelectionFilter;
                for (FieldIdentifierValue fieldIdentifierValue : selectionFilterDefinition.getAssetSelectionFilter())
                {
                    if ( fieldIdentifierValue.getFieldIdentifier().getId().toString().contains("assetId") )
                    {
                        String assetUri = (String) fieldIdentifierValue.getValue();
                        if ( assetUri.startsWith("/asset/") ) assetUri = assetUri.substring(7);
                        Asset asset = this.assetFactory.getAsset(assetUri, headers);
                        return asset;
                    }
                }
                throw new UnsupportedOperationException("SelectionFilterDefinition did not contain a fieldId="
                        + "classfication/assetId");
            }
            throw new UnsupportedOperationException("Unable to query for asset, selectionFilter=" + selectionFilter);

        }
        else
            throw new UnsupportedOperationException("Unable to query for asset, selectionFilter=" + selectionFilter);
        return null;
    }

    /**
     * @param criteria
     * @return
     */
    private Meter lookupMeter(AssetMeter assetMeter)
    {
        List<Header> headers = this.restClient.getSecureTokenForClientId();
        this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());
        String meterUri = assetMeter.getUri();
        if ( !StringUtils.isEmpty(meterUri) )
        {
            if ( meterUri.startsWith("/meter/") ) meterUri = meterUri.substring(7);
            Meter meter = this.meterFactory.getMeter(meterUri, headers);
            return meter;

        }
        return null;
    }

    /**
     * @param sourceTag
     * @param criteria
     * @param endTime
     * @param map
     * @param headers
     * @return
     * 
     */
    private List<Double> getData(String uri, String assetMeterKey, String sourceTag, FieldDataCriteria criteria,
            Map map, List<Header> headers)
    {
        if ( criteria.getSelectionFilter() != null && criteria.getSelectionFilter() instanceof OsaSelectionFilter
                && ((OsaSelectionFilter) criteria.getSelectionFilter()).getSelectionFilter() != null )
        {
            return getDataFromOsaSelectionFilter(uri, assetMeterKey, sourceTag, criteria, map, headers);
        }
        else if ( criteria.getSelectionFilter() != null
                && criteria.getSelectionFilter() instanceof FieldSelectionFilter )
        {
            return getDataFromFieldSelectionFilter(uri, assetMeterKey, sourceTag, criteria.getSelectionFilter(),
                    headers);
        }
        else
            throw new UnsupportedOperationException("selectionFilter type=" + criteria.getSelectionFilter()
                    + " not supported");
    }

    /**
     * @param sourceTag
     * @param selectionFilter
     * @param headers
     * @param tsBuilder
     * @return
     * @throws DatatypeConfigurationException
     * @throws IOException
     */
/*    private List<Double> getDataFromFieldSelectionFilter(String uri, String assetMeterKey, String sourceTag,
            SelectionFilter selectionFilter, List<Header> headers)
    {
        try
        {
            TimeseriesQueryBuilder tsBuilder = TimeseriesQueryBuilder.getInstance();
            tsBuilder.addTags(assetMeterKey);

            XMLGregorianCalendar startTime = null;
            XMLGregorianCalendar endTime = null;
            FieldSelectionFilter fieldSelectionFilter = (FieldSelectionFilter) selectionFilter;
            for (FieldIdentifierValue fieldIdentifierValue : fieldSelectionFilter.getFieldIdentifierValue())
            {
                if ( fieldIdentifierValue.getFieldIdentifier().getId().equals("startTime") )
                    startTime = getXMLDate((String) fieldIdentifierValue.getValue());
                else if ( fieldIdentifierValue.getFieldIdentifier().getId().equals("endTime") )
                    endTime = getXMLDate((String) fieldIdentifierValue.getValue());
            }

            if ( startTime == null && endTime == null )
            {
                // default to now - TODO is this how to do it?
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                DatatypeFactory datatypeFactory;
                datatypeFactory = DatatypeFactory.newInstance();
                XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
                endTime = now;
            }

            tsBuilder.setStart(startTime.toGregorianCalendar().getTime());
            tsBuilder.setEnd(endTime.toGregorianCalendar().getTime());
            List<Double> dataPoints = doQuery(uri, sourceTag, tsBuilder, headers);

            return dataPoints;
        }
        catch (DatatypeConfigurationException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }*/
    
    /**
     * @param sourceTag
     * @param selectionFilter
     * @param headers
     * @param tsBuilder
     * @return
     * @throws DatatypeConfigurationException
     * @throws IOException
     */
    private List<Double> getDataFromFieldSelectionFilter(String uri, String assetMeterKey, String sourceTag,
            SelectionFilter selectionFilter, List<Header> headers)
    {
        try
        {
            TimeseriesQueryBuilder tsBuilder = TimeseriesQueryBuilder.getInstance();
            tsBuilder.addTags(assetMeterKey);
            Long startTime=null;
            Long endTime=null;
            
            FieldSelectionFilter fieldSelectionFilter = (FieldSelectionFilter) selectionFilter;
            for (FieldIdentifierValue fieldIdentifierValue : fieldSelectionFilter.getFieldIdentifierValue())
            {
                if ( fieldIdentifierValue.getFieldIdentifier().getId().equals("startTime") )
                    startTime = this.getTimeAsMilliSecs((String) fieldIdentifierValue.getValue());
                else if ( fieldIdentifierValue.getFieldIdentifier().getId().equals("endTime") )
                    endTime = this.getTimeAsMilliSecs((String) fieldIdentifierValue.getValue());
            }

            if ( startTime == null && endTime == null )
            {
                startTime= Long.valueOf(0);
            }
            DatapointsQuery query = new DatapointsQuery();
            query.setStart(startTime);
            query.setEnd(endTime);
            com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag();
            tag.setName(sourceTag);
            List<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag> tags = new ArrayList<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag>();
            tags.add(tag);
            query.setTags(tags);
            List<Double> dataPoints = doQuery(uri, sourceTag, query, headers);

            return dataPoints;
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param sourceTag
     * @param tsBuilder
     * @param headers
     * @return
     * @throws IOException
     */
    private List<Double> doQuery(String uri, String sourceTag, DatapointsQuery datapointsQuery, List<Header> headers)
            throws IOException
    {
    	//make a call to get the datapoints
        DatapointsResponse response = this.timeseriesFactory.queryForDatapoints(uri, datapointsQuery, headers);
        List<Object> datapoints = null;
        if(response==null || CollectionUtils.isEmpty(response.getTags())
				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults())
				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults().get(0).getValues())){
        	log.info("no datapoints" + " for " + sourceTag + " for query=" + datapointsQuery.toString());
        	//if above response was null try by setting the start time to 24 hours ago
			datapointsQuery.setStart("24h-ago");
			response = this.timeseriesFactory.queryForDatapoints(uri, datapointsQuery, headers);
			 if(response==null || CollectionUtils.isEmpty(response.getTags())
						|| CollectionUtils.isEmpty(response.getTags().get(0).getResults())
						|| CollectionUtils.isEmpty(response.getTags().get(0).getResults().get(0).getValues())){
				 //if still no datapoints are available return null
				 return null;
			 }
        }
			datapoints = response.getTags().get(0).getResults().get(0).getValues().get(0);
			log.info("datapoints size=" + datapoints.size() + " for " + sourceTag + " for query="
	                + datapointsQuery.toString());
 
        //convert the List<Object> to List<Double> to suit the return type
		List<Double> dpList = null;
		if(!CollectionUtils.isEmpty(datapoints)){
			dpList = new ArrayList<Double>();
			for(Object obj : datapoints){
				if(obj instanceof Long){			
					dpList.add(((Long)obj).doubleValue());
				}
				else if (obj instanceof Integer){
					dpList.add(((Integer)obj).doubleValue());
				}
				else{
					dpList.add((Double)obj);
				}
			}
		}
        return dpList;
    }

    /**
     * @param assetMeterKey
     * @param sourceTag
     * @param criteria
     * @param map
     * @param tsBuilder
     * @return
     * @throws IOException
     */
    private List<Double> getDataFromOsaSelectionFilter(String uri, String assetMeterKey, String sourceTag,
            FieldDataCriteria criteria, Map map, List<Header> headers)
    {
        try
        {
            TimeseriesQueryBuilder tsBuilder = TimeseriesQueryBuilder.getInstance();
            Long startTime = null;
            Long endTime = null;
 
            SelectionFilterType selectionFilterType = null;
            SelectionFilterDefinition selectionFilterDefinition = (SelectionFilterDefinition) ((OsaSelectionFilter) criteria
                    .getSelectionFilter()).getSelectionFilter();
            if ( selectionFilterDefinition.getStartDefinition().getSelectionFilterType() != null )
            {
                selectionFilterType = selectionFilterDefinition.getStartDefinition().getSelectionFilterType();
            }
            // TODO get the Start and/or End Time from this type of SelectionFilter
            if ( selectionFilterDefinition != null && selectionFilterType != null
                    && selectionFilterType.equals(SelectionFilterType.ROW_SELECTION_FILTER) )
            {
               
            	 if ( startTime == null && endTime == null )
                 {            
                     startTime= Long.valueOf(0);                    
                     endTime = Calendar.getInstance().getTimeInMillis(); //now time
                     
                 }

                String mapStart = null;
                for (com.ge.dsp.pm.ext.entity.util.map.Entry entry : map.getEntry())
                {
                    if ( entry.getKey().equals("START-TIME") ) mapStart = entry.getValue().toString();
                    startTime = Long.valueOf(entry.getValue().toString());
                }

                if ( mapStart != null )
                {
                    // get all datapoints since last run - as passed by caller
                	startTime = Long.valueOf(mapStart);
                }
                DatapointsQuery datapointsQuery = new DatapointsQuery();
                datapointsQuery.setStart(startTime);
                datapointsQuery.setEnd(endTime);
                
                com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag();
                tag.setName(sourceTag);
                List<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag> tags = new ArrayList<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag>();
                datapointsQuery.setTags(tags);
                
                this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());
                DatapointsResponse response = this.timeseriesFactory.queryForDatapoints(uri, datapointsQuery, headers);
                List<Object> datapoints = null;
                if(response==null || CollectionUtils.isEmpty(response.getTags())
        				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults())
        				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults().get(0).getValues())){
                	log.info("no datapoints" + " for " + sourceTag + " for query=" + datapointsQuery.toString());
                	return null;
                }
                datapoints = response.getTags().get(0).getResults().get(0).getValues().get(0);
            	List<Double> dpList = null;
        		if(!CollectionUtils.isEmpty(datapoints)){
        			dpList = new ArrayList<Double>();
        			for(Object obj : datapoints){
        				if(obj instanceof Long)
        				{			
        					dpList.add(((Long)obj).doubleValue());
        				}
        				else{
        					dpList.add((Double)obj);
        				}
        			}
        		}
        		return dpList;
            }
            else if ( selectionFilterDefinition != null && selectionFilterType != null
                    && selectionFilterType.equals(SelectionFilterType.TIME_SELECTION_FILTER) )
            {

                // do default behavior get current data point
                // sourceTag = "kairosdb.datastore.query_row_count";
                // sourceTag = "kairosdb.datastore.query_time";
                log.info("assetMeterKey=" + assetMeterKey);
                log.info("sourceTag=" + sourceTag);

                // insight is giving time in local timezone
                long anchorTimeInLocalTimeZone = selectionFilterDefinition.getEndDefinition().getTimeSelectionFilter()
                        .getAnchorTime().getTimeBinary().longValue();
                TimeZone timeZone = TimeZone.getDefault();
                startTime = anchorTimeInLocalTimeZone - timeZone.getOffset(anchorTimeInLocalTimeZone);
               
                String mapStart = null;
                if ( map != null )
                {
                    for (com.ge.dsp.pm.ext.entity.util.map.Entry entry : map.getEntry())
                    {
                        if ( "START-TIME".equals(entry.getKey()) )
                        {
                            mapStart = entry.getValue().toString(); // assume
                                                                    // it's in
                            										// UTC
                            startTime = Long.valueOf(entry.getValue().toString());
                        }
                    }
                }

                if ( mapStart != null )
                {
                    // get all datapoints since last run - as passed by caller
                	startTime = Long.valueOf(mapStart);
                }
                else if ( selectionFilterDefinition.getEndDefinition().getTimeSelectionFilter().getAnchorTime()
                        .getTimeBinary() != null )
                {
                    anchorTimeInLocalTimeZone = selectionFilterDefinition.getStartDefinition().getTimeSelectionFilter()
                            .getAnchorTime().getTimeBinary().longValue();
                    timeZone = TimeZone.getDefault();
                    startTime = anchorTimeInLocalTimeZone - timeZone.getOffset(anchorTimeInLocalTimeZone);                  
                }
                else
                {
                    // get current datapoint
                	startTime = Calendar.getInstance().getTimeInMillis(); //now time                    
                    // builder.setEnd(duration, unit)
                    // AggregatorFactory.createCountAggregator(value, unit)
                    // builder.addMetric(sourceTag).addAggregator(AggregatorFactory.createSumAggregator(1,
                    // TimeUnit.MILLISECONDS)
                    // // AggregatorFactory.createAverageAggregator(5,
                    // TimeUnit.DAYS)
                    // );
                }
                
                DatapointsQuery query = new DatapointsQuery();
                query.setStart(startTime);
                query.setEnd(endTime);
                com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag();
                tag.setName(sourceTag);
                List<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag> tags = new ArrayList<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag>();
                tags.add(tag);
                query.setTags(tags);                           
                List<Double> dataPoints = doQuery(uri, sourceTag, query, headers);

                return dataPoints;
            }
            else
                throw new UnsupportedOperationException("selectionFilterType=" + selectionFilterType + " not supported");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    private void validateRequest(GetFieldDataRequest request)
    {
        if ( request.getFieldDataCriteria() == null ) throw new UnsupportedOperationException("No FieldDataCriteria");
        if ( request.getFieldDataCriteria().size() == 0 )
            throw new UnsupportedOperationException("No FieldDataCriteria array items");
    }

    /**
     * @param externalAttributeMap
     * @param arg
     * @return
     */
    private Object getMapEntry(Map externalAttributeMap, String arg)
    {
        if ( externalAttributeMap != null )
            for (com.ge.dsp.pm.ext.entity.util.map.Entry entry : externalAttributeMap.getEntry())
            {
                if ( entry.getKey() != null && entry.getKey().equals(arg) ) return entry.getValue();
            }
        return null;
    }

    /**
     * @param entity
     *            to be wrapped into JSON response
     * @return JSON response with entity wrapped
     */
    protected Response handleResult(Object entity)
    {
        ResponseBuilder responseBuilder = Response.status(Status.OK);
        responseBuilder.type(MediaType.APPLICATION_JSON);
        responseBuilder.entity(entity);
        return responseBuilder.build();
    }

    @Override
    public Response heartbeat(String id)
    {
        return Heartbeat.heartbeat(id);
    }
}
