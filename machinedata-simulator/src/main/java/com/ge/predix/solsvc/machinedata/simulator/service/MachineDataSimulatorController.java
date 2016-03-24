package com.ge.predix.solsvc.machinedata.simulator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author predix -
 */
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class,
		MachineDataSimulatorController.class })
@ComponentScan(basePackages = ("com.ge.predix.solsvc"))
@PropertySource("classpath:application-default.properties")
@EnableScheduling
@RestController
@SuppressWarnings("nls")
public class MachineDataSimulatorController {


    private static Logger log = LoggerFactory.getLogger(MachineDataSimulatorController.class);

    @RequestMapping(value="/ping",method=RequestMethod.GET)
	public String ping() {
		return "SUCCESS"; //$NON-NLS-1$
	}
    
    @RequestMapping(value="/start",method=RequestMethod.POST)
	public String start(@RequestHeader(value = "authorization", required = false) String authorization,
            @RequestParam("name") String name) {
    	try
    	{
    		SpringApplication.run(
    				MachineDataSimulatorController.class);
    	}
    	catch (Exception e)
        {
        	e.printStackTrace();
            log.error("Unable to Start " + e);
            return "Request failed. " + e.getMessage();
        }
		return "SUCCESS"; //$NON-NLS-1$
	}
    
    @RequestMapping(value="/stop",method=RequestMethod.GET)
	public String stop() {
		return "Stopped"; //$NON-NLS-1$
	}
}
