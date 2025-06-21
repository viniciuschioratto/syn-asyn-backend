package com.user.backend.search.adapters.in.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String email;
    private boolean active;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    //private List<UserAddressDomain> addresses;
}
