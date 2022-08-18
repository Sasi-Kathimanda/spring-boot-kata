package com.spring.boot.kata.service;

public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello from Primary Bean";
    }
}
