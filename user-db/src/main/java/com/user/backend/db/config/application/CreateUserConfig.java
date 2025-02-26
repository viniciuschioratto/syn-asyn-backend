package com.user.backend.db.config.application;

import com.user.backend.db.adapters.out.impl.CreateUserAdapter;
import com.user.backend.db.application.core.usecase.CreateUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CreateUserConfig {

    @Bean
    @Scope("singleton")
    public CreateUserImpl createUserImpl(CreateUserAdapter createUserAdapter) {
        return new CreateUserImpl(createUserAdapter);
    }
}
