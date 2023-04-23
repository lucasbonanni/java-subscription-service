package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

/**
 * CustomerInput
 */
@Validated
public class Customer {
  @JsonProperty("customer_id")
  public UUID customerId = null;
  @JsonProperty("name")
  public String name = null;

  @JsonProperty("email")
  public String email = null;

  @JsonProperty("paymentMethod")
  public PaymentMethod paymentMethod = null;

  @JsonProperty("billingAddress")
  public Address billingAddress = null;

}
