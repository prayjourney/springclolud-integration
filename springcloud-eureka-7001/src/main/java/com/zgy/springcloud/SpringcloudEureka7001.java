package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Eureka的服务端
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka7001.class, args);
    }

}
