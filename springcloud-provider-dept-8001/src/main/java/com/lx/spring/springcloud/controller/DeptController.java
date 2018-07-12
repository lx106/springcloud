package com.lx.spring.springcloud.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.lx.spring.springcloud.bean.Dept;
import com.lx.spring.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuxun
 * @since 2018-06-26
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/list")
    @ResponseBody
    public List<Dept> list(){
      return deptService.selectList(null);
    }


    @RequestMapping("/get/{id}")
    @ResponseBody
    public Dept get(@PathVariable("id") Long id){
        EntityWrapper<Dept> ew = new EntityWrapper<Dept>();
        ew.eq("deptno",id);
        try {
            Dept dept = deptService.selectOne(ew);
        }catch (Exception e){
            System.out.println(e);
        }
        return deptService.selectOne(ew);
    }

    @RequestMapping("/discovery")
    @ResponseBody
    public Object discovery(){

        List<String> services = discoveryClient.getServices();
        System.out.println("##### "+services);

        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+":"+instance.getServiceId()+":"+instance.getPort()+":"+instance.getUri());
            Map<String, String> metadata = instance.getMetadata();
            System.out.println(metadata);
        }
        return this.discoveryClient;
    }
}

