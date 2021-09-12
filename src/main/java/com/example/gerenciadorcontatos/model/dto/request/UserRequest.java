package com.example.gerenciadorcontatos.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @Email
    private String email;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 4, max = 25, message = "the username must contain at least 4 letters")
    private String username;
    @NotNull @NotEmpty @Size(min = 6, max = 8, message = "password must be between 6 and 8 characters")
    private String user_pass;
}
