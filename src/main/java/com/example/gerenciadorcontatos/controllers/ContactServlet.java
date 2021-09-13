package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.ContactDAO;
import com.example.gerenciadorcontatos.model.dao.UserDAO;
import com.example.gerenciadorcontatos.model.dto.response.ContactResponse;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContactListServlet", value = "/contact")
public class ContactServlet extends HttpServlet {

    private final ContactDAO dao = new ContactDAO();
    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        List<ContactResponse> responses = dao.listAll(Integer.parseInt(userId));
        User user = userDAO.findbyId(Integer.parseInt(userId));
        request.setAttribute("user", user);
        request.setAttribute("responses", responses);
        RequestDispatcher rd = request.getRequestDispatcher("/contact.jsp");
        rd.forward(request,response);
    }
}
