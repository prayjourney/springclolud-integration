package com.zgy.springcloud.service;

import com.zgy.springcloud.pojo.Police;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author renjiaxin
 * @Date 2020/9/16
 * @Description 该接口对应于应用id为SPRINGCLOUD-PROVIDER的微服务
 */
/**
 * 这个是一个关键，我们使用feign的服务，去调用provider服务提供者的服务，这时候，我们就去会从@FeignClient注解的服务之中，找相同声明的方法，然后实际调用
 */
// 该接口对应于应用id为SPRINGCLOUD-PROVIDER的微服务
@Component // 👕👕👕feign的接口，添加到spring管理
@FeignClient(value = "SPRINGCLOUD-PROVIDER")
public interface PoliceClientService {
    @PostMapping(value = "/police/add")
    public int addPolice(@RequestBody Police police);

    @GetMapping(value = "/police/del")
    public int delPolice(@RequestParam("id") Integer id);

    @PostMapping(value = "/police/update")
    public int updatePolice(@RequestBody Police police);

    @GetMapping(value = "/police/get")
    public Police getPolice(@RequestParam("id") Integer id);

    @GetMapping(value = "/police/getall")
    public List<Police> getAllPolice();
}