package com.user.backend.search.adapters.in.consumers.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDbPayload {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private boolean active;
}
