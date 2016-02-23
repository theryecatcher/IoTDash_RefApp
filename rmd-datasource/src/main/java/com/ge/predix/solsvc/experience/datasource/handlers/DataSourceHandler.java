package com.ge.predix.solsvc.experience.datasource.handlers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.math.util.MathUtils;
import org.apache.http.Header;
import org.kairosdb.client.builder.DataFormatException;
import org.kairosdb.client.builder.MetricBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import com.ge.predix.solsvc.bootstrap.ams.dto.AssetMeter;
import com.ge.predix.solsvc.bootstrap.ams.dto.Attribute;
import com.ge.predix.solsvc.bootstrap.ams.dto.Meter;
import com.ge.predix.solsvc.bootstrap.ams.dto.MeterDatasource;
import com.ge.predix.solsvc.bootstrap.ams.factories.AssetFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.GroupFactory;
import com.ge.predix.solsvc.bootstrap.ams.factories.MeterFactory;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.DatapointsLatestQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Aggregation;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.DatapointsQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.bootstrap.tsb.client.TimeseriesRestConfig;
import com.ge.predix.solsvc.bootstrap.tsb.factories.TimeseriesFactory;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.AssetKpiDataGrid;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.BaseKpiDataGrid;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.SummaryKpiColumn;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.SummaryKpiDataGridResponse;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;

/**
 * 
 * @author 212421693
 *
 */

public abstract class DataSourceHandler {

	private static Logger log = LoggerFactory
			.getLogger(DataSourceHandler.class);

	/**
     * 
     */
	public static final String GROUP_FILTER = "GROUP"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String PARENT_FILTER = "parent"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String IS_KPI_METER = "isKpi=true"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String MAC_URL = "machineUrl"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String SUMMARY_ASSET_ATT = "attributes.summary.value"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String SUMMARY_METERS = "summaryMeter"; //$NON-NLS-1$

	/**
     * 
     */
	public static final String MACHINE_URI = "machineUri"; //$NON-NLS-1$
	@SuppressWarnings("unused")
	private static final String METER_EXTENSIONS_URI = "meterExtensionsUri"; //$NON-NLS-1$

	/**
     * 
     */
	protected static final int DATAPOINT_TS = 0;

	/**
     * 
     */
	protected static final int DATAPOINT_VALUE = 1;
	
	/**
	 * 
	 */
	protected static final int DATAPOINT_QLTY = 2;

	/**
     * 
     */
	@Autowired
	protected CxfAwareRestClient restClient;

	/**
     * 
     */
	@Autowired
	protected AssetRestConfig assetRestConfig;

	@Autowired
	private TimeseriesFactory timeseriesFactory;

	@Autowired
	private AssetFactory assetFactory;

	/**
	 * 
	 */
	@Autowired
	protected GroupFactory groupFactory;

	@Autowired
	private MeterFactory meterFactory;

	@Autowired
	private TimeseriesRestConfig timeseriesRestConfig;

	/**
	 * Set up metrics for time series
	 * 
	 * @return -
	 */

	public List<MetricBuilder> setUpTimeseriesMetrics() {

		List<MetricBuilder> metricBuilder = new ArrayList<MetricBuilder>();

		return metricBuilder;

	}

	/**
	 * @param id
	 *            : id
	 * @param start_time
	 *            : start_time
	 * @param end_time
	 *            : end_time
	 * @param authorization
	 *            : authorization
	 * @return List<BaseKpiDataGrid>
	 * @throws DataFormatException
	 *             -
	 */

	public abstract List<BaseKpiDataGrid> getWidgetData(String id,
			String start_time, String end_time, String authorization)
			throws DataFormatException;

