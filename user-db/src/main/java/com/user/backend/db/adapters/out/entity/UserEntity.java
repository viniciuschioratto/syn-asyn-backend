package com.user.backend.db.adapters.out.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    private Long id;

    private String firstname;

    private String lastname;

    private LocalDate birthday;

    private String email;

    private boolean active;

    @Column(updatable = false)
    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAddressEntity> addresses = new ArrayList<>();

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
