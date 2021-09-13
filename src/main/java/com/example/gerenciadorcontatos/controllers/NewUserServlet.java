package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.UserDAO;
import com.example.gerenciadorcontatos.model.dto.request.UserRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/userForm")
public class NewUserServlet extends HttpServlet {

    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserRequest obj = new UserRequest();
        obj.setEmail(request.getParameter("email"));
        obj.setUsername(request.getParameter("username"));
        obj.setUser_pass(request.getParameter("password"));
        userDAO.save(obj);
        response.sendRedirect("index.jsp");
    }
}
