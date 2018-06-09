package com.itheima.ssm.controller;


import com.itheima.ssm.entity.SUser;
import com.itheima.ssm.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 用户登录类
 */
@Controller
public class LoginController {

    @Autowired
    private SUserService userService;

    @RequestMapping("/user/showLongin")
    public String showLogin(){

        return "login";
    }

    @RequestMapping("/user/Login")
    public String login(SUser user, HttpSession session){

        SUser user_day = userService.selectSUserByObj(user);

        if(user_day != null){
            session.setAttribute("user",user_day);
            return "redirect:/centerlsit";
        }

        return "redirect:/user/showLongin.action";
    }

}
