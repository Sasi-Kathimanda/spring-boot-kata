package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConstructorInjectedControllerIT {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    void constructorInjectionViaSpringContext() {
        var controller = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        assertEquals("Hello Hello from constructor service", controller.greet());
    }
}