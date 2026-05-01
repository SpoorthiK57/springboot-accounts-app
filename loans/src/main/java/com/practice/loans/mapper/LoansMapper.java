package com.practice.loans.mapper;

import com.practice.loans.dto.LoansDto;
import com.practice.loans.entity.Loans;

public class LoansMapper {
    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto) {
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        return loansDto;
    }
    public static Loans mapToLoans(LoansDto loansDto, Loans loans) {
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setLoanType(loansDto.getLoanType());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());

        return loans;
    }
}
