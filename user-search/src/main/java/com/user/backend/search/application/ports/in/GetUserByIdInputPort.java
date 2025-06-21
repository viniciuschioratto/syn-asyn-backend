package com.user.backend.search.application.ports.in;

import com.user.backend.search.application.core.domain.UserDomain;
import com.user.backend.search.application.exceptions.UserNotFoundException;

public interface GetUserByIdInputPort {
    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the UserDomain object representing the user, or null if not found
     */
    UserDomain getUserById(Long userId) throws UserNotFoundException;
}
