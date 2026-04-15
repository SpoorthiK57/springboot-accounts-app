package com.practice.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Schema(
        name="Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example="Spoorthi"
    )
    @NotEmpty(message="Name cannot be null or empty")
    @Size(min=1, max=30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer", example="Spoorthi@gmail.com"
    )
    @NotEmpty(message="Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example="9849768092"
    )
    @NotEmpty(message="MobileNumber cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "MobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
