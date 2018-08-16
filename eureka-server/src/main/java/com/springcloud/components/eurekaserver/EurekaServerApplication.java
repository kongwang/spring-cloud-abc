package com.springcloud.components.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @date 2018/08/16 13:31
 * @author wang.jiang
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    private static Logger logger = LoggerFactory.getLogger("EurekaServerApplication");
	public static void main(String[] args) {
	    SpringApplication.run(EurekaServerApplication.class, args);

        logger.info("*******************************");
        logger.info("***** server is ready now *****");
        logger.info("*******************************");
	}
}
