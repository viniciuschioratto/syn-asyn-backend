package com.user.backend.search.adapters.in.consumers.mapper;

import com.user.backend.search.adapters.in.consumers.payload.UserAddressPayload;
import com.user.backend.search.application.core.domain.UserAddressDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * UserAddressConsumerMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserAddressConsumerMapper {

    @Mapping(target = "user", ignore = true)
    UserAddressDomain fromUserAddressPayloadToUserAddressDomain(UserAddressPayload userAddressPayload);
}
