package com.user.backend.search.adapters.in.consumers.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAddressPayload {
    private Long id;
    private String city;
    private String street;
    private String country;
    private String zipcode;
    private String type;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
