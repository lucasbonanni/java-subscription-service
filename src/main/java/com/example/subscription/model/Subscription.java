package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;


/**
 * SubscriptionInput
 */
@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {
  @JsonProperty("customer_id")
  public UUID customerId = null;

  @JsonProperty("plan_id")
  public String planId = null;

  @JsonProperty("billing_cycle")
  public String billingCycle = null;

  @JsonProperty("payment_method")
  public String paymentMethod = null;
}
