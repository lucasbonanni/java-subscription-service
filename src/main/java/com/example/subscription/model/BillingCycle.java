package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BillingCycle {
    MONTHLY("monthly"),

    YEARLY("yearly");

    private String value;

    BillingCycle(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static BillingCycle fromValue(String text) {
        for (BillingCycle b : BillingCycle.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
