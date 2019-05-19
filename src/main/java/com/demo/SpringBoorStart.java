package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: 明
 * @Date: 2019-05-15 23:29
 * @Description:
 * @ImportResource(value = {"classpath:bean.xml"}):这加载配置文件的第一种方式，springboor中提倡第二种直接写一个配置类来注入
 *
 *
 * 自动注入：
 * SpringBoot启动会加载大量的自动配置类
 *
 * ​	2）、我们看我们需要的功能有没有SpringBoot默认写好的自动配置类；
 *
 * ​	3）、我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件有，我们就不需要再来配置了）
 *
 * ​	4）、给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中指定这些属性的值
 *
 *
 *
 *
 */
//@ImportResource(value = {"classpath:bean.xml"})
@SpringBootApplication
class HelloWorldMainApplication {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
