package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * PlansPlanIdBody
 */
@Validated
public class PlansPlanIdBody   {

  @JsonProperty("plan_id")
  public UUID planId = null;
  @JsonProperty("name")
  public String name = null;

  @JsonProperty("description")
  public String description = null;

  @JsonProperty("price")
  public BigDecimal price = null;

  @JsonProperty("billingCycle")
  public BillingCycle billingCycle = null;



}
