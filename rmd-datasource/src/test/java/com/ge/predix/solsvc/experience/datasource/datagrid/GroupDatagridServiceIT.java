package com.ge.predix.solsvc.experience.datasource.datagrid;


import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.experience.datasource.boot.DatasourceApplication;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.DatagridResponse;
import com.ge.predix.solsvc.experience.datasource.datagrid.dto.SummaryKpiDataGridResponse;
import com.ge.predix.solsvc.experience.datasource.handlers.DataSourceHandler;
import com.ge.predix.solsvc.ext.util.JsonMapper;
import com.ge.predix.solsvc.restclient.config.OauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;
import com.ge.predix.solsvc.restclient.impl.Token;

/**
 * 
 * @author 212421693
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DatasourceApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class GroupDatagridServiceIT {
	
	@Value("${local.server.port}")
    private int localServerPort;

	private URL base;
	private RestTemplate template;
	
	@Autowired
	private OauthRestConfig restConfig;
	
	@Autowired
	private
	CxfAwareRestClient restClient;
	
	 /**
	 * 
	 */
	@Autowired
	  protected JsonMapper jsonMapper;
	 
		
	private static Logger log = LoggerFactory
			.getLogger(GroupDatagridServiceIT.class);
	

	/**
	 * @throws Exception -
	 */
	@Before
	public void setUp() throws Exception {
		this.template = new TestRestTemplate();
	}

	/**
	 * 
	 * @throws Exception -
	 */
	@Test
	public void ping() throws Exception {
		this.base = new URL("http://localhost:" + this.localServerPort + "/services/experience/datasource/datagrid/group/ping"); //$NON-NLS-1$ //$NON-NLS-2$
		ResponseEntity<String> response = this.template.getForEntity(this.base.toString(), String.class);
		assertThat(response.getBody(), startsWith("SUCCESS")); //$NON-NLS-1$
	}
	
	//@Path("/{entityType}/{id}/")
	//@Test
	/**
	 * @throws Exception exception
	 */
	public void getGroupAssetKpi() throws Exception {
		// get Token for the secure service 

		URL groupDataSourceURl = new URL("http://localhost:" + this.localServerPort + "/services/experience/datasource/datagrid/group/plant-richmond-refinery");  //$NON-NLS-1$//$NON-NLS-2$
		
        Token requestToken = this.restClient.requestToken( this.restConfig.getOauthUserName(), this.restConfig.getOauthUserPassword(), this.restConfig.isOauthEncodeUserPassword());
		
		HttpHeaders headers = new HttpHeaders();
		headers.put("Authorization", Collections.singletonList(requestToken.getToken().replace("BEARER", "Bearer"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		log.debug("Authorization-->"+headers.getFirst("Authorization"));  //$NON-NLS-1$//$NON-NLS-2$
		
		ResponseEntity<DatagridResponse> response = this.template.exchange(groupDataSourceURl.toString(), HttpMethod.GET, new HttpEntity<byte[]>(headers), DatagridResponse.class);
		assert(response.getStatusCode()== HttpStatus.OK);
	}
	
	//@Path("/{entityType}/{id}/summary")
	/**
	 * @throws Exception exception
	 */
	@Test
	public void getSummary() throws Exception {
		// get Token for the secure service 

		URL groupDataSourceURl = new URL("http://localhost:" + this.localServerPort + "/services/experience/datasource/datagrid/group/plant-richmond-refinery/summary"); //$NON-NLS-1$ //$NON-NLS-2$
		
        Token requestToken = this.restClient.requestToken( this.restConfig.getOauthUserName(), this.restConfig.getOauthUserPassword(), this.restConfig.isOauthEncodeUserPassword());
		
		HttpHeaders headers = new HttpHeaders();
		headers.put("Authorization", Collections.singletonList(requestToken.getToken().replace("BEARER", "Bearer"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		log.debug("Authorization-->"+headers.getFirst("Authorization"));  //$NON-NLS-1$//$NON-NLS-2$
		
		ResponseEntity<SummaryKpiDataGridResponse> response = this.template.exchange(groupDataSourceURl.toString(), HttpMethod.GET, new HttpEntity<byte[]>(headers), SummaryKpiDataGridResponse.class);
	//	log.debug(response.getStatusCode());
	//	assert(response.getStatusCode()== HttpStatus.OK);
		SummaryKpiDataGridResponse dataGridResponse = response.getBody();
		assert(dataGridResponse != null);
		
	}
	
	/**
	 *  -
	 */
	@Test
	public void testCastToDatapointsResponse(){
		String responseStr = "{\"tags\": [{\"name\": \"RMD_metric1\",\"results\":" //$NON-NLS-1$
				+ " [{\"groups\": [{\"name\": \"type\",\"type\": \"number\"}],\"attributes\":" //$NON-NLS-1$
				+ " {\"customer\": [\"Acme\"],\"host\": [\"server1\"]},\"values\": [[1449149055276,29.272727272727273,3]," //$NON-NLS-1$
				+ "[1449257860017,29.130434782608695,3]," //$NON-NLS-1$
				+ "[1449512896145,28.91891891891892,3],[1449685432997,29.047619047619047,3]]}],\"stats\": {\"rawCount\": 375}} ]}"; //$NON-NLS-1$
				DatapointsResponse response = this.jsonMapper.fromJson(responseStr, DatapointsResponse.class);
				Double average = DataSourceHandler.getAverageFromDatapointsResponse(response);
				assertEquals(Double.valueOf((29.272727272727273)), average);
	}
	
	/**
	 *  -
	 */
	@Test
	public void testDatapointsResponseToArray(){
		String responseStr = "{\"tags\": [{\"name\": \"RMD_metric1\",\"results\":" //$NON-NLS-1$
				+ " [{\"groups\": [{\"name\": \"type\",\"type\": \"number\"}],\"attributes\":" //$NON-NLS-1$
				+ " {\"customer\": [\"Acme\"],\"host\": [\"server1\"]},\"values\": [[1449149055276,29.272727272727273,3]," //$NON-NLS-1$
				+ "[1449257860017,29.130434782608695,3]," //$NON-NLS-1$
				+ "[1449512896145,28.91891891891892,3],[1449685432997,29.047619047619047,3]]}],\"stats\": {\"rawCount\": 375}} ]}"; //$NON-NLS-1$
				DatapointsResponse response = this.jsonMapper.fromJson(responseStr, DatapointsResponse.class);
				List<Double> average = DataSourceHandler.createCurrentValueList(response);
				assertEquals(Double.valueOf((29.272727272727273)), average.get(1));
	}
}
