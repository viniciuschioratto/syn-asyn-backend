package com.user.backend.search.adapters.out.elasticsearch.repository;

import com.user.backend.search.adapters.out.elasticsearch.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {}
