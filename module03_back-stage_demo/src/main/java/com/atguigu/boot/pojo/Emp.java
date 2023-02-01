package com.atguigu.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ClassName: Emp
 * Package: com.atguigu.boot.pojo
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/2/1 - 15:42  15:42
 * @Version: v1.0
 */

@Data
@AllArgsConstructor
@TableName("t_emp")
public class Emp {
    @TableId(value = "emp_id",type = IdType.AUTO)
    private Long id;
    private String empName;
    private Integer age;
    private String email;
    private BigDecimal sal;


}
