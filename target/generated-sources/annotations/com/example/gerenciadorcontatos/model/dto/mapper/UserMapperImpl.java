package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse.UserResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-12T10:58:19-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
public class UserMapperImpl extends UserMapper {

    @Override
    public User toModel(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( request.getEmail() );
        user.setUsername( request.getUsername() );
        user.setUser_pass( request.getUser_pass() );

        return user;
    }

    @Override
    public UserResponse toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( entity.getId() );
        userResponse.email( entity.getEmail() );
        userResponse.username( entity.getUsername() );

        return userResponse.build();
    }
}
