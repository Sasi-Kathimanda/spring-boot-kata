package com.spring.boot.kata.configuration;

import java.util.List;

import java.util.List;

public class PaymentProvider {
    private String paymentProvider;
    private boolean enabled;
    private PaymentMethod paymentMethods;
    private List<String> paymentMethodTypeDisable;
    private Schedule schedule;

    public String getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public PaymentMethod getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethod paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<String> getPaymentMethodTypeDisable() {
        return paymentMethodTypeDisable;
    }

    public void setPaymentMethodTypeDisable(List<String> paymentMethodTypeDisable) {
        this.paymentMethodTypeDisable = paymentMethodTypeDisable;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
