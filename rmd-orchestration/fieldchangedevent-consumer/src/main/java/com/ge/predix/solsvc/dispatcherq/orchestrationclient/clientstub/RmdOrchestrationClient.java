package com.ge.predix.solsvc.dispatcherq.orchestrationclient.clientstub;

import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ge.predix.solsvc.dispatcherq.config.OrchestrationRestConfig;
import com.ge.predix.solsvc.restclient.impl.RestClient;

@SuppressWarnings("javadoc")
// @Component
public class RmdOrchestrationClient {

	private static final Logger logger = LoggerFactory
			.getLogger(RmdOrchestrationClient.class.getName());

	@Autowired
	private RestClient restClient;

	@Autowired
	private OrchestrationRestConfig orchestrationConfig;

	@SuppressWarnings("nls")
    public String runOrchestration(String orchestrationRequest)
			throws IOException {

		String orchestrationResponse = null;

		logger.info("Predix Platform Orchestration Runtime URI="
				+ this.orchestrationConfig.getOrchestrationEndpoint());

		List<Header> headers = this.restClient.getSecureTokenForClientId();
		logger.info("Headers 1 = " + headers.get(0));
		Header contentTypeHeader = new BasicHeader("Content-Type",
				"application/json");

		headers.add(contentTypeHeader);
        logger.info("Headers 2 = " + headers.get(1));
        

		HttpResponse response = this.restClient.post(
				this.orchestrationConfig.getOrchestrationEndpoint(),
				orchestrationRequest, this.restClient.addZoneToHeaders(headers, this.orchestrationConfig.getZoneId()));

		logger.info("Response = " + response.getStatusLine());
		logger.info("Response = " + response.toString());

		return orchestrationResponse;
	}

}
