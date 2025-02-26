package com.user.backend.db.adapters.out.repository;

import com.user.backend.db.adapters.out.entity.UserAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for UserAddressEntity
 */
public interface UserAddressRepository extends JpaRepository<UserAddressEntity, Long> {}
