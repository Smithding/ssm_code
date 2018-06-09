package com.itheima.ssm.controller;


import com.itheima.ssm.entity.SCust;
import com.itheima.ssm.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 商品功能类
 */
@Controller

public class DemoController {

    @Autowired
    private SUserService suserservice;

    @RequestMapping("/centerlsit")
    public String showIndex( HttpSession session){


        List<SCust> custList = suserservice.getCustList();
        session.setAttribute("custlist",custList);
        return "center";
    }

    @RequestMapping("/delect")
    @ResponseBody
    public String delect(String id,HttpSession session){

            suserservice.delectCust(id);
            return "删除成功";
    }




}
