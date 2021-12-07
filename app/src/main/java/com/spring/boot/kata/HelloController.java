package com.spring.boot.kata;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class HelloController {
    @RequestMapping
    public String index() {
        long unixTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        log.info("hitting home page from {}", unixTime);
        return "Hello Spring Boot!!";
    }
}
