package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.AddressRequest;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse;
import com.example.gerenciadorcontatos.model.dto.response.AddressResponse.AddressResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.model.entities.Contact;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-12T10:58:19-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
public class AddressMapperImpl extends AddressMapper {

    @Override
    public Address toModel(AddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

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

        addressResponse.id_contact( entityContactId( entity ) );
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

    private Integer entityContactId(Address address) {
        if ( address == null ) {
            return null;
        }
        Contact contact = address.getContact();
        if ( contact == null ) {
            return null;
        }
        Integer id = contact.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
