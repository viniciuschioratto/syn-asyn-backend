package com.user.backend.db;

import org.springframework.boot.SpringApplication;

public class TestUserDbApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserDbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
