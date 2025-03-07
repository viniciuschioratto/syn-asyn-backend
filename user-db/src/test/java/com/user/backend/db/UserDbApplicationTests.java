package com.user.backend.db;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.backend.db.adapters.in.api.request.CreateUserAddressRequest;
import com.user.backend.db.adapters.in.api.request.CreateUserRequest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = UserDbApplication.class
)
@ActiveProfiles("integration-test")
@AutoConfigureMockMvc
@Testcontainers
class UserDbApplicationTests {

	@Autowired
	protected MockMvc mockMvc;

	@Autowired
	protected ObjectMapper objectMapper;

	@Container
	protected static DockerComposeContainer<?> dockerComposeContainer = new DockerComposeContainer<>(new File("./docker-compose-integration-test.yml"));

	@BeforeAll
	static void setupDockerCompose() {
		dockerComposeContainer.start();
	}

	@AfterAll
	static void tearDown() {
		dockerComposeContainer.stop();
	}

	@Test
	void contextLoads() {}

	@DisplayName("Should create a user")
	@Test
	void shouldCreateAUser() throws Exception {
		CreateUserRequest createUserRequest = CreateUserRequest.builder()
				.firstname("Vinicius")
				.lastname("Chioratto")
				.email("test@gamil.com")
				.active(true)
				.birthday(LocalDate.of(1990, 10, 10))
				.addresses(List.of(
						CreateUserAddressRequest.builder()
								.city("Berlin")
								.country("Germany")
								.street("Street 1")
								.zipcode("12345")
								.build())
				)
				.build();

		mockMvc.perform(
						MockMvcRequestBuilders.post("/user/v1")
								.contentType(MediaType.APPLICATION_JSON)
								.content(objectMapper.writeValueAsString(createUserRequest))
				)
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("application/json"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.firstname", Matchers.is("Vinicius")));
	}
}
