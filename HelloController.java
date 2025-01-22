package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a RESTful controller
public class HelloController {

    @GetMapping("/hello")  // Maps GET requests to /hello
    public String sayHello() {
        return "Hello, Spring Boot!";  // Returns a simple greeting message
    }
}
