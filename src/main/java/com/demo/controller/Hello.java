package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019-05-22 13:50
 * @Description:
 */
@Controller
public class Hello {
    /**
     * 由thymeleaf模板进行解析的
     * @return
     */
    @RequestMapping("/hello")//测试
    public String main(Map<String,Object> map){
        map.put("hello","欢迎来到springboot世界，希望你学习节节攀升");
        return "index";
    }
}
