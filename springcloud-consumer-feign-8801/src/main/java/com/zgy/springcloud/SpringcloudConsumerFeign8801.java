package com.zgy.springcloud;

import com.zgy.springcloud.config.MyRoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
// 使用自定义的负责均衡规则，name指的是对那个服务进行负载均衡
@RibbonClient(name = "SPRINGCLOUD-PROVIDER", configuration = MyRoundRobinRule.class)
public class SpringcloudConsumerFeign8801 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerFeign8801.class, args);
    }

}
