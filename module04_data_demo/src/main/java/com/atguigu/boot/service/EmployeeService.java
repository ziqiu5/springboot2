package com.atguigu.boot.service;

import com.atguigu.boot.pojo.Employee;

/**
 * ClassName: EmployeeService
 * Package: com.atguigu.boot.service
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 15:51  15:51
 * @Version: v1.0
 */


public interface EmployeeService {

    Employee queryEmpById(Integer empId);

}
