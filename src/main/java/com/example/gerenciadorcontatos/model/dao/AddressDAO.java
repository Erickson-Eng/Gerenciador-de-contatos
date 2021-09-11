package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;

public class AddressBean {

    private final EntityManager entityManager = JPAUtil.getEntityManager();

    public void save(Address obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
}
