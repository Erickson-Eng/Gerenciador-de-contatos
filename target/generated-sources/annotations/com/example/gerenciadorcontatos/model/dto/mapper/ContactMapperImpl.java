package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse.ContactResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.model.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class ContactMapperImpl implements ContactMapper {

    @Override
    public Contact toModel(ContactRequest request) {
        if ( request == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setNome( request.getNome() );
        contact.setRg( request.getRg() );
        contact.setCpf( request.getCpf() );

        return contact;
    }

    @Override
    public ContactResponse toDTO(Contact entity) {
        if ( entity == null ) {
            return null;
        }

        ContactResponseBuilder contactResponse = ContactResponse.builder();

        contactResponse.id_user( entityUserId( entity ) );
        contactResponse.id( entity.getId() );
        contactResponse.nome( entity.getNome() );
        contactResponse.rg( entity.getRg() );
        contactResponse.cpf( entity.getCpf() );

        return contactResponse.build();
    }

    private Integer entityUserId(Contact contact) {
        if ( contact == null ) {
            return null;
        }
        User user = contact.getUser();
        if ( user == null ) {
            return null;
        }
        Integer id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
