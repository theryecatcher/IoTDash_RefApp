package com.ge.predix.solsvc.dataseed.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author predix -
 */
//@RestController
public class HelloController {

	
    /**
     *  -
     */
    public HelloController() {
		super();
	}

    /**
     * @param echo -
     * @return -
     */
    //@RequestMapping("/")
    @SuppressWarnings("nls")
    public String index(@RequestParam(value="echo",defaultValue="echo") String echo) {
        return "Greetings from Spring Boot! " + (new Date());
    }

}