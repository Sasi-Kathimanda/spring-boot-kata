package com.spring.boot.kata;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
@EnableConfigurationProperties
public class SpringBootKataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKataApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("lets inspect beans provided by spring ");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String name : beanNames) {
               // log.info(name);
            }
        };
    }
}
