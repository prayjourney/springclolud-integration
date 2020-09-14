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
@RequestMapping("consumer/police")
public class PoliceConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String restURL="http://localhost:9001";

    @GetMapping("get")
    public Police get(Integer id){
        log.info("准备从远程获取police, id是：{}!", id);
        return restTemplate.getForObject(restURL+"/police/get?id="+id, Police.class);
    }
}
