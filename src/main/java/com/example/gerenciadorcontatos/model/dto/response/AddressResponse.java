package com.example.gerenciadorcontatos.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

    private Integer id;
    private String street;
    private Integer number;
    private String complement;
    private String district;
    private String cep;
    private String city;
    private String state;
    private Integer id_contact;

}
