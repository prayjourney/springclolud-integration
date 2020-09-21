package com.zgy.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zgy.springcloud.pojo.Police;
import com.zgy.springcloud.service.PoliceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: renjiaxin
 * @Despcription: 对消费者提供restful服务
 * @Date: Created in 2020/9/14 8:47
 * @Modified by:
 */
@Slf4j
@RestController
@RequestMapping("police")
public class PoliceController {
    @Autowired
    PoliceService policeService;


    @PostMapping("add")
    public int addPolice(Police police) {
        if (null != police) {
            log.info("8002服务" + "插入police, 信息是：{}, 时间是{}!", police.toString(), LocalDateTime.now());
            return policeService.addPolice(police);
        } else {
            log.info("8002服务" + "插入police, 信息为空, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }


    @GetMapping("del")
    public int delPolice(Integer id) {
        if (id > 0) {
            log.info("8002服务" + "删除police, id是：{}, 时间是{}!", id, LocalDateTime.now());
            return policeService.delPolice(id);
        } else {
            log.info("8002服务" + "删除police, 信息不存在, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }


    @PostMapping("update")
    public int updatePolice(Police police) {
        if (police.getId() < 0) {
            log.info("8002服务" + "修改police, 信息是：{}, 时间是{}!", police.toString(), LocalDateTime.now());
            return policeService.updatePolice(police);
        } else {
            log.info("8002服务" + "修改police, police信息不存在, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }


    // 熔断需要使用到的方法，放在service层吧，在controller层不好使啊！
    // https://blog.csdn.net/cnm____1314/article/details/80049245
    // 服务熔断时，会调用备用方法getPoliceFallback
    @GetMapping("get")
    //@HystrixCommand(defaultFallback = "getPoliceFallback")
    public Police getPolice(Integer id) {
        if (id > 0) {
            log.info("8002服务" + "查询police, 时间是{}!", LocalDateTime.now());
            return policeService.getPolice(id);
        } else {
            log.info("8002服务" + "查询police, 信息为空, 时间是{}!", LocalDateTime.now());
            return null;
        }
    }


    @GetMapping("getall")
    public List<Police> getAllPolice() {
        log.info("8002服务" + "查询police, 时间是{}!", LocalDateTime.now());
        return policeService.getAllPolice();
    }


    // 熔断需要使用到的方法，放在service层吧，在controller层不好使啊！
    // 备选方法
    // public Police getPoliceFallback(Integer id){
    //    return new Police().setId(-1).setName("查询内容不存在").setDbName("查询内容不存在, 我是8002服务");
    // }
}
