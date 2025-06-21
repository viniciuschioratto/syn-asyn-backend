package com.user.backend.search.adapters.out.impl;

import com.user.backend.search.adapters.out.elasticsearch.entity.UserEntity;
import com.user.backend.search.adapters.out.elasticsearch.repository.UserEsRepository;
import com.user.backend.search.adapters.out.mapper.UserElasticsearchMapper;
import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.exceptions.UserNotFoundException;
import com.user.backend.search.application.ports.out.GetUserByIdOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GetUserByIdAdapter implements GetUserByIdOutputPort {
    private final UserEsRepository userEsRepository;
    private final UserElasticsearchMapper userElasticsearchMapper;

    public GetUserByIdAdapter(
            UserEsRepository userEsRepository,
            UserElasticsearchMapper userElasticsearchMapper
    ) {
        this.userEsRepository = userEsRepository;
        this.userElasticsearchMapper = userElasticsearchMapper;
    }

    @Override
    public UserDomain getUserById(Long userId) throws UserNotFoundException {
        UserEntity userEntity = userEsRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

        return userElasticsearchMapper.fromEntityToDomain(userEntity);
    }
}
