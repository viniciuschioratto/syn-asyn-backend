package com.user.backend.db.adapters.in.api;

import com.user.backend.db.adapters.in.api.mapper.UserResponseMapper;
import com.user.backend.db.adapters.in.api.response.ExceptionResponse;
import com.user.backend.db.adapters.in.api.response.UserResponse;
import com.user.backend.db.application.core.domain.UserDomain;
import com.user.backend.db.application.core.exceptions.UserNotFoundException;
import com.user.backend.db.application.ports.in.ReadUserInputPort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user/v1")
@Tag(name = "User API V1", description = "This API exposes resources about User")
public class UserApiV1 {

    private final ReadUserInputPort readUserInputPort;
    private final UserResponseMapper userResponseMapper;

    public UserApiV1(ReadUserInputPort readUserInputPort, UserResponseMapper userResponseMapper) {
        this.readUserInputPort = readUserInputPort;
        this.userResponseMapper = userResponseMapper;
    }

    @Operation(summary = "Get User by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User returned successfully", content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserResponse.class)
                    )
            }),
            @ApiResponse(responseCode = "400", description = "Bad request - Error to return user", content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ExceptionResponse.class)
                    )
            }),
            @ApiResponse(responseCode = "500", description = "Internal error - The server faced issues to resolve the request", content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ExceptionResponse.class)
                    )
            }),
    })
    @GetMapping("{userId}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable("userId") Long userId) throws UserNotFoundException {
        UserDomain userDomain = readUserInputPort.getUserById(userId);
        return ResponseEntity.ok(userResponseMapper.fromUserDomainToUserResponse(userDomain));
    }
}
