package de.mlnj.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "ResponseDto", description = "Details of the response")
public class ResponseDto {

    private String statusCode;

    private String statusMessage;
}
