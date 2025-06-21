package com.user.backend.search.application.core.usecase;

import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.exceptions.UserNotFoundException;
import com.user.backend.search.application.ports.in.GetUserByIdInputPort;
import com.user.backend.search.application.ports.out.GetUserByIdOutputPort;

import java.util.logging.Logger;

public class GetUserByIdImpl implements GetUserByIdInputPort {
    private final Logger logger = Logger.getLogger(GetUserByIdImpl.class.getName());

    private final GetUserByIdOutputPort getUserByIdOutputPort;

    public GetUserByIdImpl(GetUserByIdOutputPort getUserByIdOutputPort) {
        this.getUserByIdOutputPort = getUserByIdOutputPort;
    }

    @Override
    public UserDomain getUserById(Long userId) throws UserNotFoundException {
        return getUserByIdOutputPort.getUserById(userId);
    }
}
