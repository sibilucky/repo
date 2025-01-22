package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Marks this class as the Spring Boot application entry point
public class MySpringBootApp {

    public static void main(String[] args) {
        // Launches the application
        SpringApplication.run(MySpringBootApp.class, args);
    }
}
