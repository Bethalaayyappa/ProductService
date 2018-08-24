package com.bosch.ots.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloResource.class);
	

    @GetMapping
    public String hello() {
    	
    	LOGGER.info("Reached Server");
        return "Hello World";
    }
    
    
}