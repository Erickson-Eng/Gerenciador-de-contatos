package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.entities.User;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;

public class UserDAO {

    private final EntityManager entityManager = JPAUtil.getEntityManager();
    public void save(User obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
}
