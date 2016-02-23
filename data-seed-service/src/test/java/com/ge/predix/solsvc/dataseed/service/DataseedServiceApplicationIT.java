package com.ge.predix.solsvc.dataseed.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ge.predix.solsvc.bootstrap.ams.common.AssetRestConfig;
import com.ge.predix.solsvc.dataseed.asset.AssetDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.ClassificationDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.GroupDataInitialization;
import com.ge.predix.solsvc.dataseed.asset.MeterDataInitialization;
import com.ge.predix.solsvc.dataseed.boot.DataseedServiceApplication;
import com.ge.predix.solsvc.dataseed.util.SpreadSheetParser;
import com.ge.predix.solsvc.restclient.impl.RestClient;

//@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 
 * @author predix
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataseedServiceApplication.class)
@IntegrationTest({"server.port=0"})
@ComponentScan("com.ge.predix.solsvc")
@WebAppConfiguration
@ActiveProfiles("local")
public class DataseedServiceApplicationIT {
	
    private static Logger logger = LoggerFactory.getLogger(DataseedServiceApplicationIT.class);

	@Autowired
    private AssetDataInitialization          assetDataInit;

    @Autowired
    private MeterDataInitialization          meterDataInit;

    @Autowired
    private GroupDataInitialization          groupDataInit;

    @Autowired
    private ClassificationDataInitialization classDataInit;

    @Autowired
    private RestClient restClient;

    @Autowired
    private AssetRestConfig assetRestConfig;
	/**
	 * 
	 */
	@SuppressWarnings("nls")
    @Test
	public void contextLoads() {
		System.out.println("Running Tests : ");
		try {
			File file = new File("src/main/resources/rmdapp/AssetData.xls");
			List<String> workSheets = new ArrayList<String>();
			workSheets.add("Asset");
			workSheets.add("Fields");
			workSheets.add("Meter");
			workSheets.add("Classification");
			workSheets.add("Group");

			if ( file != null && file.exists() )
			{
			    try
			    {
			        SpreadSheetParser parser = new SpreadSheetParser();
			        Map<String, String[][]> content = parser.parseInputFile(new FileInputStream(file), workSheets);
			        System.out.println("Content : "+content);
			        System.out.println("Test : Creating Classifications");
			        List<Header> headers = this.restClient.getSecureTokenForClientId();
	                this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());

			        this.classDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Group");
			        this.groupDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Meter");
			        this.meterDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Asset");
			        this.assetDataInit.seedData(content, headers);
			        System.out.println("Tests success : ");
			    }
			    catch (Exception e)
			    {
			        System.err.println(""+ e.getMessage());
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	@SuppressWarnings("nls")
    @Test
	public void testAssetsWithMeterDataSourceObj() {
		System.out.println("Running Tests : ");
		try {
			File file = new File("src/main/resources/rmdapp/AssetData.xls");
			List<String> workSheets = new ArrayList<String>();
			workSheets.add("Asset");
			workSheets.add("Fields");
			workSheets.add("Meter");
			workSheets.add("Classification");
			workSheets.add("Group");

			if ( file != null && file.exists() )
			{
			    try
			    {
			        SpreadSheetParser parser = new SpreadSheetParser();
			        Map<String, String[][]> content = parser.parseInputFile(new FileInputStream(file), workSheets);
			        System.out.println("Content : "+content);
			        System.out.println("Test : Creating Classifications");
			        List<Header> headers = this.restClient.getSecureTokenForClientId();
                    this.restClient.addZoneToHeaders(headers, this.assetRestConfig.getZoneId());
			        this.classDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Group");
			        this.groupDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Meter");
			        
                    this.meterDataInit.seedData(content, headers);
			        System.out.println("Test : Creating Asset");
			        this.assetDataInit.seedData(content, headers);
			        System.out.println("Tests success : ");
			    }
			    catch (Exception e)
			    {
			    	logger.error("",e);
			    }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
