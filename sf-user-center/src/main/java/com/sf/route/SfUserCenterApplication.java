package com.sf.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SfUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfUserCenterApplication.class,args);
    }
}
