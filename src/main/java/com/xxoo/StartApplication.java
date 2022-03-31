package com.xxoo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartApplication {

    private static final Logger logger = LogManager.getLogger(StartApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(StartApplication.class, args);

        String[] profiles = context.getEnvironment().getActiveProfiles();
        for (String profile : profiles) {
            logger.info("程序启动使用profile:{}",profile);
        }

    }

}
