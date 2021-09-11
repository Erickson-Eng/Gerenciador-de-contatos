package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.AddressDAO;
import com.example.gerenciadorcontatos.model.entities.Address;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "addressList", value = "/addressList")
public class AddressListServlet extends HttpServlet {

    private final AddressDAO addressDAO = new AddressDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Address> addressList = addressDAO.findAll();
        System.out.println(addressList);
        req.setAttribute("addressList", addressList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/addressList.jsp");
        requestDispatcher.forward(req, resp);
    }

}
