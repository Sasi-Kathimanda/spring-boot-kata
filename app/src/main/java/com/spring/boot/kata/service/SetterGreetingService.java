package com.spring.boot.kata.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello from setter service";
    }
}
