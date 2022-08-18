package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("EN")
class I18nControllerIT {
    @Autowired
    ApplicationContext context;

    @Test
    void shouldGiveENMessageWhenProfileSetAsEN() {
        var controller = (I18nController) context.getBean("i18nController");
        Assertions.assertEquals("Hello World in EN", controller.greet());
    }
}