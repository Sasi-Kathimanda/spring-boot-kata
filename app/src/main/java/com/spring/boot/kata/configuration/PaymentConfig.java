package com.spring.boot.kata.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Data
@Configuration
@ConfigurationProperties(prefix = "payment-configuration")
public class PaymentConfig {
    private List<PaymentProvider> paymentConfiguration;

    public record PaymentProvider(String paymentProvider,
                                  boolean enabled,
                                  PaymentMethod paymentMethod,
                                  Schedule schedule
    ) {
    }

    public record PaymentMethod(List<String> enable, List<String> disable) {
    }

    public record Schedule(boolean retry) {
    }
}

