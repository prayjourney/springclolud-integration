package com.zgy.springcloud.service;

import com.zgy.springcloud.pojo.Police;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author renjiaxin
 * @Date 2020/9/16
 * @Description 该接口对应于应用id为SPRINGCLOUD-PROVIDER的微服务
 */
@Component
public class PoliceClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new PoliceClientService() {
            @Override
            public int addPolice(Police police) {
                return -1;
            }

            @Override
            public int delPolice(Integer id) {
                return -1;
            }

            @Override
            public int updatePolice(Police police) {
                return -1;
            }

            @Override
            public Police getPolice(Integer id) {
                return new Police().setId(-1).setName("用户不存在，降级措施").setDbName("用户不存在，降级措施");
            }

            @Override
            public List<Police> getAllPolice() {
                List<Police> list = new ArrayList<>();
                list.add(new Police().setId(-1).setName("用户不存在，降级措施").setDbName("用户不存在，降级措施"));
                return list;
            }
        };
    }
}