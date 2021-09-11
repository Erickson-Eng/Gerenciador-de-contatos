package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;

public class ContactDAO {

    private final EntityManager entityManager = JPAUtil.getEntityManager();

    public void save(Contact obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
}
