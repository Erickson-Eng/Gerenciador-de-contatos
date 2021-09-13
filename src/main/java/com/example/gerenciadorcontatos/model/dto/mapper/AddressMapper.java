package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.AddressRequest;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse;
import com.example.gerenciadorcontatos.model.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class );

    @Mapping(source = "request.contactRequest", target = "contact")
    Address toModel(AddressRequest request);

    @Mapping(source = "entity.contact", target = "contactResponse")
    AddressResponse toDTO(Address entity);
}
