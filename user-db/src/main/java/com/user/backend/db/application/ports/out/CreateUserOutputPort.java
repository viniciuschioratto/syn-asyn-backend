package com.user.backend.db.application.ports.out;

import com.user.backend.db.application.core.domain.UserDomain;

public interface CreateUserOutputPort {
    UserDomain createUser(UserDomain userDomain);
}
