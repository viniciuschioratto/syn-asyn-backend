package com.user.backend.search.application.ports.out;

import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.exceptions.UserNotFoundException;

public interface GetUserByIdOutputPort {
    UserDomain getUserById(Long userId) throws UserNotFoundException;
}
