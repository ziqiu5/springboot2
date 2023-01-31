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
 * @Create: 2023/1/31 - 14:45  14:45
 * @Version: v1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private String gender;

}
