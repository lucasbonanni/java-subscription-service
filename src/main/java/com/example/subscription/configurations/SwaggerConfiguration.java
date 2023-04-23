package com.example.subscription.configurations;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Subscription service",
                description = "A service to manage multiple subscriptions",
                license = @License(
                name = "LGPL Licence",
                url = "https://github.com/thombergs/code-examples/blob/master/LICENSE")
        ),
        servers = @Server(url = "https://localhost:8080/subscription-service/api/v1/endpoints")
)
public class SwaggerConfiguration {
}
