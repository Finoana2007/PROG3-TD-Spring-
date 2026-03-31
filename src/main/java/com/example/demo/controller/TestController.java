package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    // Ton /hello-world existant (TD1)
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world!";
    }

    // Ton /welcome (TD2)
    @GetMapping("/welcome")
    public String welcome(@RequestParam String name) {
        return "Welcome " + name + "!";
    }
}