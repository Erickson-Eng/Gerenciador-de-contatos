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
        String consult = "select a from Address a where a.id = :id";
        TypedQuery<Address> query = entityManager.createQuery(consult, Address.class)
                .setParameter("id", id);
        return query.getSingleResult();
    }

    public List<Address> findAll(){
        String consult = "from Address";
        TypedQuery<Address> query = entityManager.createQuery(consult, Address.class);
        query.setMaxResults(10);
        query.setFirstResult(0);
        List<Address> addressList = query.getResultList();
        return query.getResultList();
    }

    public static void main(String[] args) {
        AddressDAO dao = new AddressDAO();

        System.out.println(dao.findById(1));
    }
}
