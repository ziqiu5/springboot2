package com.atguigu.boot.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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

@AllArgsConstructor
@Data
public class User {
    private String username;
    private String password;


}
