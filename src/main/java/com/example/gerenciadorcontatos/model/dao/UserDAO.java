package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.entities.User;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {

    private final EntityManager entityManager = JPAUtil.getEntityManager();

    public void save(User obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }


    public List<User> findAll(){
        String consult = "from User";
        TypedQuery<User> query = entityManager.createQuery(consult, User.class);
        query.setMaxResults(10);
        List<User> users = query.getResultList();
        return query.getResultList();
    }

}

