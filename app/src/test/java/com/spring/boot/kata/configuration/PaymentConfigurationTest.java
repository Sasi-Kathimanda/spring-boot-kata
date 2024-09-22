package com.spring.boot.kata.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class PaymentConfigurationTest {
    @Autowired
    PaymentConfiguration paymentConfiguration;

    @Test
    void givenTestDataPaymentConfigurationInitialisedSuccessfully() {
        List<PaymentConfiguration.PaymentProviderConfig> providers = paymentConfiguration.getPaymentConfiguration();
        assertEquals(2, providers.size());

    }

}