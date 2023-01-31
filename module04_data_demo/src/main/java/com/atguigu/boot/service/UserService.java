package com.atguigu.boot.service;

import com.atguigu.boot.pojo.User;

/**
 * ClassName: UserService
 * Package: com.atguigu.boot.service
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:37  14:37
 * @Version: v1.0
 */


public interface UserService {

    /**
     * 根据用户id查询用户信息
     * @param userId 要查询的用户id
     * @return 返回查询到的用户信息
     */
    User queryUserById(Integer userId);

}
