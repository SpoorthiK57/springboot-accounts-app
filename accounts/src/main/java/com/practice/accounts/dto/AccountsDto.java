package com.practice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name="Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account number of the bank"
    )
    @NotNull(message="AccountNumber cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the bank account", example="savings"
    )
    @NotEmpty(message="AccountType cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Bank account branch address"
    )
    @NotEmpty(message="BranchAddress cannot be null or empty")
    private String branchAddress;
}
