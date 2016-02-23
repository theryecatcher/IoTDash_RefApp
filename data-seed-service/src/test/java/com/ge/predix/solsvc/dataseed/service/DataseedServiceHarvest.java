package com.ge.predix.solsvc.dataseed.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ge.predix.solsvc.dataseed.asset.AssetDataHarvest;
import com.ge.predix.solsvc.dataseed.boot.DataseedServiceApplication;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.RestClient;
import com.ge.predix.solsvc.restclient.impl.Token;

//@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 
 * @author predix
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataseedServiceApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})@SuppressWarnings("nls")
public class DataseedServiceHarvest {

	@Autowired 
	private AssetDataHarvest assetDataHarvest;
	
	@Autowired
	private RestClient restClient;
	
	@Autowired
	private IOauthRestConfig restConfig;
	
	/**
	 * 
	 */
    @Test
	public void harvestTest() {
        String userName = "rmd_user_1";
        String password = "rmd_user_1";
        boolean encodePassword = false;
        String baseUri = getBaseUri();
       // String url = baseUri + "/asset";
        
		Token authorization = this.restClient.requestToken(userName, password, encodePassword) ;
		String appId = "rmdapp";
		this.assetDataHarvest.harvestData(authorization.getToken(), appId);
	}

    private String getBaseUri()
    {
        return "http://predix-asset.grc-apps.svc.ice.ge.com/services";
    }
}
