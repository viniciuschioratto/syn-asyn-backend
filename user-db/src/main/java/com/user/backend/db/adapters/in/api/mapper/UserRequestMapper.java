package com.user.backend.db.adapters.in.api.mapper;

import com.user.backend.db.adapters.in.api.request.CreateUserRequest;
import com.user.backend.db.application.core.domain.UserDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * UserRequestMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring", uses = {UserAddressRequestMapper.class})
public interface UserRequestMapper {

    @Mapping(target = "created_at", ignore = true)
    @Mapping(target = "updated_at", ignore = true)
    @Mapping(target = "id", ignore = true)
    UserDomain fromUserResponseToUserDomain(CreateUserRequest userRequest);
}
