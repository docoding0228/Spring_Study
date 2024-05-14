package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @RestController
@Controller
public class HelloController {
//    @GetMapping("/api/hello")
//    public String hello() {
//        return "Hello World!!";
//    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get() {
        return "get method 요청";
    }

    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!!!!";
    }
}


