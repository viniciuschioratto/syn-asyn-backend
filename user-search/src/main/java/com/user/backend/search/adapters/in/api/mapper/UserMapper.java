package com.user.backend.search.adapters.in.api.mapper;

import com.user.backend.search.adapters.in.api.dto.UserDto;
import com.user.backend.search.application.core.domain.UserDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto fromUserDomainToUserDto(UserDomain userDomain);
}
