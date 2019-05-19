package com.demo.config;

import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Administrator
 * @Date: 2019-05-17 12:53
 * @Description:service配置
 * @Configuration:说明当前类为配置类
 */
@Configuration
public class Whole {
    @Autowired
    private ApplicationContext ioc;
    @Bean
    public HelloService helloService(){
        System.out.println("正在测试配置类添加HelloService组建");
        return new HelloService();
    }
}
