package com.demo.controller;

import com.demo.dao.DepartmentDao;
import com.demo.dao.EmployeeDao;
import com.demo.entity.Department;
import com.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 员工查询
     * @param model
     * @return
     */
    @GetMapping(value = "/user/emps")
    public String list(Model model){
        System.out.println("进入员工操作后台");
        Collection<Employee> empList = employeedao.getAll();
        System.out.println(">>>"+empList);
        model.addAttribute("emps",empList);
        System.out.println("结束");
        return "emp/list";
    }

    /**
     * 部门查询
     * @param model
     * @return
     */
    @GetMapping(value ="/user/emp")
    public  String getEmp(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("dept",departments);
        return "emp/listadd";
    }
    @PostMapping(value = "user/empAdds")
    public String empAdd(Employee employee){
        System.out.println("》》");
        return "redirect:/user/emps";
    }
}
