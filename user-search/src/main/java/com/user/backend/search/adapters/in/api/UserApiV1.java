package com.user.backend.search.adapters.in.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user-search/v1")
@Tag(name = "User Search API V1", description = "This API exposes resources about User Search")
public class UserApiV1 {

    @Operation(summary = "Get User by ID")
    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserById(@PathVariable("userId") String userId) {
        log.info("Get user by id: {}", userId);
        return ResponseEntity.ok("User with id: " + userId);
    }
}
