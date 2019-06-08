package com.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: Administrator
 * @Date: 2019-06-04 22:27
 * @Description:登入页面拦截器
 *
 * */

public class LoginHandleInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object user=httpServletRequest.getSession().getAttribute("userName");
        if(user==null||user.equals(null)){
            httpServletRequest.setAttribute("loginError","您还没有权限！请您先登入");
            httpServletRequest.getRequestDispatcher("/").forward(httpServletRequest,httpServletResponse);
            return false;
        }else{
            //放行请求
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
