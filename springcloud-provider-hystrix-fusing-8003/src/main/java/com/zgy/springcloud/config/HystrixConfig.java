package com.zgy.springcloud.config;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/23 2:02
 * @Modified by:
 */
// https://blog.csdn.net/shilu89757/article/details/79363295
@Configuration
public class HystrixConfig {

    // 用来拦截处理HystrixCommand注解
    // @Bean
    // public HystrixCommandAspect hystrixAspect() {
    //     return new HystrixCommandAspect();
    // }

    // 用来像监控中心Dashboard发送stream信息， 也可以直接放在main函数之中
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registration.addUrlMappings("/hystrix.stream");
        return registration;
    }

}
