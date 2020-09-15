package com.zgy.springcloud.controller;

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


    @GetMapping("get")
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
}
