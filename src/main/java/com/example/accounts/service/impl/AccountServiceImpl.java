package com.example.accounts.service.impl;

import com.example.accounts.constants.AccountsConstants;
import com.example.accounts.dto.CustomerDto;
import com.example.accounts.entity.Accounts;
import com.example.accounts.entity.Customer;
import com.example.accounts.mapper.CustomerMapper;
import com.example.accounts.repository.AccountsRepository;
import com.example.accounts.repository.CustomerRepository;
import com.example.accounts.service.IAccountsService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AccountServiceImpl implements IAccountsService {

    private CustomerRepository customerRepository;
    private AccountsRepository accountRepository;
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer =customerRepository.save(customer);
        accountRepository.save(createNewAccount(savedCustomer));

    }
    private Accounts createNewAccount(Customer customer){
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        long randomAccNumber = 100000000L + new Random().nextInt(900000000);
        newAccount.setAccountNumber(randomAccNumber);
        return newAccount;

    }
}
