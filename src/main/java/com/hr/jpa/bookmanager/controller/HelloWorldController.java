package com.hr.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")  //http메소드를 GET로 받음
    public String helloworld(){
        return "HELLO WORLD!!";
    }
}
