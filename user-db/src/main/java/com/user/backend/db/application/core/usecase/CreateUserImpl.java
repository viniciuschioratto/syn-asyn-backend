package com.user.backend.db.application.core.usecase;

import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.ports.in.CreateUserInputPort;
import com.user.backend.db.application.ports.out.CreateUserOutputPort;

import java.util.logging.Logger;

public class CreateUserImpl implements CreateUserInputPort {
    private final Logger logger = Logger.getLogger(CreateUserImpl.class.getName());

    private final CreateUserOutputPort createUserOutputPort;

    public CreateUserImpl(CreateUserOutputPort createUserOutputPort) {
        this.createUserOutputPort = createUserOutputPort;
    }

    @Override
    public UserDomain createUser(UserDomain userDomain) {
        logger.info("Creating user...");
        return createUserOutputPort.createUser(userDomain);
    }
}
