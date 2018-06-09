package com.itheima.ssm.converter;

import com.itheima.ssm.entity.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

public class CustomExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        ex.printStackTrace();
        CustomException customException = null;
        //如果抛出的是系统自定义异常则直接转换

        if (ex instanceof CustomException) {

            customException = (CustomException) ex;

        } else {

            //如果抛出的不是系统自定义异常则重新构造一个系统错误异常。
            customException = new CustomException("您的网络有异常，请重试");

            StringWriter s = new StringWriter();

            PrintWriter printWriter = new PrintWriter(s);

            ex.printStackTrace(printWriter);

            String exceptionString = s.toString();

            //打印日志异常
            System.out.println("异常信息为："+exceptionString);

        }

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("message", customException.getMessage());

        modelAndView.setViewName("error");

        return modelAndView;
    }


}
