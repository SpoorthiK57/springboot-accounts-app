package com.practice.accounts.mapper;

import com.practice.accounts.dto.CustomerDto;
import com.practice.accounts.entity.Customer;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto){
        customerDto.setEmail(customerDto.getEmail());
        customerDto.setName(customerDto.getName());
        customerDto.setMobileNumber(String.valueOf(customerDto.getMobileNumber()));
        return customerDto;
    }
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer){
        customer.setEmail(customerDto.getEmail());
        customer.setName(customerDto.getName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
