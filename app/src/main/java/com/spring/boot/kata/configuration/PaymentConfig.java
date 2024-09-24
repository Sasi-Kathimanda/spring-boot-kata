package com.spring.boot.kata.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "payment-configuration")
public class PaymentConfig {
    private List<PaymentProvider> paymentConfiguration;
}

