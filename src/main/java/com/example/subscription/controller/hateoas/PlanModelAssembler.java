package com.example.subscription.controller.hateoas;

import com.example.subscription.controller.PlanController;
import com.example.subscription.model.Plan;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class PlanModelAssembler implements RepresentationModelAssembler<Plan, EntityModel<Plan>> {

    @Override
    public EntityModel<Plan> toModel(Plan plan) {
        return EntityModel.of(plan,
                linkTo(methodOn(PlanController.class).GetAll()).withRel("plans"),
                linkTo(PlanController.class).slash(plan.planId).withSelfRel()
                );
    }


}

