package com.example.app;

import com.example.dto.SimpleMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePathService {

    @RequestMapping("/")
    public ResponseEntity<SimpleMessageDto> home() {
        return new ResponseEntity<>(new SimpleMessageDto("Hello Spring Boot World!"),
                HttpStatus.OK);
    }

}
