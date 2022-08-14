package com.spring.boot.kata;

import com.spring.boot.kata.controller.MyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class SpringBootKataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKataApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            var myController = (MyController) ctx.getBean("myController");
            log.info("myController = " + myController.index());
            log.info("lets inspect beans provided by spring ");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String name : beanNames) {
                log.info(name);
            }
        };
    }
}
