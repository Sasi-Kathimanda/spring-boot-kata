package com.spring.boot.kata.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class MyController {
    public String index() {
        log.info("Hello");
        return "how are you ?";
    }
}
