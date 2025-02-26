package com.user.backend.db.adapters.in.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAddressResponse {
    private Long id;
    private String city;
    private String street;
    private String country;
    private String zipcode;
    private String type;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private UserResponse user;
}
