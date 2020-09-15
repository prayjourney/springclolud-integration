package com.zgy.springcloud.controller;

import com.zgy.springcloud.pojo.Police;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/14 9:15
 * @Modified by:
 */
@Slf4j
@RestController
@RequestMapping("consumer8601/police")
public class PoliceConsumer8601Controller {
    @Autowired
    private RestTemplate restTemplate;

    // private static final String restURL = "http://127.0.0.1:8001";
    // 上面是传统的方式，下面是通过注册中心的方式，就可以获取我们想要的信息了

    // 使用了Ribbon之后, 这个地址应该是一个变量，通过服务名来访问, 下面两种都可以
    // private static final String restURL = "http://springcloud-provider";
    private static final String restURL = "http://SPRINGCLOUD-PROVIDER";
    @GetMapping("get")
    public Police get(Integer id) {
        log.info("准备从远程获取police, id是：{}!", id);
        return restTemplate.getForObject(restURL + "/police/get?id=" + id, Police.class);
    }
}
