package com.wj.learn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }



}
