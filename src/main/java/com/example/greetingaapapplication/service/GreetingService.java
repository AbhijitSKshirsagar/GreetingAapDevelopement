package com.example.greetingaapapplication.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getMessage() {
        return "Hello World";
    }
}
