package com.spring.boot.kata.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Data
@Configuration
@ConfigurationProperties(prefix = "payment-configuration")
public class PaymentConfig {
    private List<PaymentProvider> paymentCountries;

    public record PaymentProvider(String name,
                                  boolean allowUPI,
                                  List<PaymentMethodEnabled> paymentMethodsEnabled,
                                  Schedule schedule
    ) {
    }

    public record PaymentMethodEnabled(String name,
                                       boolean allowUPI,
                                       List<String> disabled,
                                       Schedule schedule) {
    }

    public record Schedule(boolean retry, int maxCount) {
    }
}

