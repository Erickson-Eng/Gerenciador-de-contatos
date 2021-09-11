package com.example.gerenciadorcontatos.model.dao;

import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AddressDAO {

    private final EntityManager entityManager = JPAUtil.getEntityManager();

    public void save(Address obj){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    public Address findById(Integer id){
        return this.entityManager.find(Address.class,id);
    }

    public List<Address> findAll(){
        String consult = "from Address";
        TypedQuery<Address> query = entityManager.createQuery(consult, Address.class);
        query.setMaxResults(10);
        List<Address> addressList = query.getResultList();
        return query.getResultList();
    }

}
