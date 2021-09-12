package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.dao.exceptions.DataIntegrityViolationException;
import com.example.gerenciadorcontatos.model.dao.exceptions.ObjectNotFound;
import com.example.gerenciadorcontatos.model.dto.mapper.UserMapper;
import com.example.gerenciadorcontatos.model.dto.request.UserRequest;
import com.example.gerenciadorcontatos.model.entities.User;
import com.example.gerenciadorcontatos.resources.JPAUtil;


import javax.persistence.EntityManager;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {

    private UserMapper userMapper;

    private final EntityManager entityManager = JPAUtil.getEntityManager();



    public void save(UserRequest obj)  {
        User entity = userMapper.INSTANCE.toModel(obj);
        try{
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(entity);
            this.entityManager.getTransaction().commit();
        }catch (PersistenceException e){
            throw new DataIntegrityViolationException("Email ou Username already registered");
        }

    }


    public User authorizeAccess(String email, String user_pass){
        String consult = "select u from User u where u.email= :email and u.user_pass= :user_pass";
        try {
            TypedQuery<User> query =
                    entityManager.createQuery(consult,User.class)
                            .setParameter("email",email)
                            .setParameter("user_pass", user_pass);
            return query.getSingleResult();
        } catch (NoResultException e){
            throw new ObjectNotFound("User does not exist or incorrect data");
        }
    }

    public List<User> findAll(){
        String consult = "from User";
        TypedQuery<User> query = entityManager.createQuery(consult, User.class);
        query.setMaxResults(10);
        List<User> users = query.getResultList();
        return query.getResultList();
    }
}

