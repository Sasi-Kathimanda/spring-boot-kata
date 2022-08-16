package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class PropertyInjectedControllerITTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    void propertyInjectionViaSpringContext() {
        var propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        assertEquals("Hello Hello", propertyInjectedController.greet());
    }
}