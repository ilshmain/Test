package com.example.sberprojecttest.exception.response;

public class LandingNotFoundResponse {
    private String message;

    public LandingNotFoundResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}