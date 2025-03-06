package com.user.backend.search.adapters.out.mapper;

import com.user.backend.search.adapters.out.elasticsearch.entity.UserEntity;
import com.user.backend.search.application.core.domain.UserDomain;
import org.mapstruct.Mapper;

/**
 * UserElasticsearchMapper interface
 * <p>
 * This interface is used to create the Mapping implementation by MapStruct.
 */
@Mapper(componentModel = "spring")
public interface UserElasticsearchMapper {

    UserEntity fromDomainToEntity(UserDomain userDomain);
}
