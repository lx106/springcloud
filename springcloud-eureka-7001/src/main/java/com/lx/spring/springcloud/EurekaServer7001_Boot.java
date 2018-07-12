package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-04-21:02
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_Boot {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7001_Boot.class,args);
    }
}
