package com.springcloud.components.hystrixdashboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
@EnableEurekaClient
public class HystrixDashboardApplication {
    private static Logger logger = LoggerFactory.getLogger(HystrixDashboardApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);

        logger.info("*******************************");
        logger.info("***** server is ready now *****");
        logger.info("*******************************");
    }
}
