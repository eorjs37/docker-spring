package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContrller {
    @RequestMapping(value = "/home")
    public String home(){
        return  "index.html";
    }

    @ResponseBody
    @RequestMapping(value =  "/")
    public String helloWorld(){
        return  "return";
    }

    @ResponseBody
    @RequestMapping(value = "/homevalue")
    public String valueTest(){
        String value = "1120";
        return  value;
    }
}
