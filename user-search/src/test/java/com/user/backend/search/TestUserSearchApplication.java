package com.user.backend.search;

import org.springframework.boot.SpringApplication;

public class TestUserSearchApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserSearchApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
