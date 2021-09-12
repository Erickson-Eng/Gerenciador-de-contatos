package com.example.gerenciadorcontatos.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    @NotNull @NotEmpty @NotBlank
    private String street;
    @NotNull @NotEmpty @NotBlank
    private Integer number;
    private String complement;
    @NotNull @NotEmpty @NotBlank
    private String district;
    @NotNull @NotEmpty @NotBlank
    private String cep;
    @NotNull @NotEmpty @NotBlank
    private String city;
    @NotNull @NotEmpty @NotBlank
    @Size(min = 2,  max = 2,
            message = "enter only the federative unit with two letters, example 'PB' for Paraíba")
    private String state;
    @NotNull @NotEmpty @NotBlank
    private Integer id_contact;
}
