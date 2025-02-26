package com.user.backend.db.adapters.out.mapper;

import com.user.backend.db.adapters.out.entity.UserEntity;
import com.user.backend.db.application.core.domain.UserDomain;
import org.mapstruct.Mapper;

/**
 * UserEntityMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring", uses = {UserAddressEntityMapper.class})
public interface UserEntityMapper {
    UserEntity fromUserDomainToUserEntity(UserDomain userDomain);
    UserDomain fromUserEntityToUserDomain(UserEntity userEntity);
}
