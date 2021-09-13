package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.AddressRequest;
import com.example.gerenciadorcontatos.model.dto.request.ContactRequest;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse.AddressResponseBuilder;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse.ContactResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.model.entities.Contact;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toModel(AddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

        address.setContact( contactRequestToContact( request.getContactRequest() ) );
        address.setStreet( request.getStreet() );
        address.setNumber( request.getNumber() );
        address.setComplement( request.getComplement() );
        address.setDistrict( request.getDistrict() );
        address.setCep( request.getCep() );
        address.setCity( request.getCity() );
        address.setState( request.getState() );

        return address;
    }

    @Override
    public AddressResponse toDTO(Address entity) {
        if ( entity == null ) {
            return null;
        }

        AddressResponseBuilder addressResponse = AddressResponse.builder();

        addressResponse.contactResponse( contactToContactResponse( entity.getContact() ) );
        addressResponse.id( entity.getId() );
        addressResponse.street( entity.getStreet() );
        addressResponse.number( entity.getNumber() );
        addressResponse.complement( entity.getComplement() );
        addressResponse.district( entity.getDistrict() );
        addressResponse.cep( entity.getCep() );
        addressResponse.city( entity.getCity() );
        addressResponse.state( entity.getState() );

        return addressResponse.build();
    }

    protected Contact contactRequestToContact(ContactRequest contactRequest) {
        if ( contactRequest == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setNome( contactRequest.getNome() );
        contact.setRg( contactRequest.getRg() );
        contact.setCpf( contactRequest.getCpf() );

        return contact;
    }

    protected ContactResponse contactToContactResponse(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactResponseBuilder contactResponse = ContactResponse.builder();

        contactResponse.id( contact.getId() );
        contactResponse.nome( contact.getNome() );
        contactResponse.rg( contact.getRg() );
        contactResponse.cpf( contact.getCpf() );

        return contactResponse.build();
    }
}
