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
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-8001", configuration = MyRoundRobinRule.class)
public class SpringcloudConsumer8701 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumer8701.class, args);
    }
    /**
     * 🗡🗡🗡有个问题，比如我现在有3个provider, 服务名不一样，那么name=xxx1, 不就对这个服务负载均衡方式定死了？ 怎么能达到负载均衡呢？
     * 通过eureka集群，访问注册的服务，是否说服务名可以相同？否则的话，其他的就达不到负载均衡的效果了,怎么理解？
     *
     * ===>服务名可以相同，相当于一个服务部署了多个服务器，然后每个服务器的id不同就行了，也就是eureka.instance.instance-id不同就行
     */

}
