package com.zgy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/14 9:14
 * @Modified by:
 */
@Configuration
public class ConfigBean {
    // Ribbon客户端负载均衡, Feign集成了Ribbon
    @Bean
    @LoadBalanced // 默认是轮循
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
