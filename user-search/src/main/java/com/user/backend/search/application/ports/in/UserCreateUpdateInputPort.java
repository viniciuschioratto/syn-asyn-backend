package com.user.backend.search.application.ports.in;

import com.user.backend.search.application.core.domain.UserDomain;

public interface UserCreateUpdateInputPort {
    void createUpdateUser(UserDomain userDomain);
}
