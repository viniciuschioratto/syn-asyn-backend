package com.user.backend.db.adapters.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "user_address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAddressEntity {
    @Id
    private Long id;

    private String city;

    private String street;

    private String country;

    private String zipcode;

    private String type;

    @Column(updatable = false)
    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;

    @PrePersist
    protected void onInsert() {
        created_at = LocalDateTime.now();
        updated_at = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated_at = LocalDateTime.now();
    }
}
