package com.spring.boot.kata.controller;

import com.spring.boot.kata.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {
    private final GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return "";
    }
}
