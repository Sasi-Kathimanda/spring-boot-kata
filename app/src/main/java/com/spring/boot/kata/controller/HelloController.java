package com.spring.boot.kata.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class HelloController {
    private static final AtomicInteger counter = new AtomicInteger(1);

    @RequestMapping("/hello")
    public String index() {
        log.info("INFO hitting home page for {} times ", counter.getAndIncrement());
        return "Hello Spring Boot!!";
    }
}
