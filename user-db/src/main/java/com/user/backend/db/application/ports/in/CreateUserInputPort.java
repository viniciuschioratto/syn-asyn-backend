package com.user.backend.db.application.ports.in;

import com.user.backend.db.application.core.domain.UserDomain;

public interface CreateUserInputPort {
    UserDomain createUser(UserDomain userDomain);
}
