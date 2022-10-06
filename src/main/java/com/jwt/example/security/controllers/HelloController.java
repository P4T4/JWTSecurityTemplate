package com.jwt.example.security.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!!";
    }
}
