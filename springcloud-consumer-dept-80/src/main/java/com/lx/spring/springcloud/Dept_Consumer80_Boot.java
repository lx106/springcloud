package com.lx.spring.springcloud;

import com.lx.spring.myrule.bean.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-04-20:13
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = MySelfRule.class)
public class Dept_Consumer80_Boot {

    public static void main(String[] args){
        SpringApplication.run(Dept_Consumer80_Boot.class,args);
    }
}
