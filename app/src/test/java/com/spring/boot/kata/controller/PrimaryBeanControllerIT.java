package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PrimaryBeanControllerIT {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    void shouldGetTheMessageFromPrimaryBean() {
        var controller = (PrimaryBeanController) applicationContext.getBean("primaryBeanController");
        assertEquals("Hello Hello from primary bean", controller.greet());
    }
}