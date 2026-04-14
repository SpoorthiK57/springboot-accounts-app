package com.practice.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponseDto {
    private String apiPath;
    private String errorMessage;
    private HttpStatus errorCode;
    private LocalDateTime errorTime;

    public ErrorResponseDto(String description, HttpStatus httpStatus, String message, LocalDateTime now) {
        this.apiPath = description;
        this.errorCode = httpStatus;
        this.errorMessage = message;
        this.errorTime = now;
    }
}
