package com.user.backend.search.application.ports.out;

import com.user.backend.search.application.core.domain.UserDomain;

public interface UserCreateUpdateOutputPort {
    void createUpdateUser(UserDomain userDomain);
}
