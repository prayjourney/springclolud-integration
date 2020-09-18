package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient // 服务启动后自动注册到eureka注册中心
@EnableDiscoveryClient // 服务可以被发现
@EnableHystrix // 启用Hystrix
// @EnableCircuitBreaker // 启用熔断器，这个注解作用在了@EnableHystrix之上
public class SpringcloudProviderHystrixFusing8003 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderHystrixFusing8003.class, args);
    }

}
