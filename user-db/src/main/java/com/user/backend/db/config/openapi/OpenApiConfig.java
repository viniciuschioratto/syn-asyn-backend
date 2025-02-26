package com.user.backend.db.config.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User database API")
                        .description("API to expose resources from User.")
                        .contact(new Contact()
                                .email("viniciusmchioratto@gmail.com")
                                .name("Vinicius Chioratto")
                        )
                );
    }
}
