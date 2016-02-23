package com.ge.predix.solsvc.machinedata.simulator;

import javax.swing.RepaintManager;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.ge.predix.solsvc.machinedata.simulator.boot.MachinedataSimulatorApplication;

/**
 * 
 * @author 502374366 -
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MachinedataSimulatorApplication.class)
public class MachinedataSimulatorTests {
	Logger log = Logger.getLogger(MachinedataSimulatorTests.class);
	@Autowired
	private MachineDataSimulator simulator;

	/**
	 *  -
	 * @throws Exception 
	 */
	@SuppressWarnings("javadoc")
	@Test
	public void contextLoads() throws Exception {
		//String response = this.simulator.runTest();
	//	this.log.info("Response : "+response); //$NON-NLS-1$
		//Assert.isTrue(response.startsWith("SUCCESS")); //$NON-NLS-1$
	}
}
