package com.zgy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author renjiaxin
 * @Date 2020/9/27
 * @Description
 */
@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("info")
    public String getConfigBasicInfo() {
        return "appName: " + appName + ", serverPort: " + serverPort;
    }
}
