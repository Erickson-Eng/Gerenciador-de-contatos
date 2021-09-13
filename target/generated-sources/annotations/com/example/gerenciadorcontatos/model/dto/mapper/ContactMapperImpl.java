package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse.ContactResponseBuilder;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse.UserResponseBuilder;
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

        contact.setUser( userRequestToUser( request.getUserRequest() ) );
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

        contactResponse.userResponse( userToUserResponse( entity.getUser() ) );
        contactResponse.id( entity.getId() );
        contactResponse.nome( entity.getNome() );
        contactResponse.rg( entity.getRg() );
        contactResponse.cpf( entity.getCpf() );

        return contactResponse.build();
    }

    protected User userRequestToUser(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( userRequest.getEmail() );
        user.setUsername( userRequest.getUsername() );
        user.setUser_pass( userRequest.getUser_pass() );

        return user;
    }

    protected UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.email( user.getEmail() );
        userResponse.username( user.getUsername() );

        return userResponse.build();
    }
}
