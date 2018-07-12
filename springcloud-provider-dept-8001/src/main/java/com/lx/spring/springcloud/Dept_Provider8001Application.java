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
@EnableTransactionManagement
public class Dept_Provider8001Application {

    public static void main(String[] args){
        SpringApplication.run(Dept_Provider8001Application.class,args);

    }


}
