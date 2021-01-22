package com.example.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestService {

    @RequestMapping("/")
    public String home() {
        return "Hello Spring Boot World!";
    }

}
