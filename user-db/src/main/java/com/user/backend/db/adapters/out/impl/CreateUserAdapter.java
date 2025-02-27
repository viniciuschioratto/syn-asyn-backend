package com.user.backend.db.adapters.out.impl;

import com.user.backend.db.adapters.out.entity.UserEntity;
import com.user.backend.db.adapters.out.mapper.UserAddressEntityMapper;
import com.user.backend.db.adapters.out.mapper.UserEntityMapper;
import com.user.backend.db.adapters.out.repository.UserAddressRepository;
import com.user.backend.db.adapters.out.repository.UserRepository;
import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.ports.out.CreateUserOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Optional;

@Slf4j
@Component
public class CreateUserAdapter implements CreateUserOutputPort {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    private final UserAddressRepository userAddressRepository;

    public CreateUserAdapter(
            UserRepository userRepository,
            UserEntityMapper userEntityMapper,
            UserAddressRepository userAddressRepository
    ) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
        this.userAddressRepository = userAddressRepository;
    }

    @Override
    @Transactional(rollbackFor = {SQLException.class})
    public UserDomain createUser(UserDomain userDomain) {
        UserEntity userEntity = userEntityMapper.fromUserDomainToUserEntity(userDomain);
        UserEntity newUserEntity = userRepository.save(userEntity);

        return userEntityMapper.fromUserEntityToUserDomain(newUserEntity);
    }
}
