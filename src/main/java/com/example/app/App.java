package com.example.app;

import com.example.dto.SimpleMessageDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.services")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
