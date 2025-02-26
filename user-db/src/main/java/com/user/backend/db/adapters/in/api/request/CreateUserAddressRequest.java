package com.user.backend.db.adapters.in.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserAddressRequest {
    private String city;
    private String street;
    private String country;
    private String zipcode;
    private String type;
}
