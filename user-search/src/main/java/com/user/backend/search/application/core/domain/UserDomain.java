package com.user.backend.search.application.core.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class UserDomain {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final LocalDate birthday;
    private final String email;
    private final boolean active;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;
    private final List<UserAddressDomain> addresses;

    public UserDomain(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.birthday = builder.birthday;
        this.email = builder.email;
        this.active = builder.active;
        this.created_at = builder.created_at;
        this.updated_at = builder.updated_at;
        this.addresses = builder.addresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public List<UserAddressDomain> getAddresses() {
        return addresses;
    }

    public static class Builder {
        private Long id;
        private String firstname;
        private String lastname;
        private LocalDate birthday;
        private String email;
        private boolean active;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;
        private List<UserAddressDomain> addresses;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder created_at(LocalDateTime created_at) {
            this.created_at = created_at;
            return this;
        }

        public Builder updated_at(LocalDateTime updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Builder addresses(List<UserAddressDomain> addresses) {
            this.addresses = addresses;
            return this;
        }

        public UserDomain build() {
            return new UserDomain(this);
        }
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", addresses=" + addresses +
                '}';
    }
}
