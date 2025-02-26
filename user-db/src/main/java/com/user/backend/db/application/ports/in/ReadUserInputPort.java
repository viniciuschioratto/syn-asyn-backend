package com.user.backend.db.application.ports.in;

import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.core.exceptions.UserNotFoundException;

public interface ReadUserInputPort {
    UserDomain getUserById(Long userId) throws UserNotFoundException;
}
