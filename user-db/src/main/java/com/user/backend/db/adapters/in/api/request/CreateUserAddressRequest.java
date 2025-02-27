package com.user.backend.db.adapters.in.api.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserAddressRequest {
    @NotEmpty
    private String city;

    @NotEmpty
    private String street;

    @NotEmpty
    private String country;

    @NotEmpty
    private String zipcode;

    @NotEmpty
    private String type;
}
