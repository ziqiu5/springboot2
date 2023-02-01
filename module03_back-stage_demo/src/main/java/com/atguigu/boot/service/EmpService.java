package com.atguigu.boot.service;

import com.atguigu.boot.pojo.Emp;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * ClassName: EmpService
 * Package: com.atguigu.boot.service
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/2/1 - 15:47  15:47
 * @Version: v1.0
 */


public interface EmpService extends IService<Emp> {

    List<Emp> getAllEmps();

    int deleteEmpById(Long empId);

    Emp queryEmpById(Long empId);

    int updateEmp(Emp emp);

}
