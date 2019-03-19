package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    //@GetMapping(value = "/hi")
    @GetMapping(value = "/")
    public String hi(){
        return "Hello world!";
    }
}
