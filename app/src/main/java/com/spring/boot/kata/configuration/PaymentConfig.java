package com.spring.boot.kata.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "payment-configuration")
public class PaymentConfig {

    private List<PaymentProvider> paymentConfiguration;

    public List<PaymentProvider> getPaymentConfiguration() {
        return paymentConfiguration;
    }

    public void setPaymentConfiguration(List<PaymentProvider> paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }
}

