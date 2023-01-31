package com.atguigu.boot.interceptor;

/**
 * ClassName: LoginInterceptor
 * Package: com.atguigu.boot.interceptor
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/28 - 11:42  11:42
 * @Version: v1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 目标方法执行之前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle拦截的请求:{}", request.getRequestURI());
        HttpSession session = request.getSession();
        //若session中存在了user 则登录成功,放行
        if (session.getAttribute("user") != null) {
            return true;
        }
        request.setAttribute("msg", "请先登录!");
        request.getRequestDispatcher("/login").forward(request, response);
        return false;
    }

    /**
     * 目标方法执行之后
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle方法执行{}", modelAndView);

    }

    /**
     * 页面渲染之后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("页面渲染后产生的异常{}", ex);
    }
}
