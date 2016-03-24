package com.ge.predix.solsvc.bootstrap.tsb.factories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kairosdb.client.builder.AggregatorFactory;
import org.kairosdb.client.builder.TimeUnit;
import org.kairosdb.client.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.DatapointsLatestQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Filters;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Measurements;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Qualities;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Aggregation;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.DatapointsQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.Tag;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionBody;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetric;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetricBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryTag;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryTag.Order;
import com.ge.predix.solsvc.bootstrap.tbs.response.entity.TimeseriesQueryResponse;
import com.ge.predix.solsvc.ext.util.JsonMapper;

/**
 * 
 * 
 * @author 212421693
 */

@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest({ "server.port=0" })
@ComponentScan("com.ge.predix.solsvc.restclient")
@ActiveProfiles("local")
public class TimeseriesFactoryIT extends BaseFactoryIT {

	/**
     * 
     */
	@Autowired
	protected TimeseriesFactory timeseriesFactory;
	
	   @Autowired
	    protected JsonMapper jsonMapper;
	 
	   private static Logger  log = LoggerFactory.getLogger(TimeseriesFactoryIT.class);

	/**
	 * -
	 */
	@Test
	public void runAllTest() {
		List<Header> headers = this.restClient.getSecureTokenForClientId();
		this.restClient.addZoneToHeaders(headers,
				this.timeseriesRestConfig.getZoneId());
		createMetrics();
		try {
			Thread.sleep(1000); // / due to delay in Injection pipeline and
								// query
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
//		queryForDatapoints(headers);
//		queryForDatapointsWithMilliSecsAsStartTime(headers);
//		queryForDatapointsAndOrder(headers);
//		queryForLatestDatapoints(headers);
	}
	
	
	/**
	 * @return -
	 * 
	 */
	/**
	 * @return -
	 */
	public List<String> getVersion() {
		List<Header> headers = this.restClient.getSecureTokenForClientId();
		List<String> version = this.timeseriesFactory.getVersion(headers);
		return version;
	}


	/**
	 * -
	 */
	public void createMetrics() {
		for (int i = 0; i < 10; i++) {
			InjectionMetricBuilder builder = InjectionMetricBuilder
					.getInstance();
			InjectionMetric metric = new InjectionMetric(new Long(
					System.currentTimeMillis()));
			InjectionBody body = new InjectionBody("RMD_metric1"); //$NON-NLS-1$
			body.addAttributes("host", "server1"); //$NON-NLS-1$//$NON-NLS-2$
			body.addAttributes("customer", "Acme"); //$NON-NLS-1$//$NON-NLS-2$
			body.addDataPoint(System.currentTimeMillis(), 10).addDataPoint(
					System.currentTimeMillis(), 30L);
			metric.getBody().add(body);
			builder.addMetrics(metric);
			Response response = this.timeseriesFactory.create(builder);
			assertTrue(response != null);

		}

	}

	public void queryForDatapoints(List<Header> headers){
		DatapointsQuery datapoints = new DatapointsQuery();
		datapoints.setStart("1y-ago");

		Tag tag = new Tag();
		tag.setName("RMD_metric1");
		
		Aggregation agg = new Aggregation();
		agg.setInterval("2d");
		agg.setType("avg");
		List<Aggregation> aggs = new ArrayList<Aggregation>();	
		aggs.add(agg);
		tag.setAggregations(aggs);
		
		List<Tag> tags = new ArrayList<Tag>();
		tags.add(tag);
		datapoints.setTags(tags);
		DatapointsResponse response = this.timeseriesFactory.queryForDatapoints(this.timeseriesRestConfig.getBaseUrl(), datapoints, headers);
		assertEquals("Acme",response.getTags().get(0).getResults().get(0).getAttributes().get("customer").get(0));
		assertEquals("server1", response.getTags().get(0).getResults().get(0).getAttributes().get("host").get(0));
	}
	
	public void queryForDatapointsWithMilliSecsAsStartTime(List<Header> headers){
		DatapointsQuery datapoints = new DatapointsQuery();
		datapoints.setStart(1427463525000d);

		Tag tag = new Tag();
		tag.setName("RMD_metric1");
		
		Aggregation agg = new Aggregation();
		agg.setInterval("2d");
		agg.setType("avg");
		List<Aggregation> aggs = new ArrayList<Aggregation>();	
		aggs.add(agg);
		tag.setAggregations(aggs);
		
		List<Tag> tags = new ArrayList<Tag>();
		tags.add(tag);
		datapoints.setTags(tags);
		DatapointsResponse response = this.timeseriesFactory.queryForDatapoints(this.timeseriesRestConfig.getBaseUrl(), datapoints, headers);
		log.debug(response.toString());
		assertEquals("Acme",response.getTags().get(0).getResults().get(0).getAttributes().get("customer").get(0));
		assertEquals("server1", response.getTags().get(0).getResults().get(0).getAttributes().get("host").get(0));
	}

	
	public void queryForDatapointsAndOrder(List<Header> headers){
		DatapointsQuery datapoints = new DatapointsQuery();
		datapoints.setStart("1y-ago");

		Tag tag = new Tag();
		tag.setName("RMD_metric1");
		tag.setOrder("desc");
		
		Aggregation agg = new Aggregation();
		agg.setInterval("2d");
		agg.setType("avg");
		List<Aggregation> aggs = new ArrayList<Aggregation>();	
		aggs.add(agg);
		tag.setAggregations(aggs);
		
		List<Tag> tags = new ArrayList<Tag>();
		tags.add(tag);
		datapoints.setTags(tags);
		DatapointsResponse response = this.timeseriesFactory.queryForDatapoints(this.timeseriesRestConfig.getBaseUrl(), datapoints, headers);
		assertEquals("Acme",response.getTags().get(0).getResults().get(0).getAttributes().get("customer").get(0));
		assertEquals("server1", response.getTags().get(0).getResults().get(0).getAttributes().get("host").get(0));
	}
	
	public void queryForLatestDatapoints(List<Header> headers){
		DatapointsLatestQuery datapoints = new DatapointsLatestQuery();
		com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag
		tag = new com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Tag();
		tag.setName("RMD_metric1");
		
		List list = new ArrayList();
		list.add("server1");
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("host", list);
		
		com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.Filters filters = new Filters();
		filters.setAttributes(map);
		
		Measurements measurements = new Measurements();
		measurements.setCondition("le");
		List<Integer> values = new ArrayList<Integer>();
		values.add(36);
		measurements.setValues(values);
		filters.setMeasurements(measurements);
		Qualities qualities = new Qualities();
		List<String> qualValues = new ArrayList<String>();
		qualValues.add("3");
		qualities.setValues(qualValues);
		filters.setQualities(qualities);
		
		tag.setFilters(filters);
		List tagList = new ArrayList();
		tagList.add(tag);
		datapoints.setTags(tagList);
		DatapointsResponse response = this.timeseriesFactory.queryForLatestDatapoint(this.timeseriesRestConfig.getBaseUrl(), datapoints, headers);
	}


	

	@Test
	public void testCastToDatapointsResponse(){
		String responseStr = "{\"tags\": [{\"name\": \"RMD_metric1\",\"results\":"
				+ " [{\"groups\": [{\"name\": \"type\",\"type\": \"number\"}],\"attributes\":"
				+ " {\"customer\": [\"Acme\"],\"host\": [\"server1\"]},\"values\": [[1449149055276,29.272727272727273,3],"
				+ "[1449257860017,29.130434782608695,3],"
				+ "[1449512896145,28.91891891891892,3],[1449685432997,29.047619047619047,3]]}],\"stats\": {\"rawCount\": 375}} ]}";
				DatapointsResponse response = this.jsonMapper.fromJson(responseStr, DatapointsResponse.class);
				assertEquals(Double.valueOf((29.272727272727273)), (Double)response.getTags().get(0).getResults().get(0).getValues().get(0).get(1));
	}

}
