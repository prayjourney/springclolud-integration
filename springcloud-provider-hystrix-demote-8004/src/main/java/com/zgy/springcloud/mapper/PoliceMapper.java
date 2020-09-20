package com.zgy.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgy.springcloud.pojo.Police;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/13 20:54
 * @Modified by:
 */
@Mapper
@Repository
public interface PoliceMapper extends BaseMapper<Police> {
}
