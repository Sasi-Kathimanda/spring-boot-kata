package com.spring.boot.kata.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello from Primary Bean";
    }
}
