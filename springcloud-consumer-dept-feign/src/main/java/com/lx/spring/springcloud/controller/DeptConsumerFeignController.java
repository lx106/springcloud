package com.lx.spring.springcloud.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lx.spring.springcloud.bean.Dept;
import com.lx.spring.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-05-17:53
 */
@RestController
public class DeptConsumerFeignController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }
}
