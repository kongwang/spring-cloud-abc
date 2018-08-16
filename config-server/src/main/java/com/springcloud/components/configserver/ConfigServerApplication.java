package com.springcloud.components.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wang.jiang
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    private static Logger logger = LoggerFactory.getLogger("ConfigServerApplication");

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);

        logger.info("*******************************");
        logger.info("***** server is ready now *****");
        logger.info("*******************************");
    }
}
