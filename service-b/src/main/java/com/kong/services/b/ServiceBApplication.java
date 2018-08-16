package com.kong.services.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
//@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class ServiceBApplication {

    private static Logger logger = LoggerFactory.getLogger("ServiceBApplication");
    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);

        logger.info("*******************************");
        logger.info("***** server is ready now *****");
        logger.info("*******************************");
    }
}
