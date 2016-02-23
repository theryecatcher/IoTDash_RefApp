package com.ge.predix.solsvc.boot;

import java.util.Arrays;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.context.support.StandardServletEnvironment;

/**
 * This project uses a SpringBoot HelloWorld as a starting point. Then it adds in the capability to cf push a 
 * 
 * The idea is that you'll use this project as a starting point for creating your own Rest service.  You can change
 * "predix-boot" to "my-rest-service" or a name that suits you.
 * 
 * We provide a Rest Service and tests that invoke them
 * 1. HelloController - example using a SpringRestTemplate
 * 
 * The project also provides a point of view around Property file management and Spring Profiles. Here is the hierarchy
 * such that each lower number overrides the one's after it
 * http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
 * 
 * 1. Command line arguments.
 * 2. JNDI attributes from java:comp/env.
 * 3. Java System properties (System.getProperties()).
 * 4. OS environment variables.
 * 5. A RandomValuePropertySource that only has properties in random.*.
 * 6. Profile-specific application properties outside of your packaged jar (application-{profile}.properties and YAML variants)
 * 7. Profile-specific application properties packaged inside your jar (application-{profile}.properties and YAML variants)
 * 8. Application properties outside of your packaged jar (application.properties and YAML variants).
 * 9. Application properties packaged inside your jar (application.properties and YAML variants).
 * 10. @PropertySource annotations on your @Configuration classes. 
 * 11. Default properties (specified using SpringApplication.setDefaultProperties)
 * 
 * Note that Spring Beans in other packages will not be automatically scanned.  You'll need to add 
 * this command if you have other packages this command will do it
 * @ComponentScan(basePackages = {"com.ge.package1", "com.ge.package2"})
 * 
 * Or if you want to import Spring XMLs from other dependent projects you can use the @ImportResource, e.g. 
 * @ImportResource(
 * {
 *         "classpath*:META-INF/spring/predix-rest-client-scan-context.xml"
 * })
 * 
 * For other Spring Features see: http://docs.spring.io/spring-boot/docs/current/reference/html/
 * 
 * @author predix
 */
@EnableAutoConfiguration(exclude =
{
        //Add any configuration loading call you want to exclude
        
})
@ComponentScan(basePackages="com.ge.predix.solsvc")

public class Application
{
    private static final Logger log = LoggerFactory.getLogger(Application.class);


    /**
     * @param args -
     */
    @SuppressWarnings(
    {
            "nls"
    })
    public static void main(String[] args)
    {
        SpringApplication springApplication = new SpringApplication(Application.class);
        ApplicationContext ctx = springApplication.run(args);

        log.debug("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            log.debug(beanName);
        }
        
        log.debug("Let's inspect the profiles provided by Spring Boot:");
        String profiles[] = ctx.getEnvironment().getActiveProfiles();
        for (int i = 0; i < profiles.length; i++)
            log.debug("profile=" + profiles[i]);

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
    }
    
    /**
     * Ensure the Tomcat container comes up, not the Jetty one.
     * @return - the factory
     */
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory()
    {
        return new TomcatEmbeddedServletContainerFactory();
    }

}
