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
                .filter(p -> p.getPaymentProvider().equals("Apple"))
                .findFirst().orElseThrow();

        assertTrue(appleProvider.isEnabled());
        assertEquals(List.of("applePay"), appleProvider.getPaymentMethod().enable());
        assertEquals(List.of("googlePay"), appleProvider.getPaymentMethod().disable());
        assertTrue(appleProvider.getSchedule().retry());

        var samsungProvider = providers.stream()
                .filter(p -> p.getPaymentProvider().equals("Samsung"))
                .findFirst().orElseThrow();

        assertFalse(samsungProvider.isEnabled());
        assertEquals(List.of("androidPay"), samsungProvider.getPaymentMethod().enable());
        assertEquals(List.of("payTm"), samsungProvider.getPaymentMethod().disable());
        assertFalse(samsungProvider.getSchedule().retry());
    }
}