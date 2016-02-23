package com.ge.predix.solsvc.dataseed.asset;

import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

import javax.annotation.PostConstruct;

import org.apache.http.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.bootstrap.ams.dto.Meter;
import com.ge.predix.solsvc.bootstrap.ams.factories.MeterFactory;


/**
 * 
 * @author predix
 */
@Component
@SuppressWarnings("nls")
public class MeterDataInitialization extends BaseDataHandler 
		 {
	/**
     * 
     */
	private static final int METER_URI = 0;
	private static final int METER_NAME = 1;
	private static final int METER_DESC = 2;
	private static final int METER_TYPE = 3;
	private static final int METER_DATA_TYPE = 4;
	private static final int METER_UOM = 5;

	@Autowired
	private MeterFactory meterFactory;


	/**
     * 
     */
	@PostConstruct
	public void intilizeMeterData() {
		System.out
				.println("*******************Seed data Initialization complete*********************");
	}

	/**
	 * @param content -
	 * @param headers -
	 *            -
	 * @throws DataFormatException -
	 */

	public void seedData(Map<String, String[][]> content, List<Header> headers) throws DataFormatException {
		String[][] meters = content.get("Meter");
		Meter meter = null;
		if (meters != null) {
			for (String[] row : meters) {
				if (row[METER_NAME] != null) {
					meter = new Meter();
					meter.setUri(row[METER_URI]);
					meter.setName(row[METER_NAME]);
					meter.setUom(row[METER_UOM]);
					meter.setDescription(row[METER_DESC]);
					meter.setDataType(row[METER_DATA_TYPE]);
					meter.setMeterType(row[METER_TYPE]);

					this.meterFactory.createMeter(meter, headers);
				}
			}
		}
	}


}
