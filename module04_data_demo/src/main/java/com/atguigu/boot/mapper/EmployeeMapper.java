package com.atguigu.boot.mapper;

import com.atguigu.boot.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: EmployeeMapper
 * Package: com.atguigu.boot.mapper
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 15:49  15:49
 * @Version: v1.0
 */

@Mapper
public interface EmployeeMapper {

    @Select("select * from `employee` where empId = #{empId}")
    Employee queryEmpById(@Param("empId") Integer empId);


}
