package com.springstudy.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/leaders")
    public String leadersHomePage(){
        return "manager";
    }
    @GetMapping("/systems")
    public String systemsHomePage(){
        return "system";
    }
}
