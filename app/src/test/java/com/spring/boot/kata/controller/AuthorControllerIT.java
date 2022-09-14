package com.spring.boot.kata.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AuthorControllerIT {
    @LocalServerPort
    String port;
    URL base;
    @Autowired
    TestRestTemplate restTemplate;

    @BeforeEach
    void setUp() throws MalformedURLException {
        this.base = new URL(String.format("http://localhost:%s/authors", port));

    }

    @Test
    void getAuthors() {
        ResponseEntity<String> response = restTemplate.getForEntity(base.toString(), String.class);

        Assertions.assertTrue(response.toString().contains("Coelho"));
    }

}
