package com.atguigu.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName: MyFilter
 * Package: com.atguigu.boot.servlet
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/30 - 19:58  19:58
 * @Version: v1.0
 */

@Slf4j
@WebFilter(urlPatterns = {"/css/*","/images/*","/fonts/*","/js/*"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter初始化完成");
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("MyFilter工作");
        chain.doFilter(request,response );
    }

    @Override
    public void destroy() {
        log.info("MyFilter销毁");
    }
}
