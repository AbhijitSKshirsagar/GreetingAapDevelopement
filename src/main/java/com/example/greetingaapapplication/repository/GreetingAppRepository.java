package com.example.greetingaapapplication.repository;

import com.example.greetingaapapplication.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public class GreetingAppRepository extends JpaRepository<Greeting, Integer> {
};
