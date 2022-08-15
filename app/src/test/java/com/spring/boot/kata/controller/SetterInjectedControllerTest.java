package com.spring.boot.kata.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterInjectedControllerTest {
    SetterInjectedController sut;

    @BeforeEach
    void setUp() {
        sut = new SetterInjectedController();
        sut.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void whenGreetingIsCalledUsingSetter() {
        assertEquals("Hello Hello", sut.greet());
    }
}