package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-05-17:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lx.spring.springcloud"})
public class Dept_Consumer_Feign_Boot {

    public static void main(String[] args){
        SpringApplication.run(Dept_Consumer_Feign_Boot.class,args);
    }
}
