package com.example.gerenciadorcontatos.model.dao;


import com.example.gerenciadorcontatos.model.dto.mapper.ContactMapper;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.resources.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ContactDAO {

    private ContactMapper mapper;
    private final EntityManager entityManager = JPAUtil.getEntityManager();

    public void save(Contact obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }
    public List<ContactResponse> listAll(Integer id){
        String consult = "select c from Contact c where c.user.id = :id";
        TypedQuery<Contact> query = entityManager
                .createQuery(consult, Contact.class)
                .setParameter("id",id)
                .setMaxResults(20);
        List<Contact> contactList = query.getResultList();
        return contactList.stream().map(mapper.INSTANCE::toDTO).collect(Collectors.toList());
    }
}
