package com.spring.boot.kata.controller;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Hello";
    }
}
