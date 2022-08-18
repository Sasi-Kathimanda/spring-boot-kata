package com.spring.boot.kata.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello from constructor service";
    }
}
