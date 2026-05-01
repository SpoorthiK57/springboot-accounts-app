package com.practice.loans.dto;

import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@Data
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

}
