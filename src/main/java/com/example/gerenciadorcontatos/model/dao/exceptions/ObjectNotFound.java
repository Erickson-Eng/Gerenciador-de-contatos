package com.example.gerenciadorcontatos.model.dao.exceptions;

public class ObjectNotFound extends RuntimeException{

    public ObjectNotFound(String message) {
        super(message);
    }
}
