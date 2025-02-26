package com.user.backend.db.application.ports.out;

import com.user.backend.db.application.core.domain.UserDomain;

import java.util.Optional;

public interface ReadUserOutputPort {
    Optional<UserDomain> getUserById(Long userId);
}
