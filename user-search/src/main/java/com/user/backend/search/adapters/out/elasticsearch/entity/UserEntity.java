package com.user.backend.search.adapters.out.elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "user")
public class UserEntity {
    @Id
    private Long id;

    @Field(type = FieldType.Text)
    private String firstname;

    @Field(type = FieldType.Text)
    private String lastname;

    @Field(type = FieldType.Date)
    private LocalDate birthday;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Boolean)
    private boolean active;

    @Field(type = FieldType.Date)
    private LocalDateTime created_at;

    @Field(type = FieldType.Date)
    private LocalDateTime updated_at;
}
