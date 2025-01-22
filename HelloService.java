package com.example.service;

import org.springframework.stereotype.Service;

@Service  // Marks this class as a Spring service
public class HelloService {

    public String getGreeting() {
        return "Hello from Service Layer!";
    }
}
