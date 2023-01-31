package com.atguigu.boot.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ClassName: UserTooManyException
 * Package: com.atguigu.boot.error
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/30 - 19:23  19:23
 * @Version: v1.0
 */

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "tooManyUsers")
public class UserTooManyException extends RuntimeException{
    public UserTooManyException(){

    }


    public UserTooManyException(String message){
        super(message);
    }

}
