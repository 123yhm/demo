package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019-05-22 13:50
 * @Description:
 */
@RestController
public class Hello {
    @RequestMapping("/hello")//测试
    public String main(){
        return "Hello word";
    }
}
