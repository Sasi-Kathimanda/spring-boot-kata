package com.spring.boot.kata.controller;

import com.spring.boot.kata.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {
    PropertyInjectedController sut;

    @BeforeEach
    void setUp() {
        sut = new PropertyInjectedController();
        sut.greetingService = new GreetingServiceImpl();
    }

    @Test
    void greetingServiceGreetReturnsGreetingMsg() {
        assertEquals("Hello Hello", sut.greet());
    }
}