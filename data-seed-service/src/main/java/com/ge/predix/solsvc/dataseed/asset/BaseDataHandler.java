package com.ge.predix.solsvc.dataseed.asset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.CxfAwareRestClient;

/**
 * 
 * @author 212421693
 *
 */
public abstract class BaseDataHandler {

	@SuppressWarnings("unused")
    private static Logger logger = LoggerFactory.getLogger(BaseDataHandler.class);

	// private static final Map<String, String> tenantUserMap = ImmutableMap.of(
	// "411", "demo:Demo,135", "777", "777_user:777_user", "511",
	// "511_user:511_user");

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
	private IOauthRestConfig restConfig;

	/**
	 * @return -
	 */
	public CxfAwareRestClient getRestClient() {
		return this.restClient;
	}

	/**
	 * @param restClient -
	 */
	
	public void setRestClient(CxfAwareRestClient restClient) {
		this.restClient = restClient;
	}

	/**
	 * @return the assetRestConfig
	 */
	public AssetRestConfig getAssetRestConfig() {
		return this.assetRestConfig;
	}

	/**
	 * @param assetRestConfig
	 *            the assetRestConfig to set
	 */
	public void setAssetRestConfig(AssetRestConfig assetRestConfig) {
		this.assetRestConfig = assetRestConfig;
	}

	/**
	 * @return the restConfig
	 */
	public IOauthRestConfig getRestConfig() {
		return this.restConfig;
	}

	/**
	 * @param restConfig
	 *            the restConfig to set
	 */
	public void setRestConfig(IOauthRestConfig restConfig) {
		this.restConfig = restConfig;
	}

}
