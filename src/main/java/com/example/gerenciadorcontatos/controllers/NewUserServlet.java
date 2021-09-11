package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.entities.Email;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("web-project");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        String email = request.getParameter("Email");
        User obj = new User();
        Email objEmail = new Email();
        obj.setUsername(username);
        obj.setPassword(password);
        objEmail.setAddress(email);
        obj.setEmail(objEmail);
        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.printf("Username : %s%nPassword: %s%nEmail: %s%n ",obj.getUsername(),obj.getPassword(),objEmail.getAddress());
    }
}
