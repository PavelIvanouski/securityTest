package com.example.securityTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        return "hello";
    }


    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
