package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethod {
    CREDITCARD("creditCard"),

    PAYPAL("paypal"),

    BANKTRANSFER("bankTransfer");


    private String value;

    PaymentMethod(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethod fromValue(String text) {
        for (PaymentMethod b : PaymentMethod.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
