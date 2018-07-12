package com.lx.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-10-16:52
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_Application {


    public static void main(String[] args){
        SpringApplication.run(Zuul_9527_Application.class,args);
    }
}
