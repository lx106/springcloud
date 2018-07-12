package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-10-16:10
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Dept_Consumer_Hystrix_Dashboard_9001 {

    public static void main(String[] args){
        SpringApplication.run(Dept_Consumer_Hystrix_Dashboard_9001.class,args);
    }
}
