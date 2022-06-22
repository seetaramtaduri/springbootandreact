package com.seetaram.poc.cardetailsapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaradetailsapiApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(CaradetailsapiApplication.class);
		SpringApplication.run(CaradetailsapiApplication.class, args);
		logger.info("Application started successfully .......");
	}

}