	/**
	 * Calls Timeseries Endpoint to fetch the Meter last value
	 * 
	 * @param assetMeterName
	 *            : assetMeterName
	 * @param assetMeter
	 *            : assetMeter
	 * @param authorization
	 *            : authorization
	 * @return Value
	 */

	
	/**
	 * Calls Timeseries Endpoint to fetch the Meter last value
	 * 
	 * @param assetMeterName
	 *            : assetMeterName
	 * @param assetMeter
	 *            : assetMeter
	 * @param authorization
	 *            : authorization
	 * @return Value
	 */
	protected List<Double> getCurrentValue(String assetMeterName,
			AssetMeter assetMeter, String authorization) {
		
		List<Header> headers = new ArrayList<Header>();
		this.restClient.addSecureTokenToHeaders(headers, authorization);
		this.restClient.addZoneToHeaders(headers,
				this.timeseriesRestConfig.getZoneId());

		DatapointsLatestQuery latestDatapoints = new DatapointsLatestQuery();
		com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag();
		tag.setName(assetMeter.getSourceTagId());
		List<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag> tags = new ArrayList<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag>();
		tags.add(tag);
		latestDatapoints.setTags(tags);
		
		DatapointsResponse response = this.getTimeseriesFactory().queryForLatestDatapoint(this.timeseriesRestConfig.getBaseUrl(), latestDatapoints, headers);
		
		List<Double> currentValueList = createCurrentValueList(response);

		return currentValueList;
	}

	/**
	 * @param response Response object from the Time Series API call
	 * @return -
	 */
	public static List<Double> createCurrentValueList(DatapointsResponse response) {
		if(response==null || CollectionUtils.isEmpty(response.getTags())
				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults())
				|| CollectionUtils.isEmpty(response.getTags().get(0).getResults().get(0).getValues())){
			return null;
		}
		
