package com.spring.boot.kata.controller;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String greet() {
        return greetingService.greeting();
    }
}
