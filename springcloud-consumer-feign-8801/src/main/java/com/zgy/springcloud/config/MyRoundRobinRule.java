package com.zgy.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author renjiaxin
 * @Date 2020/9/15
 * @Description
 */
@Configuration
public class MyRoundRobinRule {
    @Bean(name = "myRule")
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
