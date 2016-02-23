package com.ge.predix.solsvc.dataseed.service;

//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.dataseed.asset.AssetDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.ClassificationDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.GroupDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.MeterDataInitialization;
import com.ge.predix.solsvc.dataseed.util.SpreadSheetParser;
import com.ge.predix.solsvc.restclient.config.IOauthRestConfig;
import com.ge.predix.solsvc.restclient.impl.RestClient;

//import com.ge.predix.solsvc.dataseed.asset.AssetDataInitialization;

/**
 * 
 * @author predix -
 */
@RestController
public class DataSeedServiceController
{
    private static final Logger              log = LoggerFactory.getLogger(DataSeedServiceController.class);

    @Autowired
    private AssetDataInitialization          assetDataInit;

    @Autowired
    private MeterDataInitialization          meterDataInit;

    @Autowired
    private GroupDataInitialization          groupDataInit;

    @Autowired
    private ClassificationDataInitialization classDataInit;

    @Autowired
    private IOauthRestConfig                 restConfig;

    @Autowired
    private HttpServletRequest               context;

    @Autowired
    private RestClient                       restClient;

    @Autowired
    private AssetRestConfig                  assetRestConfig;

    @Value("${acsSubZone:#{null}}")
    private String                           acsSubZone;

    /**
     * @param file
     *            -
     * @param authorization
     *            -
     * @param appId
     *            -
     * @return -
     */

    @SuppressWarnings("nls")
    private String uploadAssetData(MultipartFile file, String authorization, String appId)
    {
        String name = file.getName();
        List<String> workSheets = new ArrayList<String>();
        workSheets.add("Asset");
        workSheets.add("Fields");
        workSheets.add("Meter");
        workSheets.add("Classification");
        workSheets.add("Group");

        if ( !file.isEmpty() )
        {
            try
            {
                SpreadSheetParser parser = new SpreadSheetParser();
                Map<String, String[][]> content = parser.parseInputFile(file.getInputStream(), workSheets);

                List<Header> headers = new ArrayList<Header>();
                //this.restClient.addSecureTokenToHeaders(headers, authorization);
                log.debug("zoneId=" + this.assetRestConfig.getZoneId());
                headers = this.restClient.getSecureTokenForClientId();
                this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());

                this.classDataInit.seedData(content, headers);
                this.groupDataInit.seedData(content, headers);
                this.meterDataInit.seedData(content, headers);
                this.assetDataInit.seedData(content, headers);
                return "You successfully uploaded " + name + "!";
            }
            catch (Exception e)
            {
                log.error("", e);
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        }
        return "You failed to upload " + name + " because the file was empty.";
    }

    /**
     * @param username -
     * @param password -
     * @param file -
     * @param appId -=
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "appId", defaultValue = "rmdapp") String appId)
    {

        OAuth2RestTemplate restTemplate = getRestTemplate(username, password);
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        // File newFile = multipartToFile(file);
        map.add("username", username);
        map.add("password", password);

        String dataseedUrl = this.context.getRequestURL().toString().replace("/login", "/dataseed");

        // set header for ACS

        log.info("XXXCalling dataseed URL " + dataseedUrl);
        String token = null;
//        try
//        {
//            token = restTemplate.postForObject(new URI(dataseedUrl), new HttpEntity<>(map, getHeadersWithZone()),
//                    String.class);
//        }
//        catch (RestClientException | URISyntaxException e)
//        {
//            throw new RuntimeException(e);
//        }

        String response = uploadAssetData(file, token, appId);

        return response;

    }

    @SuppressWarnings("nls")
    private OAuth2RestTemplate getRestTemplate(String username, String password)
    {
        // get token here based on username password;
        ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
        resourceDetails.setUsername(username);
        resourceDetails.setPassword(password);
        String url = this.restConfig.getOauthResourceProtocol() + "://" + this.restConfig.getOauthRestHost()
                + this.restConfig.getOauthResource();
        resourceDetails.setAccessTokenUri(url);
        String[] clientids = this.restConfig.getOauthClientId().split(":");
        resourceDetails.setClientId(clientids[0]);
        resourceDetails.setClientSecret(clientids[1]);
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails);

        return restTemplate;
    }

    /**
     * @param username -
     * @param password -
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = "/dataseed", method = RequestMethod.POST)
    public String validateUser(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password)
    {

        OAuth2RestTemplate restTemplate = getRestTemplate(username, password);

        OAuth2AccessToken token = restTemplate.getAccessToken();
        String authorization = token.getTokenType() + " " + token.getValue();
        return authorization;

    }

}
