package com.ge.predix.solsvc.dataseed.service;

import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
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
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.ge.predix.solsvc.dataseed.boot.DataseedServiceApplication;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;



/**
 * This is a work-in-progress, the theory is that we can read from Predix Asset and create a Spreadsheet of a Model
 * @author predix -
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataseedServiceApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class HelloControllerHarvest {
	private static final Logger log = LoggerFactory.getLogger(HelloControllerHarvest.class);

    @Value("${local.server.port}")
    private int localServerPort;

	private URL base;
	private RestTemplate template;
	
	@Autowired
	private IOauthRestConfig restConfig;
	
	@Autowired
	private CxfAwareRestClient restClient;
	

	@Value("${predix.oauth.userName}")
	protected String userName;
	@Value("${predix.oauth.userPassword}")
	protected String password;
	@Value("${predix.oauth.encodePassword}")
	protected boolean encodePassword;

	private String url;

	@Before
	public void setUp() throws Exception {
		template = new TestRestTemplate();
	}

	@Test
	public void getHello() throws Exception {
		log.info("test");
		log.info(log.getName());
		log.info(log.getClass().getCanonicalName());
		log.debug("" + log.isDebugEnabled());
		log.debug("" + log.isErrorEnabled());
		this.url="http://localhost:" + localServerPort + "/";
		this.base = new URL(this.url);
		ResponseEntity<String> restTemplateResponse = template.getForEntity(base.toString(), String.class);
		assertThat(restTemplateResponse.getBody(), startsWith("Greetings from Spring Boot!"));

		this.url="http://localhost:" + localServerPort + "/dataseed?appId=rmdapp";
		this.base = new URL(this.url);
        List<Header> headers = this.restClient.getOauthHttpHeaders();
		HttpResponse httpResponse = restClient.get(this.url, headers);
		org.apache.http.HttpEntity responseEntity = httpResponse.getEntity();
		String response;
		try {
			response = EntityUtils.toString(responseEntity);
		} catch (ParseException | IOException e) {
			throw new RuntimeException(e);
		}
		
		assertThat(response, startsWith("Asset Data Initialized Successfully"));

	}
	


}