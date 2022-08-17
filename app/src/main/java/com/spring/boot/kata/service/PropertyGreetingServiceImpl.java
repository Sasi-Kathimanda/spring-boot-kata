package com.spring.boot.kata.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello from property service";
    }
}
