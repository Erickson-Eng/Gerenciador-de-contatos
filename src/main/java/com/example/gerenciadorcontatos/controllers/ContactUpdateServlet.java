package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.ContactDAO;
import com.example.gerenciadorcontatos.model.entities.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewContactServlet", value = "/updateContact")
public class ContactUpdateServlet extends HttpServlet {

    private final ContactDAO contactDAO = new ContactDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        Contact obj = new Contact();
        obj.setNome(name);
        obj.setCpf(cpf);
        obj.setRg(Integer.parseInt(rg));
        contactDAO.save(obj);
        System.out.printf("Name: %s%nRG: %d%nCPF: %s%n", obj.getNome(), obj.getRg(),obj.getCpf());
    }
}
