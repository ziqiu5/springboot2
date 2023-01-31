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
 * @Create: 2023/1/24 - 21:35  21:35
 * @Version: v1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    private String username;
    private String password;
}
