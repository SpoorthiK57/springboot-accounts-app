package com.practice.loans.service.impl;

import com.practice.loans.constants.LoansConstants;
import com.practice.loans.dto.LoansDto;
import com.practice.loans.entity.Loans;
import com.practice.loans.exception.LoanAlreadyExistsException;
import com.practice.loans.exception.ResourceNotFoundException;
import com.practice.loans.mapper.LoansMapper;
import com.practice.loans.repository.LoansRepository;
import com.practice.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {
    private LoansRepository loansRepository;

    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> OptionalLoan = loansRepository.findByMobileNumber(mobileNumber);
        if(OptionalLoan.isPresent())
        {
            throw new LoanAlreadyExistsException("Loan already exists with this mobile number"+ mobileNumber);

        }
        loansRepository.save(createNewLoan(mobileNumber));
    }

    private Loans createNewLoan(String mobileNumber) {
        Loans newLoan = new Loans();
        long randomLoanNumber=100000000L + new Random().nextInt(900000000);
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return newLoan;

    }

    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan","mobileNumber", mobileNumber));
        LoansDto loansDto = LoansMapper.mapToLoansDto(loans, new LoansDto());
        return loansDto;
    }

    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByLoanNumber(loansDto.getLoanNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "loanNumber", loansDto.getLoanNumber()));
        LoansMapper.mapToLoans(loansDto, loans);
        if (loans.getAmountPaid() > loans.getTotalLoan()) {
            return false;
        }
        int outstandingAmount = loans.getTotalLoan() - loans.getAmountPaid();
        loans.setOutstandingAmount(outstandingAmount);
        loansRepository.save(loans);
        return true;
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan","mobileNumber", mobileNumber));
        loansRepository.delete(loans);

        return true;
    }
}
