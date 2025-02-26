package com.user.backend.db.adapters.in.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String email;
    private boolean active;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private List<UserAddressResponse> address;
}
