package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.AddressDAO;
import com.example.gerenciadorcontatos.model.dao.ContactDAO;
import com.example.gerenciadorcontatos.model.dao.UserDAO;
import com.example.gerenciadorcontatos.model.entities.Address;
import com.example.gerenciadorcontatos.model.entities.Contact;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FormContatoServlet", value = {"/FormContatoServlet"})
public class FormContatoServlet extends HttpServlet {

    private final ContactDAO contactDAO = new ContactDAO();
    private final AddressDAO addressDAO = new AddressDAO();
    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String userId = request.getParameter("userId");
        int i = Integer.parseInt(userId);
        User user = userDAO.findbyId(i);
        System.out.println(user);
        Address obj = new Address();
        Contact contactRequest = new Contact();

//        contato
        contactRequest.setNome(request.getParameter("name"));
        contactRequest.setCpf(request.getParameter("cpf"));
        contactRequest.setRg(Integer.parseInt(request.getParameter("rg")));
        //endereco
        obj.setStreet(request.getParameter("street"));
        obj.setNumber(Integer.parseInt(request.getParameter("number")));
        obj.setComplement(request.getParameter("complement"));
        obj.setDistrict(request.getParameter("district"));
        obj.setCep(request.getParameter("cep"));
        obj.setCity(request.getParameter("city"));
        obj.setState(request.getParameter("state"));
        obj.setContact(contactRequest);
        contactRequest.setUser(user);
        contactDAO.save(contactRequest);
        addressDAO.save(obj);
        response.sendRedirect("/gerenciador/contact?userId="+userId);
    }
}
