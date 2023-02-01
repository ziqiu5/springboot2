package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.EmpMapper;
import com.atguigu.boot.pojo.Emp;
import com.atguigu.boot.service.EmpService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: EmpServiceImpl
 * Package: com.atguigu.boot.service.impl
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/2/1 - 15:47  15:47
 * @Version: v1.0
 */

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper,Emp> implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmps() {
        return empMapper.selectList(null);
    }

    @Override
    public int deleteEmpById(Long empId) {
        return empMapper.deleteById(empId);
    }

    @Override
    public Emp queryEmpById(Long empId) {
        return empMapper.selectById(empId);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateById(emp);
    }


}
