package com.spring.boot.kata.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default","test"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World in EN";
    }
}
