package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-04-15:49
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableTransactionManagement
public class Dept_Provider_Config_Client_8001_Boot {

    public static void main(String[] args){
        SpringApplication.run(Dept_Provider_Config_Client_8001_Boot.class,args);

    }


}
