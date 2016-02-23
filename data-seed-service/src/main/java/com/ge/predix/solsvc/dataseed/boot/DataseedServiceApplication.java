package com.ge.predix.solsvc.dataseed.boot;

import java.util.Arrays;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.context.support.StandardServletEnvironment;

//@SpringBootApplication
/**
 * 
 * @author predix
 */
@EnableAutoConfiguration(exclude={JpaRepositoriesAutoConfiguration.class,DataSourceAutoConfiguration.class})
@ComponentScan(basePackages=("com.ge.predix.solsvc"))
@ImportResource({ 
		"classpath*:META-INF/spring/predix-rest-client-scan-context.xml", 
		"classpath*:META-INF/spring/dataseed-service-acs-context.xml"
		})
@PropertySource("classpath:application-default.properties") // this only for local
public class DataseedServiceApplication {
    private static final Logger log = LoggerFactory.getLogger(DataseedServiceApplication.class);

    /**
     * @param args
   # CONSOLE uses PatternLayout.
  */
    @SuppressWarnings("nls")
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DataseedServiceApplication.class, args);
        
       log.debug("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            log.info(beanName);
        }
        
        log.info("Let's inspect the properties provided by Spring Boot:");
        MutablePropertySources propertySources = ((StandardServletEnvironment) ctx.getEnvironment())
                .getPropertySources();
        Iterator<org.springframework.core.env.PropertySource<?>> iterator = propertySources.iterator();
        while (iterator.hasNext()) {
            Object propertySourceObject = iterator.next();
            if ( propertySourceObject instanceof org.springframework.core.env.PropertySource ) {
                org.springframework.core.env.PropertySource<?> propertySource = (org.springframework.core.env.PropertySource<?>) propertySourceObject;
                log.info("propertySource=" + propertySource.getName() + " values=" + propertySource.getSource() + "class=" + propertySource.getClass());           
            }         
        }

        log.info("Let's inspect the profiles provided by Spring Boot:");
        String profiles[] = ctx.getEnvironment().getActiveProfiles();
        for (int i = 0; i < profiles.length; i++)
            log.info("profile=" + profiles[i]);
}
    
    /**
     * @return -
     */
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory();
    }
}
