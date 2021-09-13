package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper( ContactMapper.class );

    @Mapping(source = "request.userRequest", target = "user")
    Contact toModel(ContactRequest request);

    @Mapping(source = "entity.user", target = "userResponse")
    ContactResponse toDTO(Contact entity);
}
