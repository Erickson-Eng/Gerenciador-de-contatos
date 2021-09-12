package com.example.gerenciadorcontatos.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactRequest {

    @NotNull @Size(min= 2)
    private String nome;
    @NotEmpty
    @Size(min = 7, max = 7, message = "the rg has 7 algorithms")
    private Integer rg;
    @CPF @NotEmpty
    private String cpf;
    @NotNull
    @NotEmpty
    @NotBlank
    private Integer id_user;
}
