package de.mlnj.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "AccountsDto", description = "Details of the account")
public class AccountsDto {

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})")
    private Long accountNumber;

    @NotEmpty
    private String accountType;

    @NotEmpty
    private String branchAddress;
}
