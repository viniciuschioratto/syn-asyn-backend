package com.user.backend.db.adapters.out.mapper;

import com.user.backend.db.adapters.out.entity.UserAddressEntity;
import com.user.backend.db.application.core.domain.UserAddressDomain;
import org.mapstruct.Mapper;

/**
 * UserEntityMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserAddressEntityMapper {
    UserAddressEntity fromUserAddressDomainToUserAddressEntity(UserAddressDomain userAddressDomain);
    UserAddressDomain fromUserAddressEntityToUserAddressDomain(UserAddressEntity userAddressEntity);
}
