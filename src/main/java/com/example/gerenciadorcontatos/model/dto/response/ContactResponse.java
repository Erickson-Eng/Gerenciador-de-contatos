package com.example.gerenciadorcontatos.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactResponse {

    private Integer id;
    private String nome;
    private Integer rg;
    private String cpf;
    private UserResponse userResponse;
}
