package com.example.subscription.controller;

import com.example.subscription.controller.hateoas.PlanModelAssembler;
import com.example.subscription.model.Plan;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/plans")
public class PlanController {
    @Autowired
    private PlanModelAssembler assembler;
    @ApiResponse(responseCode = "200", description = "Request succeded")
    @ApiResponse(responseCode = "400", description = "Request error")
    @ApiResponse(responseCode = "404", description = "Resource not found")
    @Operation(summary = "Get all the available plans", description = "Get all the available plans")
    @GetMapping(produces = { "application/hal+json" })
    public ResponseEntity<?> GetAll(){
        var list = new ArrayList<Plan>();
        var plan1 = new Plan();
        plan1.planId =UUID.randomUUID();
        var plan2 = new Plan();
        plan2.planId =UUID.randomUUID();
        list.add(plan1);
        list.add(plan2);
        return ResponseEntity.ok(assembler.toCollectionModel(list));
    }

    @GetMapping(value = "/{id}", name = "GetById")
    public ResponseEntity<?> GetById(@RequestParam UUID id){
        return ResponseEntity.ok("Get by id");
    }


    @PutMapping("/{id}")
    public ResponseEntity<Plan> Update(@RequestParam UUID id, @RequestBody Plan body){
        return ResponseEntity.ok(new Plan());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> Delete(@RequestParam UUID id){
        return  ResponseEntity.ok("Delete");
    }

}
