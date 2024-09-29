package com.spring.boot.kata.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = PaymentConfig.class)
@EnableConfigurationProperties
public class PaymentConfigIntegrationTest {
    @Autowired
    private PaymentConfig paymentConfig;

    @Test
    void testPaymentConfiguration() {
        assertNotNull(paymentConfig);

        var providers = paymentConfig.getPaymentCountries();
        assertEquals(1, providers.size());

        var indiaPaymentCountry = providers.stream()
                .filter(p -> p.name().equals("India"))
                .findFirst().orElseThrow();

        assertEquals(List.of("ApplePay","PhonePe"), indiaPaymentCountry
                .paymentMethodsEnabled()
                .stream()
                .map(PaymentConfig.PaymentMethodEnabled::name)
                        .collect(Collectors.toList())
                );

        assertTrue(indiaPaymentCountry.schedule().retry());

    }
}