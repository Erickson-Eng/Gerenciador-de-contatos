package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse.UserResponseBuilder;
import com.example.gerenciadorcontatos.model.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class UserMapperImpl implements UserMapper {

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
