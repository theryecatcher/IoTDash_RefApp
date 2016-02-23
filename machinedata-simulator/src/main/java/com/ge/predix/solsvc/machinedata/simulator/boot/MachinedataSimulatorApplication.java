package com.ge.predix.solsvc.machinedata.simulator.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author predix -
 */
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class,
		DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = ("com.ge.predix.solsvc"))
@PropertySource("classpath:application-default.properties")
@EnableScheduling
public class MachinedataSimulatorApplication {

	/**
	 * @param args
	 *            -
	 */
	public static void main(String[] args) {
		SpringApplication.run(
				MachinedataSimulatorApplication.class, args);
	}

	/**
	 * @return -
	 */
	@Bean
	public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
		return new TomcatEmbeddedServletContainerFactory();
	}
}
