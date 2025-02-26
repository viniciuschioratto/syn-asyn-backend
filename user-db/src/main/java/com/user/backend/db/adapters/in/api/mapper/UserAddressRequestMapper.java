package com.user.backend.db.adapters.in.api.mapper;

import com.user.backend.db.adapters.in.api.request.CreateUserAddressRequest;
import com.user.backend.db.application.core.domain.UserAddressDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * UserAddressRequestMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserAddressRequestMapper {

    @Mapping(target = "created_at", ignore = true)
    @Mapping(target = "updated_at", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    UserAddressDomain fromUserAddressRequestToUserAddressDomain(CreateUserAddressRequest userAddressRequest);
}
