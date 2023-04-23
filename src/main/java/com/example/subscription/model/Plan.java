package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * PlanInput
 */
@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class Plan {

  public UUID planId = null;

  @JsonProperty("name")
  public String name = null;

  @JsonProperty("description")
  public String description = null;

  @JsonProperty("price")
  public BigDecimal price = null;

  /**
   * Gets or Sets billingCycle
   */
  @JsonProperty("billingCycle")
  public BillingCycle billingCycle = null;

}
