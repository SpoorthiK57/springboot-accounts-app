package com.practice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name="errorResponse",
        description="Schema to hold error response information"
)
public class ErrorResponseDto {
    @Schema(
            description="api path invoked by the client"
    )
    private String apiPath;
    @Schema(
            description="error message representing the error happened"
    )
    private String errorMessage;
    @Schema(
            description="error code representing the error happened"
    )
    private HttpStatus errorCode;
    @Schema(
            description="Time representing when the error happened"
    )
    private LocalDateTime errorTime;

    public ErrorResponseDto(String description, HttpStatus httpStatus, String message, LocalDateTime now) {
        this.apiPath = description;
        this.errorCode = httpStatus;
        this.errorMessage = message;
        this.errorTime = now;
    }
}
