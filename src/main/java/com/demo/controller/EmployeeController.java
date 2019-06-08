package com.demo.controller;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


/**
 * @Auther: Administrator
 * @Date: 2019-06-05 23:03
 * @Description: 员工操作
 *
 * */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeedao;

    @GetMapping(value = "/user/emps")
    public String list(Model model){
        System.out.println("进入员工操作后台");
        Collection<Employee> empList = employeedao.getAll();
        System.out.println(">>>"+empList);
        model.addAttribute("emps",empList);
        System.out.println("结束");
        return "emp/list";
    }
}
