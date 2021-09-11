package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.entities.User;
import com.example.gerenciadorcontatos.resources.JPAUtil;

import javax.persistence.EntityManager;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "newUserServlet", value = "/newUser")
public class NewUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManager entityManager = JPAUtil.getEntityManager();

        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        String email = request.getParameter("Email");
        User obj = new User();
        obj.setEmail(email);
        obj.setUsername(username);
        obj.setPassword(password);
        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.close();


        System.out.printf("Username : %s%nPassword: %s%nEmail: %s%n ",obj.getUsername(),obj.getPassword(),obj.getEmail());
    }
}
