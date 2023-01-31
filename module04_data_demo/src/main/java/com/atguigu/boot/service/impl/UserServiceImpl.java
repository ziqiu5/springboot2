package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.boot.service.impl
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:37  14:37
 * @Version: v1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User queryUserById(Integer userId) {
        return userMapper.queryUserById(userId);
    }
}
