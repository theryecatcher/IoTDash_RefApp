package com.ge.predix.solsvc.dataingestion.service;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ge.predix.solsvc.bootstrap.ams.dto.Asset;
import com.ge.predix.solsvc.bootstrap.ams.dto.AssetMeter;
import com.ge.predix.solsvc.bootstrap.ams.dto.MeterDatasource;
import com.ge.predix.solsvc.dataingestion.api.DataIngestionServiceAPI;
import com.ge.predix.solsvc.dataingestion.handler.DataIngestionHandler;

/**
 * 
 * @author predix -
 */
@RestController
@SuppressWarnings("nls")
public class DataIngestionServiceController
        implements DataIngestionServiceAPI
{
    private static Logger        log       = LoggerFactory.getLogger(DataIngestionServiceController.class);

    @Autowired
    private DataIngestionHandler dataIngestionHandler;

    @RequestMapping(value="/ping",method=RequestMethod.GET)
	public String ping() {
		return "SUCCESS"; //$NON-NLS-1$
	}
    
    @Override
    @RequestMapping(value = "/ingestdata", method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(
            @RequestHeader(value = "authorization", required = false) String authorization,
            @RequestParam("filename") String fileName, @RequestParam("clientId") String clientId,
            @RequestParam("tenantId") String tenantId, @RequestParam("file") MultipartFile file)
    {
        try
        {
            if ( !file.isEmpty() )
            {
                try
                {
                    byte[] bytes = file.getBytes();

                    // authorization =
                    // "Bearer eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiIwMjNhNDIyZC1jYmY2LTQxZmQtYTQ4MC00NTcwMDE0YTVkYmQiLCJzdWIiOiJjNjE2MmQyOS03MjE0LTRmNTktOGRmNi0wY2UwNTY5ZGVkYzAiLCJzY29wZSI6WyJvcGVuaWQiXSwiY2xpZW50X2lkIjoicm1kX3JlZl9hcHAiLCJjaWQiOiJybWRfcmVmX2FwcCIsImF6cCI6InJtZF9yZWZfYXBwIiwiZ3JhbnRfdHlwZSI6InBhc3N3b3JkIiwidXNlcl9pZCI6ImM2MTYyZDI5LTcyMTQtNGY1OS04ZGY2LTBjZTA1NjlkZWRjMCIsInVzZXJfbmFtZSI6InJtZF91c2VyXzEiLCJlbWFpbCI6InJtZF91c2VyXzFAZXhhbXBsZS5jb20iLCJpYXQiOjE0Mjc5OTg0OTIsImV4cCI6MTQyODA0MTY5MiwiaXNzIjoiaHR0cHM6Ly91YWEtc3RhZ2luZy5udXJlZ28uY29tL29hdXRoL3Rva2VuIiwiYXVkIjpbInJtZF9yZWZfYXBwIiwib3BlbmlkIl0sIm9yaWdpbiI6InVhYSJ9.F0lgyBuvzOc0TDTMYkk2xsdGJWvD8PQNR-QrvwKmmV1_D2GPN5o0sh_w3ixYw1VMJlltbjJPIQMk0eZbuj-cR4hvCDM1sjT3X_NecxM3C9_Z6LalfpVs8QlTK_OitpjdNnVarOBTq5YT12mRXozZSB1iHC8ESV3ABl0rbMNLDPm7Ni97gpuOqCSa2xqHw8zMN3-cdESImDS6Gvvot30mRa1CbXhSmxVd0r--jami7UVPR7fHixEsrAOvgc5lyQigQuEMtfMxRLvNflyHF3F4TpHRpxo5owBdS9gJ1dJpmG3YIgNa1Q-p-l7D89mrhht6Ef9OB_n93Eu-R4Lmli4Ybg";
                    this.dataIngestionHandler.handleData(tenantId, clientId, new String(bytes), authorization);
                    return "You successfully uploaded " + fileName + "!";
                }
                catch (Throwable e)
                {
                    log.error("Unable to Upload " + fileName, e);
                    return "You failed to upload " + fileName + " => " + e.getMessage();
                }
            }
            return "You failed to upload " + fileName + " because the file was empty.";
        }
        catch (Throwable e)
        {
            log.error("Unable to Upload " + fileName, e);
            return "Request failed. " + e.getMessage();
        }
    }

    @Override
    @RequestMapping(value = "/SaveTimeSeriesData", method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(
            @RequestHeader(value = "authorization", required = false) String authorization,
            @RequestParam("clientId") String clientId, @RequestParam("tenantId") String tenantId,
            @RequestBody() String content)
    {
        try
        {
        	log.debug("Content : "+content);
            this.dataIngestionHandler.handleData(tenantId, clientId, content, authorization);
            return "You successfully posted data";
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            log.error("Unable to Save " + content, e);
            return "Request failed. " + e.getMessage();
        }

    }

    @Override
    @RequestMapping(value = "/ingestdata", method = RequestMethod.GET)
    public @ResponseBody String handleRequest()
    {
        try
        {
            return this.dataIngestionHandler.listAssets();
        }
        catch (Throwable e)
        {
            log.error("Failure in /ingestdata GET ", e);
            return "Request failed. " + e.getMessage();
        }

    }

    /**
     * @return -
     */
    @RequestMapping(value = "/retrieveasset", method = RequestMethod.GET)
    public @ResponseBody String retrieveAsset()
    {
        try
        {
            return this.dataIngestionHandler.retrieveAsset();
        }
        catch (Throwable e)
        {
            log.error("Failure in /retrieveasset GET ", e);
            return "Request failed. " + e.getMessage();
        }

    }

    /**
     * @param asset -
     * @return -
     */
    protected String getTimeSeriesTag(Asset asset)
    {
        LinkedHashMap<String, AssetMeter> meters = asset.getAssetMeter();
        if ( meters != null )
        {
            for (Entry<String, AssetMeter> entry : meters.entrySet())
            {
                AssetMeter assetMeter = entry.getValue();
                MeterDatasource dataSource = assetMeter.getMeterDatasource();
                if ( dataSource != null && !dataSource.getNodeName().isEmpty() )
                {
                    return assetMeter.getSourceTagId();
                }
            }
        }
        return null;
    }

}
