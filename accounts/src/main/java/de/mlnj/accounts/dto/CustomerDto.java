package de.mlnj.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CustomerDto", description = "Details of the customer")
public class CustomerDto {
    @NotEmpty(message = "Name cannot be a null or empty")
    @Size(min = 5, max = 30, message = "The length of name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email address cannot be a null or empty")
    @Email
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
