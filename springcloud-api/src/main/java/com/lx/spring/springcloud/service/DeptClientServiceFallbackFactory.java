package com.lx.spring.springcloud.service;

import com.lx.spring.springcloud.bean.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-10-14:00
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                return new ArrayList<Dept>();
            }

            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDname("DeptClientServiceFallbackFactory: 没有找到对应信息");
                return dept;
            }
        };
    }
}
