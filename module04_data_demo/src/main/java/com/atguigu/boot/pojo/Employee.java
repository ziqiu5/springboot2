package com.atguigu.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * ClassName: Employee
 * Package: com.atguigu.boot.pojo
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 15:47  15:47
 * @Version: v1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private Integer empId;
    private String name;
    private String sex;
    private BigDecimal sal;

}
