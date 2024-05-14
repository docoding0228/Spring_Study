package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @RestController
@RequestMapping("/api")
@Controller
public class HelloController {
//    @GetMapping("/api/hello")
//    public String hello() {
//        return "Hello World!!";
//    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!!!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "get method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "post method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "put method 요청";
    }

    @DeleteMapping("/api/delete")
    @ResponseBody
    // http://localhost:8080/api/api/delete 으로 출력해야 출력된다.
    public String Delete() {
        return "Delete method 요청";
    }
}


