package com.spring.boot.kata.configuration;

import lombok.Data;

import java.util.List;

@Data
public class PaymentProvider {
    private String paymentProvider;
    private boolean enabled;
    private PaymentMethod paymentMethod;
    private Schedule schedule;

    public record PaymentMethod(List<String> enable, List<String> disable) {
    }
    public record Schedule(boolean retry) {
    }
}
