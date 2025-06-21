package com.user.backend.search.adapters.in.api.controller;

import com.user.backend.search.adapters.in.api.dto.UserDto;
import com.user.backend.search.adapters.in.api.mapper.UserMapper;
import com.user.backend.search.application.exceptions.UserNotFoundException;
import com.user.backend.search.application.ports.in.GetUserByIdInputPort;
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

    private final GetUserByIdInputPort getUserByIdInputPort;
    private final UserMapper userMapper;

    public UserApiV1(
            GetUserByIdInputPort getUserByIdInputPort,
            UserMapper userMapper
    ) {
        this.getUserByIdInputPort = getUserByIdInputPort;
        this.userMapper = userMapper;
    }

    @Operation(summary = "Get User by ID")
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Long userId) throws UserNotFoundException {
        log.info("Get user by id: {}", userId);
        UserDto userDto = userMapper.fromUserDomainToUserDto(getUserByIdInputPort.getUserById(userId));

        return ResponseEntity.ok(userDto);
    }
}
