package com.practice.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class LoansDto {

    private String mobileNumber;

    @NotEmpty(message="LoanType cannot be null or empty")
    private String loanType;
    private int totalLoan;

    @NotNull(message="LoanNumber cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private String loanNumber;
    private int amountPaid;
    private int outstandingAmount;

}
