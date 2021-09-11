package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewAddressServlet", value = "/NewAddress")
public class NewAddressServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager entityManager = JPAUtil.getEntityManager();
        Address obj = new Address();
        obj.setStreet(request.getParameter("street"));
        obj.setNumber(Integer.parseInt(request.getParameter("number")));
        obj.setComplement(request.getParameter("complement"));
        obj.setDistrict(request.getParameter("district"));
        obj.setCep(request.getParameter("cep"));
        obj.setCity(request.getParameter("city"));
        obj.setState(request.getParameter("state"));

        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(obj);

    }
}
