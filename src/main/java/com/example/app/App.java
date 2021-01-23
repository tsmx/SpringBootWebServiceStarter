package com.example.app;

import com.example.utils.SimpleMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

    @RequestMapping("/")
    public ResponseEntity<SimpleMessage> home() {
        return new ResponseEntity<>(new SimpleMessage("Hello Spring Boot World!"),
                HttpStatus.OK);
    }

    public static void main(String... args) {
        SpringApplication.run(App.class, args);
    }
}
