package com.example.subscription.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

/**
 * Address
 */
@Data
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class Address   {

  @JsonProperty("adress_id")
  public UUID adressId = null;
  @JsonProperty("street")
  public String street = null;

  @JsonProperty("city")
  public String city = null;

  @JsonProperty("state")
  public String state = null;

  @JsonProperty("postalCode")
  public String postalCode = null;

  @JsonProperty("country")
  public String country = null;

}
