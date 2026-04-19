package com.practice.loans.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class LoansDto {

    private String mobileNumber;
    private String loanType;
    private int totalLoan;
    private String loanNumber;
    private int amountPaid;
    private int outstandingAmount;

}
