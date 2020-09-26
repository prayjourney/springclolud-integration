package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启Zuul代理
public class SpringcloudZuul8899Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuul8899Application.class, args);
    }

}
