package com.example.gerenciadorcontatos.model.dto.mapper;

import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.entities.User;
import org.mapstruct.Mapper;

@Mapper
public abstract class UserMapper {

    public abstract User toModel(UserRequest request);

    public abstract UserResponse toDTO(User entity);
}
