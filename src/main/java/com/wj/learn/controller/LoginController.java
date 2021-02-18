package com.wj.learn.controller;

import com.wj.learn.bean.AdminUserBean;
import com.wj.learn.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    //将Service注入Web层
    @Autowired
    AdminUserService adminUserService;

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public AdminUserBean login(String name,String password){
        AdminUserBean adminUserBean = adminUserService.loginIn(name,password);
        if(adminUserBean!=null){
            return adminUserBean;
        }else {
            return null;
        }
    }

}
