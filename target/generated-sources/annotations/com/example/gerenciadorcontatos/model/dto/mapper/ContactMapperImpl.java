package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse.ContactResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.model.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-12T10:58:19-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
public class ContactMapperImpl extends ContactMapper {

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
