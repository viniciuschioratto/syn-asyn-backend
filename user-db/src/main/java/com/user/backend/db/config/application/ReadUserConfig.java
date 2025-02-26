package com.user.backend.db.config.application;

import com.user.backend.db.adapters.out.impl.ReadUserAdapter;
import com.user.backend.db.application.core.usecase.ReadUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ReadUserConfig {

    @Bean
    @Scope(value = "singleton")
    public ReadUserImpl readUserImpl(ReadUserAdapter readUserAdapter) {
        return new ReadUserImpl(readUserAdapter);
    }
}
