package com.example.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleMessage {
    @JsonProperty
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SimpleMessage(@JsonProperty("message") String message) {
        this.message = message;
    }
}
