package com.user.backend.db.application.core.usecase;

import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.core.exceptions.UserNotFoundException;
import com.user.backend.db.application.ports.in.ReadUserInputPort;
import com.user.backend.db.application.ports.out.ReadUserOutputPort;

import java.util.logging.Logger;

public class ReadUserImpl implements ReadUserInputPort {
    private static final Logger logger = Logger.getLogger(ReadUserImpl.class.getName());
    private final ReadUserOutputPort readUserOutputPort;

    public ReadUserImpl(ReadUserOutputPort readUserOutputPort) {
        this.readUserOutputPort = readUserOutputPort;
    }

    @Override
    public UserDomain getUserById(Long userId) throws UserNotFoundException {
        return readUserOutputPort.getUserById(userId)
                .orElseThrow(() -> {
                    logger.warning("User not found with id: " + userId);
                    return new UserNotFoundException("User not found with id: " + userId);
                });
    }

}
