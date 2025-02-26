package com.user.backend.db.adapters.in.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String email;
    private boolean active;
    private List<CreateUserAddressRequest> addresses;
}
