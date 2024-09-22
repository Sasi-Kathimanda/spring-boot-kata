package com.spring.boot.kata.configuration;

import java.util.List;

import java.util.List;

public class PaymentMethod {
    private List<String> enable;
    private List<String> disable;

    public List<String> getEnable() {
        return enable;
    }

    public void setEnable(List<String> enable) {
        this.enable = enable;
    }

    public List<String> getDisable() {
        return disable;
    }

    public void setDisable(List<String> disable) {
        this.disable = disable;
    }
}

