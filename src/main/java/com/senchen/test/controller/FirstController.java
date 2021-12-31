package com.senchen.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping("/git/send01")
    @ResponseBody
    public String prepared01(){
        System.out.println("准备上传git的springboot项目");
        return "git项目test";
    }
}
