package com.user.backend.search.adapters.in.consumers.mapper;

import com.user.backend.search.adapters.in.consumers.payload.UserDbPayload;
import com.user.backend.search.application.core.domain.UserDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * UserConsumerMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserConsumerMapper {

    @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "created_at", ignore = true)
    @Mapping(target = "updated_at", ignore = true)
    UserDomain fromUserDbPayloadToUserDomain(UserDbPayload userDbPayload);
}
