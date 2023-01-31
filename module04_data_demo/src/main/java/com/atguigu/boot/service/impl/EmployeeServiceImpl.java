package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.EmployeeMapper;
import com.atguigu.boot.pojo.Employee;
import com.atguigu.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: EmployeeServiceImpl
 * Package: com.atguigu.boot.service.impl
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 15:51  15:51
 * @Version: v1.0
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EmployeeMapper employeeMapper;

    @Override
    public Employee queryEmpById(Integer empId) {
        return employeeMapper.queryEmpById(empId);
    }
}
