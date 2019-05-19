package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: Administrator
 * @Date: 2019-05-15 23:29
 * @Description:
 * @ImportResource(value = {"classpath:bean.xml"}):这加载配置文件的第一种方式，springboor中提倡第二种直接写一个配置类来注入
 */
//@ImportResource(value = {"classpath:bean.xml"})
@SpringBootApplication
class HelloWorldMainApplication {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
