package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-10-20:25
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig_3344_Boot {


    public static void main(String[] args){
        SpringApplication.run(SpringCloudConfig_3344_Boot.class,args);
    }
}
