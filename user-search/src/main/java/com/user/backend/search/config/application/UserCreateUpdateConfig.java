package com.user.backend.search.config.application;

import com.user.backend.search.adapters.out.impl.UserCreateUpdateAdapter;
import com.user.backend.search.application.core.usecase.UserCreateUpdateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserCreateUpdateConfig {

    @Bean
    @Scope("singleton")
    public UserCreateUpdateImpl userCreateUpdateImpl(UserCreateUpdateAdapter userCreateUpdateAdapter) {
        return new UserCreateUpdateImpl(userCreateUpdateAdapter);
    }
}
