package com.zgy.springcloud.service;

import com.zgy.springcloud.mapper.PoliceMapper;
import com.zgy.springcloud.pojo.Police;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/13 20:57
 * @Modified by:
 */
@Service
@Slf4j
public class PoliceService {
    @Autowired
    PoliceMapper policeMapper;

    public int addPolice(Police police) {
        if (null != police) {
            log.info("插入police, 信息是：{}, 时间是{}!", police.toString(), LocalDateTime.now());
            return policeMapper.insert(police);
        } else {
            log.info("插入police, 信息为空, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }

    public int delPolice(Integer id) {
        Police police = policeMapper.selectById(id);
        if (null != police) {
            log.info("删除police, 信息是：{}, 时间是{}!", police.toString(), LocalDateTime.now());
            return policeMapper.deleteById(id);
        } else {
            log.info("删除police, 信息不存在, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }

    public int updatePolice(Police police) {
        Police policeTemp = policeMapper.selectById(police.getId());
        if (null != policeTemp && police != null) {
            log.info("修改police, 信息是：{}, 时间是{}!", police.toString(), LocalDateTime.now());
            return policeMapper.updateById(police);
        } else {
            log.info("修改police, police信息不存在, 时间是{}!", LocalDateTime.now());
            return -1;
        }
    }

    public Police getPolice(Integer id) {
        if (id > 0) {
            log.info("查询police, 时间是{}!", LocalDateTime.now());
            return policeMapper.selectById(id);
        } else {
            log.info("查询police, 信息为空, 时间是{}!", LocalDateTime.now());
            return null;
        }
    }

    public List<Police> getPolice(List<Integer> ids) {
        if (null != ids) {
            log.info("查询police, 时间是{}!", LocalDateTime.now());
            return policeMapper.selectBatchIds(ids);
        } else {
            log.info("查询police, 信息为空, 时间是{}!", LocalDateTime.now());
            return null;
        }
    }
}
