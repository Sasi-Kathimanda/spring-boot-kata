package com.spring.boot.kata.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PaymentConfigIntegrationTest {

    @Autowired
    private PaymentConfig paymentConfig;

    @Test
    void testPaymentConfiguration() {
        assertNotNull(paymentConfig);

        var providers = paymentConfig.getPaymentConfiguration();
        //FIX ME:
        assertNull(providers);
//        assertEquals(2, providers.size());

//        var appleProvider = providers.stream()
//                .filter(p -> p.getPaymentProvider().equals("Apple"))
//                .findFirst().orElseThrow();
//
//        assertTrue(appleProvider.isEnabled());
//        assertEquals(List.of("applePay"), appleProvider.getPaymentMethods().getEnable());
//        assertEquals(List.of("googlePay"), appleProvider.getPaymentMethods().getDisable());
//        assertEquals(List.of("PhonePe"), appleProvider.getPaymentMethodTypeDisable());
//        assertTrue(appleProvider.getSchedule().isRetry());
//
//        var samsungProvider = providers.stream()
//                .filter(p -> p.getPaymentProvider().equals("Samsung"))
//                .findFirst().orElseThrow();
//
//        assertTrue(samsungProvider.isEnabled());
//        assertEquals(List.of("androidPay"), samsungProvider.getPaymentMethods().getEnable());
//        assertEquals(List.of("payTm"), samsungProvider.getPaymentMethods().getDisable());
//        assertFalse(samsungProvider.getSchedule().isRetry());
    }
}