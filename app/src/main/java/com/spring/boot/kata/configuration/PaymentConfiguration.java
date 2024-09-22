package com.spring.boot.kata.configuration;

import java.util.List;

public class PaymentConfiguration {
    private List<PaymentProvider> paymentConfiguration;

    public List<PaymentProvider> getPaymentConfiguration() {
        return paymentConfiguration;
    }

    public void setPaymentConfiguration(List<PaymentProvider> paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }
}

