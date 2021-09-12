package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class ContactMapper {

    public abstract Contact toModel(ContactRequest request);

    @Mapping(source = "entity.user.id", target = "id_user")
    public abstract ContactResponse toDTO(Contact entity);
}
