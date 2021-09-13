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


@WebServlet("/newContact")
public class ContactCreatedServlet extends HttpServlet {

    private final ContactDAO contactDAO = new ContactDAO();
    private final AddressDAO addressDAO = new AddressDAO();
    private final UserDAO userDAO = new UserDAO();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("userId");
        User user = userDAO.findbyId(Integer.parseInt(id));
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/newContact.jsp");
        rd.forward(request,response);
    }
}
