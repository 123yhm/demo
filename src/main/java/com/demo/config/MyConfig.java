package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: Administrator
 * @Date: 2019-05-23 23:14
 * @Description:既保留了自动配置，也可以加载我们自定义配置
 */
//@EnableWebMvc  //全面接管springmvc;回到ssm框架整合状态，所有的配置都需要自己重新写，这样可以节省很多不必要的组件加载，节省内存空间
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hm").setViewName("success");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     * 配置首页访问的路径
     * @return
     */
    @Bean   //注册到容器中，让容器进行加载
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login").setViewName("login");
            }
        };
        return adapter;
    }

}
