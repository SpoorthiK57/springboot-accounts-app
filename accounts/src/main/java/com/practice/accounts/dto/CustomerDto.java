package com.practice.accounts.dto;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class CustomerDto {
    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;
}
