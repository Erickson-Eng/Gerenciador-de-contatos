package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewContactServlet", value = "/newContact")
public class NewContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager entityManager = JPAUtil.getEntityManager();
        String name = request.getParameter("name");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        Contact obj = new Contact();
        obj.setNome(name);
        obj.setCpf(cpf);
        obj.setRg(Integer.parseInt(rg));

        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.printf("Name: %s%nRG: %d%nCPF: %s%n", obj.getNome(), obj.getRg(),obj.getCpf());
    }
}
