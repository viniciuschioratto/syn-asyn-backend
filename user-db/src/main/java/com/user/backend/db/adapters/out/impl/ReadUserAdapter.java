package com.user.backend.db.adapters.out.impl;

import com.user.backend.db.adapters.out.mapper.UserEntityMapper;
import com.user.backend.db.adapters.out.repository.UserRepository;
import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.ports.out.ReadUserOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class ReadUserAdapter implements ReadUserOutputPort {
    private final UserRepository userRepository;
    private final UserEntityMapper userMapper;

    public ReadUserAdapter(UserRepository userRepository, UserEntityMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Optional<UserDomain> getUserById(Long userId) {
        log.info("Getting user by id: {}", userId);
        return userRepository.findById(userId).map(userMapper::fromUserEntityToUserDomain);
    }
}
