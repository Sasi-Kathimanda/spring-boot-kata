package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SetterInjectedControllerIT {
    @Autowired
    ApplicationContext context;

    @Test
    void setterInjectionViaSpringBean() {
        var controller = (SetterInjectedController) context.getBean("setterInjectedController");
        assertEquals("Hello Hello from setter service", controller.greet());
    }
}