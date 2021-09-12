package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.dao.exceptions.ObjectNotFound;
import com.example.gerenciadorcontatos.model.entities.User;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO {

    private final EntityManager entityManager = JPAUtil.getEntityManager();
    private String consult;

    public void save(User obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
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
            throw new ObjectNotFound("Usuario não encontrado");
        }
    }

    public List<User> findAll(){
        String consult = "from User";
        TypedQuery<User> query = entityManager.createQuery(consult, User.class);
        query.setMaxResults(10);
        List<User> users = query.getResultList();
        return query.getResultList();
    }

    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        User user = dao.authorizeAccess("asdasdasd@gmail.com","1234");
        System.out.println(user);
    }
}

