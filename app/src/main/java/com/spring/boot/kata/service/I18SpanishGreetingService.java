package com.spring.boot.kata.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello Mundo in ES";
    }
}
