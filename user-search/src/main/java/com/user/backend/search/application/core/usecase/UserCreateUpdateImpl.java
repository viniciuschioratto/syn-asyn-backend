package com.user.backend.search.application.core.usecase;

import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.ports.in.UserCreateUpdateInputPort;
import com.user.backend.search.application.ports.out.UserCreateUpdateOutputPort;

import java.util.logging.Logger;

public class UserCreateUpdateImpl implements UserCreateUpdateInputPort {
    private final Logger logger = Logger.getLogger(UserCreateUpdateImpl.class.getName());

    private final UserCreateUpdateOutputPort userCreateUpdateOutputPort;

    public UserCreateUpdateImpl(UserCreateUpdateOutputPort userCreateUpdateOutputPort) {
        this.userCreateUpdateOutputPort = userCreateUpdateOutputPort;
    }

    @Override
    public void createUpdateUser(UserDomain userDomain) {
        logger.info("Start process to Create or Update user: " + userDomain.toString());
        userCreateUpdateOutputPort.createUpdateUser(userDomain);
        logger.info("Finished process to Create or Update user: " + userDomain);
    }
}
