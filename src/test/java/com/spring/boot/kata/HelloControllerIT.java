package com.spring.boot.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerIT {
    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        this.base = new URL("http://localhost:"+port);
    }

    @Test
    void getHello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(base.toString(), String.class);
        assertThat(responseEntity.getBody()).isEqualTo("Hello Spring Boot!!");
    }
}
