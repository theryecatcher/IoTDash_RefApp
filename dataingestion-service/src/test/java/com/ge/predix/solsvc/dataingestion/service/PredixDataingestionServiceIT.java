package com.ge.predix.solsvc.dataingestion.service;

import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.io.StringWriter;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ge.predix.solsvc.dataingestion.boot.DataingestionServiceApplication;
import com.ge.predix.solsvc.dataingestion.service.type.JSONData;

/**
 * 
 * @author predix -
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataingestionServiceApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class PredixDataingestionServiceIT {
	@Value("${local.server.port}")
    private int localServerPort;
	
	private URL base;
	
	private RestTemplate template;
	
	/**
	 * @throws Exception -
	 */
	@Before
	public void setUp() throws Exception {
		this.template = new TestRestTemplate();
	}
	
	
	@Test
	public void ping() throws Exception {
		this.base = new URL("http://localhost:" + this.localServerPort + "/ping");
		ResponseEntity<String> response = this.template.getForEntity(this.base.toString(), String.class);
		assertThat(response.getBody(), startsWith("SUCCESS"));
	}
	
	@Test
	public void dataIngestionTest() throws Exception {
		this.base = new URL("http://localhost:" + this.localServerPort + "/SaveTimeSeriesData");
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		List<JSONData> list = generateMockDataMap_RT();
		ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        try
        {
            mapper.writeValue(writer, list);
            map.add("content", writer.toString());
    		map.add("clientId", "clientId");
    		map.add("tenantId", "tenantId");
    		String response = this.template.postForObject(this.base.toString(),map, String.class);
    		assertThat(response, startsWith("You successfully posted data"));
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
		
	}
	/**
     * @return -
     */
    @SuppressWarnings("nls")
    List<JSONData> generateMockDataMap_RT()
    {
        String machineControllerId = "1";
        List<JSONData> list = new ArrayList<JSONData>();
        JSONData data = new JSONData();
        data.setName("Compressor-2015:CompressionRatio");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(2.5, 3.0) - 1) * 65535.0 / 9.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:DischargePressure");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 23.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:SuctionPressure");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.21) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MaximumPressure");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(22.0, 26.0) * 65535.0) / 100.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:MinimumPressure");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue(0.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Temperature");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(65.0, 80.0) * 65535.0) / 200.0);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        data = new JSONData();
        data.setName("Compressor-2015:Velocity");
        data.setTimestamp(getCurrentTimestamp());
        data.setValue((generateRandomUsageValue(0.0, 0.1) * 65535.0) / 0.5);
        data.setDatatype("DOUBLE");
        data.setRegister("");
        data.setUnit(machineControllerId);
        list.add(data);

        return list;
    }

    private Timestamp getCurrentTimestamp()
    {
        java.util.Date date = new java.util.Date();
        Timestamp ts = new Timestamp(date.getTime());
        return ts;
    }

    private static double generateRandomUsageValue(double low, double high)
    {
        return low + Math.random() * (high - low);
    }

}
