package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019-05-15 23:27
 * @Description:
 */
@RestController
public class Hello {
    //直接获取全局环境中的值
    @Value("${proson.last-name}")
    private String name;
    @RequestMapping("/hello")
    public String hello(){
        return "你好Springboot:"+name;
    }
}
