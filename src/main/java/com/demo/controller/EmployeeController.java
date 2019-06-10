package com.demo.controller;

import com.demo.dao.DepartmentDao;
import com.demo.dao.EmployeeDao;
import com.demo.entity.Department;
import com.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
    @GetMapping(value = "/emps")
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
    @GetMapping(value ="/emp")
    public  String getEmp(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("dept",departments);

        return "emp/listadd";
    }

    /**
     * 员工添加
     * @param employee
     * @return
     */
    @PostMapping(value = "/empAdds")
    public String empAdd(Employee employee){
        employeedao.save(employee);
        return "redirect:/emps";
    }
    /**
     * 员工修改跳转显示
     */
    @GetMapping(value = "/emp/{id}")
    public String empEdit(@PathVariable("id") Integer id, Model model){
        //先查询当前员工信息
        Employee employee = employeedao.get(id);
        model.addAttribute("emp",employee);
        //部门查询
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("dept",departments);
        return "emp/listadd";
    }
    /**
     * 员工修改---重回员工列表页面
     */
    @PutMapping(value = "/empAdds")
    public String putUpdate(Employee employee){
        employeedao.save(employee);//后台判断当前的值是否存在，不存在则自增，存在就修改
        return "redirect:/emps";
    }
}
