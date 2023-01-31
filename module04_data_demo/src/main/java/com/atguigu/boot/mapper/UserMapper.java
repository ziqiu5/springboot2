package com.atguigu.boot.mapper;

import com.atguigu.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: UserMapper
 * Package: com.atguigu.boot.mapper
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 14:48  14:48
 * @Version: v1.0
 */

@Mapper
public interface UserMapper {

    /**
     * 根据用户id查询信息
     * @param id 要查询的用户ID
     * @return 返回查询到的用户信息
     */
    User queryUserById(@Param("id") Integer id);


}
