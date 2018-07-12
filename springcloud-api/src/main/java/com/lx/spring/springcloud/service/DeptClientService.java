package com.lx.spring.springcloud.service;

import com.lx.spring.springcloud.bean.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-05-17:39
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping("/dept/list")
    List<Dept> list();

    @RequestMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);
}
