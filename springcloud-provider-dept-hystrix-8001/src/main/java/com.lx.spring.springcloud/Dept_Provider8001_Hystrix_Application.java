package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-04-15:49
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@EnableCircuitBreaker
public class Dept_Provider8001_Hystrix_Application {

    public static void main(String[] args){
        SpringApplication.run(Dept_Provider8001_Hystrix_Application.class,args);

    }


}
