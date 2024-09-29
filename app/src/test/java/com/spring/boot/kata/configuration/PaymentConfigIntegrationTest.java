package com.spring.boot.kata.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

        var providers = paymentConfig.getPaymentConfiguration();
        assertEquals(2, providers.size());

        var appleProvider = providers.stream()
                .filter(p -> p.paymentProvider().equals("Apple"))
                .findFirst().orElseThrow();

        assertTrue(appleProvider.enabled());
        assertEquals(List.of("applePay"), appleProvider.paymentMethod().enable());
        assertEquals(List.of("googlePay"), appleProvider.paymentMethod().disable());
        assertTrue(appleProvider.schedule().retry());

        var samsungProvider = providers.stream()
                .filter(p -> p.paymentProvider().equals("Samsung"))
                .findFirst().orElseThrow();

        assertFalse(samsungProvider.enabled());
        assertEquals(List.of("androidPay"), samsungProvider.paymentMethod().enable());
        assertEquals(List.of("payTm"), samsungProvider.paymentMethod().disable());
        assertFalse(samsungProvider.schedule().retry());
    }
}