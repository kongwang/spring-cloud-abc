package com.kong.services.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceAApplication {
    private static Logger logger = LoggerFactory.getLogger("ServiceAApplication");
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);

        logger.info("*******************************");
        logger.info("***** server is ready now *****");
        logger.info("*******************************");
	}
}
