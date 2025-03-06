package com.user.backend.search.application.core.domain;

import java.time.LocalDateTime;

public class UserAddressDomain {
    private final Long id;
    private final String city;
    private final String street;
    private final String country;
    private final String zipcode;
    private final String type;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;
    private final UserDomain user;

    public UserAddressDomain(Builder builder) {
        this.id = builder.id;
        this.city = builder.city;
        this.street = builder.street;
        this.country = builder.country;
        this.zipcode = builder.zipcode;
        this.type = builder.type;
        this.created_at = builder.created_at;
        this.updated_at = builder.updated_at;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public UserDomain getUser() {
        return user;
    }

    public static class Builder {
        private Long id;
        private String city;
        private String street;
        private String country;
        private String zipcode;
        private String type;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;
        private UserDomain user;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setZipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCreated_at(LocalDateTime created_at) {
            this.created_at = created_at;
            return this;
        }

        public Builder setUpdated_at(LocalDateTime updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Builder setUser(UserDomain user) {
            this.user = user;
            return this;
        }

        public UserAddressDomain build() {
            return new UserAddressDomain(this);
        }
    }
}
