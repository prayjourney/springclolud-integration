package com.zgy.springcloud.service;

import com.zgy.springcloud.pojo.Police;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author renjiaxin
 * @Date 2020/9/16
 * @Description 该接口对应于应用id为SPRINGCLOUD-PROVIDER的微服务
 */
// 该接口对应于应用id为SPRINGCLOUD-PROVIDER的微服务
@Component // 👕👕👕feign的接口，添加到spring管理
@FeignClient(value = "SPRINGCLOUD-PROVIDER")
public interface PoliceClientService
{
    @PostMapping(value = "police/add")
    public int addPolice(Police police);

    @GetMapping(value = "police/del")
    public int delPolice(Integer id);

    @PostMapping(value = "police/update")
    public int updatePolice(Police police);

    @GetMapping(value = "police/get")
    public Police getPolice(Integer id);

    @GetMapping(value = "police/getall")
    public List<Police> getAllPolice();
}