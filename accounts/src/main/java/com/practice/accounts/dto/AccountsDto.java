package com.practice.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotNull(message="AccountNumber cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;


    @NotEmpty(message="AccountType cannot be null or empty")
    private String accountType;

    @NotEmpty(message="BranchAddress cannot be null or empty")
    private String branchAddress;
}
