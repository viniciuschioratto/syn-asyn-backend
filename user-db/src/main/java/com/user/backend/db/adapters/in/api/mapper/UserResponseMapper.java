package com.user.backend.db.adapters.in.api.mapper;

import com.user.backend.db.adapters.in.api.response.UserResponse;
import com.user.backend.db.application.core.domain.UserDomain;
import org.mapstruct.Mapper;

/**
 * UserResponseMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring", uses = {UserAddressResponseMapper.class})
public interface UserResponseMapper {
    UserResponse fromUserDomainToUserResponse(UserDomain userDomain);
    UserDomain fromUserResponseToUserDomain(UserResponse userResponse);
}
