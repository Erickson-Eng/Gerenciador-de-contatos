package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper()
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User toModel(UserRequest request);

    UserResponse toDTO(User entity);
}
