package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 开启ConfigServer的服务
public class SpringcloudConfigServer3344Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer3344Application.class, args);
    }

}
