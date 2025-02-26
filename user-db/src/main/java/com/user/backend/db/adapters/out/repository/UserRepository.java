package com.user.backend.db.adapters.out.repository;

import com.user.backend.db.adapters.out.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for UserEntity
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {}
