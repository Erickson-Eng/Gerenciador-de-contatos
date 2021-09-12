package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.AddressRequest;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse;
import com.example.gerenciadorcontatos.model.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class AddressMapper {

    public abstract Address toModel(AddressRequest request);

    @Mapping(source = "entity.contact.id", target = "id_contact")
    public abstract AddressResponse toDTO(Address entity);
}
