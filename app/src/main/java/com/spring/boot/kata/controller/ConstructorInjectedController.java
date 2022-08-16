package com.spring.boot.kata.controller;

import com.spring.boot.kata.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greeting();
    }
}
