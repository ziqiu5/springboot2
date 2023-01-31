package com.atguigu.boot.controller;

import com.atguigu.boot.mapper.EmployeeMapper;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.EmployeeService;
import com.atguigu.boot.service.UserService;
import com.atguigu.boot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.ParameterizedType;

/**
 * ClassName: QueryUserController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:43  14:43
 * @Version: v1.0
 */

@Controller
public class DataController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmployeeService employeeService;


    @ResponseBody
    @RequestMapping("/user/{id}")
    public String queryUserById(@PathVariable("id")Integer id){
        return userService.queryUserById(id).toString();
    }

    @ResponseBody
    @RequestMapping("/emp/{empId}")
    public String queryEmpById(@PathVariable("empId") Integer empId){
        return employeeService.queryEmpById(empId).toString();
    }

}
