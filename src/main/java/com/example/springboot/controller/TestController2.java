package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController2 {
    @RequestMapping(value = "/home2")
    public String home(){
        return  "index.html";
    }

    @ResponseBody
    @RequestMapping(value =  "/test")
    public String helloWorld(){
        return  "11233213";
    }
}
