package com.user.backend.db.adapters.in.api.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest implements Serializable {
    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @NotEmpty
    private LocalDate birthday;

    @NotEmpty
    private String email;

    @NotEmpty
    private boolean active;

    @NotNull
    private List<CreateUserAddressRequest> addresses;
}
