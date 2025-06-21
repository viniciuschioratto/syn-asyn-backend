package com.user.backend.search.config.application;

import com.user.backend.search.adapters.out.impl.GetUserByIdAdapter;
import com.user.backend.search.application.core.usecase.GetUserByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GetUserByIdConfig {

    @Bean
    @Scope("singleton")
    public GetUserByIdImpl getUserByIdImpl(GetUserByIdAdapter getUserByIdAdapter) {
        return new GetUserByIdImpl(getUserByIdAdapter);
    }
}
