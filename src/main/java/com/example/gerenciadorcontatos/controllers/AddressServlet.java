package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.AddressDAO;
import com.example.gerenciadorcontatos.model.entities.Address;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaEnderecoServlet", value = "/address")
public class AddressServlet extends HttpServlet {

    private AddressDAO dao = new AddressDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        List<Address> addressList = dao.findAll();
        request.setAttribute("lista", addressList);
        RequestDispatcher rd =
                request.getRequestDispatcher("/addressList.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }
}
