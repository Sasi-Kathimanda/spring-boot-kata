package com.spring.boot.kata.controller;

import com.spring.boot.kata.service.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String greet() {
        return greetingService.greeting();
    }
}
