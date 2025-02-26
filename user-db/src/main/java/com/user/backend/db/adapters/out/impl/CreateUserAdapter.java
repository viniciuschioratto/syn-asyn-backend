package com.user.backend.db.adapters.out.impl;

import com.user.backend.db.adapters.out.entity.UserEntity;
import com.user.backend.db.adapters.out.mapper.UserEntityMapper;
import com.user.backend.db.adapters.out.repository.UserRepository;
import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.ports.out.CreateUserOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CreateUserAdapter implements CreateUserOutputPort {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public CreateUserAdapter(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public UserDomain createUser(UserDomain userDomain) {
        UserEntity userEntity = userRepository.save(userEntityMapper.fromUserDomainToUserEntity(userDomain));
        return userEntityMapper.fromUserEntityToUserDomain(userEntity);
    }
}
