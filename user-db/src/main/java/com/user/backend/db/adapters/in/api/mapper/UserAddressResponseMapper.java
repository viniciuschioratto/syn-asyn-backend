package com.user.backend.db.adapters.in.api.mapper;

import com.user.backend.db.adapters.in.api.response.UserAddressResponse;
import com.user.backend.db.application.core.domain.UserAddressDomain;
import org.mapstruct.Mapper;

/**
 * UserAddressResponseMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserAddressResponseMapper {
    UserAddressResponse fromUserAddressDomainToUserAddressResponse(UserAddressDomain userAddressDomain);
    UserAddressDomain fromUserAddressResponseToUserAddressDomain(UserAddressResponse userAddressResponse);
}
