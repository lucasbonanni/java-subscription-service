package com.example.subscription.controller;

import com.example.subscription.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    public ResponseEntity<?> createCustomer(@RequestBody Customer body){
        return ResponseEntity.ok("ok");
    }

}
