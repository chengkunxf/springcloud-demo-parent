package com.bying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoConsumerApplication.class, args);
    }

}
