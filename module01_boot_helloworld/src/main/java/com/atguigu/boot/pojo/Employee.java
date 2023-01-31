package com.atguigu.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: Employee
 * Package: com.atguigu.boot.pojo
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 20:54  20:54
 * @Version: v1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@ConfigurationProperties(prefix = "emp")
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
}
