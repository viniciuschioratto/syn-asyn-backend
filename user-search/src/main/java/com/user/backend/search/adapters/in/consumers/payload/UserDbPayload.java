package com.user.backend.search.adapters.in.consumers.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDbPayload {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String email;
    private boolean active;
    //private LocalDateTime created_at;
    //private LocalDateTime updated_at;
}
