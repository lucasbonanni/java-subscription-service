package com.example.subscription.controller;

import com.example.subscription.model.Subscription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController()
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getSubscription(@PathVariable UUID id){
        UUID empty = new UUID(0L, 0L);
        if (id.equals(empty) ){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    //TODO: change the param `body` and replace for Dto
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSubscription(@PathVariable UUID id, @RequestBody Subscription body){
        UUID empty = new UUID(0L, 0L);
        if (id.equals(empty) ){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    //TODO: change the param `body` and replace for Dto
    @PostMapping()
    public ResponseEntity<?> postSubscription(@RequestBody Subscription id){

        return ResponseEntity.ok().build();
    }
}
