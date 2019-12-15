package com.sf.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SfConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfConfigServerApplication.class,args);
    }
}
