package com.spring.boot.kata.controller;

public class SetterInjectedController {
    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
