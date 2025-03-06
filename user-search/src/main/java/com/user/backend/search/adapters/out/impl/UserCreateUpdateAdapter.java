package com.user.backend.search.adapters.out.impl;

import com.user.backend.search.adapters.out.elasticsearch.repository.UserEsRepository;
import com.user.backend.search.adapters.out.mapper.UserElasticsearchMapper;
import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.ports.out.UserCreateUpdateOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreateUpdateAdapter implements UserCreateUpdateOutputPort {

    private final UserEsRepository userEsRepository;
    private final UserElasticsearchMapper userElasticsearchMapper;

    public UserCreateUpdateAdapter(
            UserEsRepository userEsRepository,
            UserElasticsearchMapper userElasticsearchMapper
    ) {
        this.userEsRepository = userEsRepository;
        this.userElasticsearchMapper = userElasticsearchMapper;
    }

    @Override
    public void createUpdateUser(UserDomain userDomain) {
        log.info("Creating/Updating user: {}", userDomain);
        userEsRepository.save(userElasticsearchMapper.fromDomainToEntity(userDomain));
    }
}
