package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.entities.Email;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

        String name = request.getParameter("name");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        System.out.printf("Name: %s%nRG: %s%nCPF: %s%n", name, rg,cpf);
    }
}
