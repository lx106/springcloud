package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-11-9:30
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Eureka_Client_7001 {

    public static void main(String[] args){
        SpringApplication.run(Config_Eureka_Client_7001.class,args);
    }
}
