package com.atguigu.boot.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.atguigu.boot.error
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/30 - 19:13  19:13
 * @Version: v1.0
 */

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class})
    public String handleArithException(Exception ex) {
        log.error("异常是:{}", ex);
        return "index";
    }

}
