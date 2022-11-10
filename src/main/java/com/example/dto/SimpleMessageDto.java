package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleMessageDto {

    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SimpleMessageDto(String message) {
        this.message = message;
    }

    public SimpleMessageDto() {
    }
}
