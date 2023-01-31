package com.atguigu.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: User
 * Package: com.atguigu.boot.pojo
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 20:01  20:01
 * @Version: v1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private Pet pet;

}
