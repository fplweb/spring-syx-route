package com.sf.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SfRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfRegistryServerApplication.class,args);
    }
}
