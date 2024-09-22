package com.spring.boot.kata.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "payment-configuration")
public class PaymentConfiguration {
    private List<PaymentProviderConfig> paymentProviderConfiguration;

    public List<PaymentProviderConfig> getPaymentConfiguration() {
        return paymentProviderConfiguration;
    }

    public void setPaymentConfiguration(List<PaymentProviderConfig> paymentProviderConfiguration) {
        this.paymentProviderConfiguration = paymentProviderConfiguration;
    }

    public record PaymentProviderConfig(List<String> paymentProvider,
                                        PaymentMethod paymentMethod,
                                        Schedule schedule
    ) {
    }

    public record PaymentMethod(List<String> enableMethods, List<String> disableMethods) {
    }

    public record Schedule(boolean retry) {
    }
}
