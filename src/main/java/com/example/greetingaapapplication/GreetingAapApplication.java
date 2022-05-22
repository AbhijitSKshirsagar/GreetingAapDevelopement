package com.example.greetingaapapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAapApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingAapApplication.class, args);
        System.out.println("Welcome to Gretting Aap..!");
    }

}
