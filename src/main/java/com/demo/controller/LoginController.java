package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019-06-04 21:38
 * @Description:
 */
@Controller
public class LoginController {
    //@RequestMapping(value = "/user/login",method =RequestMethod.POST)
    @PostMapping(value = "/user/login")
    private String getLogin(@RequestParam String userName,
                            @RequestParam String userPassword,
                            Map<String ,Object> map,
                            HttpSession session){
        if(userName.equals("admin")&&userPassword.equals("abc")){
            session.setAttribute("userName",userName);
            return "redirect:/user/main";
        }else{
            map.put("loginError","账户或密码错误@请您重新登录");
            return "login";
        }

    }
}
