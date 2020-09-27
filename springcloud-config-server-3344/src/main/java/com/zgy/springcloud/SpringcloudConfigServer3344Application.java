package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
// import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer // 开启ConfigServer的服务
//@EnableEurekaClient // 服务启动后自动注册到eureka注册中心
//@EnableDiscoveryClient // 服务可以被发现
public class SpringcloudConfigServer3344Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer3344Application.class, args);
    }

}
