package com.example.subscription.controller;

import com.example.subscription.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/subscription-service/api/v1/endpoints/customers
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody Customer body){
        return ResponseEntity.ok("ok");
    }

}
