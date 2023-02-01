package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.boot.service.impl
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 17:31  17:31
 * @Version: v1.0
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{



}
