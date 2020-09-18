package com.zgy.springcloud.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
            Police police = policeMapper.selectById(id);
            if (null == police) {
                return new Police().setId(-1).setName("查询内容不存在").setDbName("查询内容不存在, 我是8002服务");
            } else {
                return police;
            }
        } else {
            log.info("查询police, 信息为空, 时间是{}!", LocalDateTime.now());
            return new Police().setId(-1).setName("查询内容不存在").setDbName("查询内容不存在, 我是8002服务");
        }
    }

    public List<Police> getAllPolice() {
        log.info("查询police, 时间是{}!", LocalDateTime.now());
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.gt("id", 0);
        List<Police> list = policeMapper.selectList(wrapper);
        if (list.size() == 0) {
            // 一个提示方式，友好一点
            list.add(new Police().setId(-1).setName("查询内容不存在").setDbName("查询内容不存在, 我是8002服务"));
            return list;
        } else {
            return list;
        }
    }
}
