package com.example.services;

import com.example.dto.SimpleMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePathService {

    @RequestMapping(
            path = "/",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<SimpleMessageDto> home() {
        return new ResponseEntity<>(new SimpleMessageDto("Hello Spring Boot World!"),
                HttpStatus.OK);
    }

}
