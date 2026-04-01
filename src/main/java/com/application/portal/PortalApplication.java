package com.application.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortalApplication {

	private static final Logger logger = LoggerFactory.getLogger(PortalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

}