		List<Object>  responseValues = response.getTags().get(0).getResults().get(0).getValues().get(0);
		List<Double> currentValueList = new ArrayList<Double>();
		if(!CollectionUtils.isEmpty(responseValues) && responseValues.size()>2){
				for(Object obj : responseValues){
					if(obj instanceof Long){
					currentValueList.add(((Long)obj).doubleValue());
					}
					else if(obj instanceof Integer){
						currentValueList.add(((Integer)obj).doubleValue());
					}
					else{
						currentValueList.add((Double)obj);
					}
				}				
		}
		return currentValueList;
	}

	/**
	 * 
	 * @param meterUri
	 *            : meterUri
	 * @param authorization
	 *            : authorization
	 * @return Meter
	 */
	protected Meter getMeter(String meterUri, String authorization) {
		// GET Meter
		List<Header> headers = new ArrayList<Header>();
		this.restClient.addSecureTokenToHeaders(headers, authorization);
		this.restClient.addZoneToHeaders(headers,
				this.assetRestConfig.getZoneId());
		Meter meter = this.getMeterFactory().getMeter(
				meterUri.replace("/meter/", ""), //$NON-NLS-1$ //$NON-NLS-2$
				headers);
		return meter;
	}

	/**
	 * 
	 * @param currentValue
	 *            : currentValue
	 * @param assetMeter
	 *            : assetMeter
	 * @return Boolean
	 */
	protected Boolean getMeterAlertStatus(Double currentValue,
			AssetMeter assetMeter) {
		Boolean isAlert = null;
		if (assetMeter.getOutputMinimum() != null
				&& assetMeter.getOutputMaximum() != null) {
			if (currentValue > assetMeter.getOutputMinimum()
					&& currentValue < assetMeter.getOutputMaximum()) {
				return Boolean.FALSE;
			}
			return Boolean.TRUE;

		} else if (assetMeter.getOutputMinimum() != null
				&& currentValue > assetMeter.getOutputMinimum()) {
			isAlert = Boolean.FALSE;
		} else if (assetMeter.getOutputMaximum() != null
				&& currentValue < assetMeter.getOutputMaximum()) {
			isAlert = Boolean.FALSE;
		}

		return isAlert;
	}

	/**
	 * @param asset
	 *            -
	 * @return -
	 */
	protected boolean hasKpi(Asset asset) {
		LinkedHashMap<String, AssetMeter> meters = asset.getAssetMeter();
		if (meters != null) {
			for (Entry<String, AssetMeter> entry : meters.entrySet()) {
				AssetMeter assetMeter = entry.getValue();
				if (assetMeter.getMeterDatasource().getIsKpi() != null
						&& StringUtils.containsIgnoreCase(assetMeter
								.getMeterDatasource().getIsKpi().toString(),
								"TRUE")) { //$NON-NLS-1$
					return true;
				}
			}
		}
		return false;

	}

	/**
	 * 
	 * @param id
	 *            : id
	 * @param startTime
	 *            : start_time
	 * @param endTime
	 *            : end_time
	 * @param authorization
	 *            : authorization
	 * @return SummaryKpiDataGridResponse
	 */
	public SummaryKpiDataGridResponse getSummary(String id, String startTime,
			String endTime, String authorization) {

		SummaryKpiDataGridResponse summaryKpiDataGrid = new SummaryKpiDataGridResponse();
		

		Asset asset = getSummaryAsset(id, authorization);

		setSummaryBasedOnMeters(summaryKpiDataGrid, asset, authorization,
				startTime, endTime);

		Double availability = getAvailability(id, authorization, startTime,
				endTime); //?? startTime and endTime are not used in getAvailability method

		Double reliability = new Double(60);

		addkpi(summaryKpiDataGrid, MathUtils.round(reliability, 3),
				"Reliability", "%"); //$NON-NLS-1$ //$NON-NLS-2$
		addkpi(summaryKpiDataGrid, MathUtils.round(availability, 3),
				"Availability", "%");//$NON-NLS-1$ //$NON-NLS-2$
		summaryKpiDataGrid.getOverall().setTitle("KPI Health");//$NON-NLS-1$ 
		summaryKpiDataGrid.getOverall().setSubtitle(id);
		summaryKpiDataGrid.getOverall().setPercentage(availability);

		return summaryKpiDataGrid;
	}

	/**
	 * 
	 * @param summaryKpiDataGrid
	 *            : summaryKpiDataGrid
	 * @param asset
	 *            : asset
	 * @param authorization
	 *            : authorization
	 * @param startTime
	 *            : startTime
	 * @param endTime
	 *            : endTime
	 */
	protected void setSummaryBasedOnMeters(
			SummaryKpiDataGridResponse summaryKpiDataGrid, Asset asset,
			String authorization, String startTime, String endTime) {

		AssetMeter outputMeter = null;
		AssetMeter summary2Meter = null;
		if (asset != null && asset.getAttributes() != null
				&& asset.getAttributes().containsKey(SUMMARY_METERS)) {
			String totalOutputMeter = null;
			String summary2OutputMeter = null;
			Attribute listAttributes = asset.getAttributes()
					.get(SUMMARY_METERS);
			if (listAttributes.getValue() != null
					&& listAttributes.getValue().size() >= 2) {
				totalOutputMeter = (String) listAttributes.getValue().get(0);
				summary2OutputMeter = (String) listAttributes.getValue().get(1);
			} else if (listAttributes.getValue() != null
					&& listAttributes.getValue().size() > 1) {
				totalOutputMeter = (String) listAttributes.getValue().get(0);
			}

			LinkedHashMap<String, AssetMeter> meters = asset.getAssetMeter();
			if (meters != null) {
				for (Entry<String, AssetMeter> entry : meters.entrySet()) {
					entry.getKey();

					if ((entry.getKey()).equalsIgnoreCase(totalOutputMeter)) {
						outputMeter = entry.getValue();
					}
					if ((entry.getKey()).equalsIgnoreCase(summary2OutputMeter)) {
						summary2Meter = entry.getValue();
					}
				}
			}
			Double average=0d;
			Meter meter = null;
			if (outputMeter != null) {
				meter = getMeter(outputMeter.getUri(), authorization);
				if (meter != null) {
					average = getSummaryOutput(
							outputMeter.getUri().replace("/meter/", ""),//$NON-NLS-1$ //$NON-NLS-2$
							outputMeter, authorization, summaryKpiDataGrid,
							startTime, endTime);
					if (average==null || average==0d) {
						average = 10d;
					}
					addkpi(summaryKpiDataGrid, MathUtils.round(average, 3),
							"Output (avg)", meter.getUom());//$NON-NLS-1$ 
				}

			} else {
				addkpi(summaryKpiDataGrid, MathUtils.round(10d, 3),
						"Output (avg)", "");//$NON-NLS-1$ //$NON-NLS-2$
			}

			if (summary2Meter != null) {
				meter = getMeter(summary2Meter.getUri(), authorization);
				if (meter != null) {
					average = getSummaryOutput(
							summary2Meter.getUri().replace("/meter/", ""),//$NON-NLS-1$ //$NON-NLS-2$
							summary2Meter, authorization, summaryKpiDataGrid,
							startTime, endTime);
					if (average==null || average==0d) {
						average = 10d;
					}
					addkpi(summaryKpiDataGrid, MathUtils.round(average, 3),
							meter.getName() + " (avg)", meter.getUom());//$NON-NLS-1$ 
				}
			} else {

				addkpi(summaryKpiDataGrid, MathUtils.round(10d, 3),
						"Output (avg)", ""); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}

	}

	/**
	 * 
	 * @param id
	 *            : id
	 * @param authorization
	 *            : authorization
	 * @param start_time
	 *            : start_time
	 * @param end_time
	 *            : end_time
	 * @return Double
	 */
	protected Double getAvailability(String id, String authorization,
			String start_time, String end_time) {
		Double availability = 0d;
		try {

			int metersNotInAlarmState = 0;
			List<BaseKpiDataGrid> groupList = getWidgetData(id, start_time,
					end_time, authorization);

			for (BaseKpiDataGrid basekpi : groupList) {
				if (basekpi.getAlertStatus() == null
						|| !basekpi.getAlertStatus()) {
					metersNotInAlarmState++;
				}
			}

			if (groupList != null && metersNotInAlarmState > 0) {
				availability = (double) ((metersNotInAlarmState * 100) / groupList
						.size());
				log.debug("getAvailability" + availability + "= (" + metersNotInAlarmState + "* 100 ) / " + groupList.size());//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

		} catch (DataFormatException e) {
			log.error("Data format Exception" + e, e); //$NON-NLS-1$
		}
		return availability;
	}

	/**
	 * 
	 * @param id
	 *            : id
	 * @param authorization
	 *            : authorization
	 * @return Asset
	 */
	public Asset getSummaryAsset(String id, String authorization) {

		// GET asset
		List<Header> headers = new ArrayList<Header>();
		this.restClient.addSecureTokenToHeaders(headers, authorization);
		this.restClient.addZoneToHeaders(headers,
				this.assetRestConfig.getZoneId());
		List<Asset> assets = this.getAssetFactory().getAssetsByFilter(null,
				SUMMARY_ASSET_ATT, "/" + GROUP_FILTER.toLowerCase() + "/" + id, //$NON-NLS-1$ //$NON-NLS-2$
				headers);
		if (assets != null && assets.size() >= 1) {
			return assets.get(0);
		}
		return null;
	}

	/**
	 * 
	 * @param summaryKpiDataGrid
	 *            : summaryKpiDataGrid
	 * @param output
	 *            : output
	 * @param label
	 *            : label
	 * @param uom
	 *            : uom
	 */
	protected void addkpi(SummaryKpiDataGridResponse summaryKpiDataGrid,
			Double output, String label, String uom) {
		summaryKpiDataGrid.getKpis().add(
				new SummaryKpiColumn(output.toString(), label, uom));

	}

	/**
	 * @param assetMeterName
	 *            : assetMeterName
	 * @param assetMeter
	 *            : assetMeter
	 * @param authorization
	 *            : authorization
	 * @param summaryKpiDataGrid
	 *            : summaryKpiDataGrid
	 * @param startTime
	 *            : startTime
	 * @param endTime
	 *            :endTime
	 * @return Double
	 */
	 

	protected Double getSummaryOutput(String assetMeterName, AssetMeter assetMeter, String authorization,
            SummaryKpiDataGridResponse summaryKpiDataGrid, String startTime, String endTime)
    {
    	
    	DatapointsQuery datapointsQuery = buildDatapointsQueryRequest(
				assetMeter, startTime, endTime);
                    
        List<Header> headers = new ArrayList<Header>();
        this.restClient.addSecureTokenToHeaders(headers, authorization);
        this.restClient.addZoneToHeaders(headers, this.timeseriesRestConfig.getZoneId());
        DatapointsResponse response = this.getTimeseriesFactory().queryForDatapoints(this.timeseriesRestConfig.getBaseUrl(), datapointsQuery, headers);
        log.debug(response.toString());
        Double avg = getAverageFromDatapointsResponse(response);
        return avg;
    }

	/**
	 * @param response
	 * 				: DatapointsResponse
	 * @return -
	 */
	public static Double getAverageFromDatapointsResponse(DatapointsResponse response) {
		if(response==null || CollectionUtils.isEmpty(response.getTags())
        		||CollectionUtils.isEmpty(response.getTags().get(0).getResults())
        		|| CollectionUtils.isEmpty(response.getTags().get(0).getResults().get(0).getValues())){    
    	   return null;
        }  
        List<List<Object>> averages = response.getTags().get(0).getResults().get(0).getValues();
        List<Object> average = averages.get(0);	//taking the first element in the list of values
        Double avg =null;
        if(average!=null && average.get(1)!=null){
        	try{
        		avg = (Double)average.get(1); //the middle value in the array indicates the avg	 
        	}catch (ClassCastException e){
        	    log.debug("Unable to cast value to double. Setting average to 0d", e); //$NON-NLS-1$
        	    throw new RuntimeException("Unable to cast value to double. Setting average to 0d", e); //$NON-NLS-1$
        		}
        }
        else{
        	avg = 0d;
        }
		return avg;
	}

	private DatapointsQuery buildDatapointsQueryRequest(AssetMeter assetMeter,
			String startTime, String endTime) {
		DatapointsQuery datapointsQuery = new DatapointsQuery();       	
        if ( startTime == null )
        {
        	datapointsQuery.setStart("1y-ago"); //$NON-NLS-1$
        }
        else
        {
        	datapointsQuery.setStart(startTime);
        }
        if ( endTime != null )
        {
        	datapointsQuery.setEnd(endTime);
        }
        
        com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag();
        tag.setName(assetMeter.getSourceTagId());
        
        Aggregation aggregation = new Aggregation();
        aggregation.setType("avg"); //$NON-NLS-1$
        aggregation.setInterval("5d"); //$NON-NLS-1$
        List<Aggregation> aggregations = new ArrayList<Aggregation>();
        aggregations.add( aggregation);
        tag.setAggregations(aggregations);
        
        List<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag> tags = new ArrayList<com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag>();
        tags.add(tag);
        datapointsQuery.setTags(tags);
		return datapointsQuery;
	}

	/**
	 * @param meterName
	 *            -
	 * @param assetMeter
	 *            -
	 * @param authorization
	 *            -
	 * @return -
	 */
	@SuppressWarnings({ "cast" })
	protected AssetKpiDataGrid getAnalyticsDrivenAssetDataGrid(
			String meterName, AssetMeter assetMeter, String authorization) {
		AssetKpiDataGrid assetKpiDataGrid = null;
		// check if datasource has the meterExtenstionsUri
		String meterExtensionUrl = null;
		if (assetMeter.getMeterDatasource() instanceof MeterDatasource
				&& assetMeter.getMeterDatasource().getMeterExtensionsUri() != null
				&& !(assetMeter.getMeterDatasource()).getMeterExtensionsUri()
						.toString().isEmpty()) {
			meterExtensionUrl = assetMeter.getMeterDatasource()
					.getMeterExtensionsUri().toString();
		} else {
			return null;
		}

		Asset asset = getAsset(
				meterExtensionUrl.replace("/asset/", ""), authorization);//$NON-NLS-1$ //$NON-NLS-2$
		String alertStatus = getValueFromAttributes(asset, "alertStatus");//$NON-NLS-1$
		String alertType = getValueFromAttributes(asset, "alertType");//$NON-NLS-1$
		String alertLevel = getValueFromAttributes(asset, "alertLevel");//$NON-NLS-1$
		String thresholdDiff = getValueFromAttributes(asset, "thresholdDiff");//$NON-NLS-1$
		String alarmLevelValue = getValueFromAttributes(asset,
				"alarmLevelValue");//$NON-NLS-1$
		String alarmLevelValueTime = getValueFromAttributes(asset,
				"alarmLevelValueTime");//$NON-NLS-1$
		String sourceType = getValueFromAttributes(asset, "sourceType");//$NON-NLS-1$
		log.debug("***Analytics Meter information**** for " + meterName); //$NON-NLS-1$
		log.debug("alertStatus = " + alertStatus);//$NON-NLS-1$
		log.debug("alertType = " + alertType);//$NON-NLS-1$
		log.debug("alertLevel = " + alertLevel);//$NON-NLS-1$
		log.debug("thresholdDiff = " + thresholdDiff);//$NON-NLS-1$
		log.debug("alarmLevelValue = " + alarmLevelValue);//$NON-NLS-1$

		if (!org.springframework.util.StringUtils.isEmpty(sourceType)
				&& !org.springframework.util.StringUtils.isEmpty(alertStatus)
				&& !org.springframework.util.StringUtils.isEmpty(alertType)
				&& !org.springframework.util.StringUtils.isEmpty(alertLevel)
				&& !org.springframework.util.StringUtils.isEmpty(thresholdDiff)
				&& !org.springframework.util.StringUtils
						.isEmpty(alarmLevelValue)
				&& !org.springframework.util.StringUtils
						.isEmpty(alarmLevelValueTime)) {

			assetKpiDataGrid = new AssetKpiDataGrid();
			assetKpiDataGrid.setAlertStatus(Boolean.valueOf(alertStatus));
			assetKpiDataGrid.setAlertStatusType(alertType);
			assetKpiDataGrid.setCurrentValue(new Double(alarmLevelValue));
			assetKpiDataGrid.setDeltaThreshold(new Double(thresholdDiff));
			assetKpiDataGrid.setDeltaThresholdLevel(alarmLevelValue);
			assetKpiDataGrid.setLastMeterReading(new Long(alarmLevelValueTime));
		}

		return assetKpiDataGrid;
	}

	private String getValueFromAttributes(Asset asset, String attributeName) {
		String attValue = null;
		Attribute attribute = asset.getAttributes().get(attributeName);

		if (attribute != null
				&& !org.springframework.util.StringUtils.isEmpty(attribute
						.getValue()) && attribute.getValue().size() > 0) {
			if (!org.springframework.util.StringUtils.isEmpty(attribute
					.getValue().get(0))) {
				attValue = attribute.getValue().get(0).toString();
				log.debug("attributeName" + attributeName + "=" + attValue);//$NON-NLS-1$ //$NON-NLS-2$
			}
		}

		return attValue;
	}

	/**
	 * @param id
	 *            -
	 * @param authorization
	 *            -
	 * @return -
	 */
	public Asset getAsset(final String id, final String authorization) {
		Asset asset = null;
		if (authorization == null) {
			// Note in your app you may want to throw an exception rather than
			// use the info in the property file
			List<Header> headers = this.restClient.getSecureTokenForClientId();
			this.restClient.addZoneToHeaders(headers,
					this.assetRestConfig.getZoneId());
		} else {
			List<Header> headers = new ArrayList<Header>();
			this.restClient.addSecureTokenToHeaders(headers, authorization);
			this.restClient.addZoneToHeaders(headers,
					this.assetRestConfig.getZoneId());
			asset = this.getAssetFactory().getAsset(id, headers);
		}
		return asset;
	}

	/**
	 * @return the restClient
	 */
	public CxfAwareRestClient getRestClient() {
		return this.restClient;
	}

	/**
	 * @param restClient
	 *            the restClient to set
	 */
	public void setRestClient(CxfAwareRestClient restClient) {
		this.restClient = restClient;
	}

	/**
	 * @return the restConfig
	 */
	public AssetRestConfig getAssetRestConfig() {
		return this.assetRestConfig;
	}

	/**
	 * @return the timeseriesFactory
	 */
	public TimeseriesFactory getTimeseriesFactory() {
		return this.timeseriesFactory;
	}

	/**
	 * @return the assetFactory
	 */
	public AssetFactory getAssetFactory() {
		return this.assetFactory;
	}

	/**
	 * @return the meterFactory
	 */
	public MeterFactory getMeterFactory() {
		return this.meterFactory;
	}

}
