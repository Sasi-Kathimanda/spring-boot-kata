package com.spring.boot.kata.controller;

import com.spring.boot.kata.service.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController sut;

    @BeforeEach
    void setUp() {
        sut = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getTheGreetingMsgViaConstructorInjectedController() {
        Assertions.assertEquals("Hello Hello", sut.greet());
    }

}