package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/login")
    public String login() {
        return "Login page";
    }

    @RequestMapping("/")
    public String home() {
        return "Home page";
    }
}
