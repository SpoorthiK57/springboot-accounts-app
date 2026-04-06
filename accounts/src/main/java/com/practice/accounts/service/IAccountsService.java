package com.practice.accounts.service;

import com.practice.accounts.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestParam;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input mobile number
     * @return Account details based on the given mobile number
     */
    CustomerDto fetchAccount(@RequestParam String mobileNumber);
}
