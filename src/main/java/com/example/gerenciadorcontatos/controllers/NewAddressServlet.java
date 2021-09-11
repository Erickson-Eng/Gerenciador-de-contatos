package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.AddressDAO;
import com.example.gerenciadorcontatos.model.entities.Address;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewAddressServlet", value = "/NewAddress")
public class NewAddressServlet extends HttpServlet {
    @Inject
    private AddressDAO addressDAO;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Address obj = new Address();
        obj.setStreet(request.getParameter("street"));
        obj.setNumber(Integer.parseInt(request.getParameter("number")));
        obj.setComplement(request.getParameter("complement"));
        obj.setDistrict(request.getParameter("district"));
        obj.setCep(request.getParameter("cep"));
        obj.setCity(request.getParameter("city"));
        obj.setState(request.getParameter("state"));
        addressDAO.save(obj);
        System.out.println(obj);

    }
}
