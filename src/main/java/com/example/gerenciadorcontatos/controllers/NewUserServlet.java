package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.UserDAO;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "newUserServlet", value = "/newUser")
public class NewUserServlet extends HttpServlet {

    private final UserDAO userDAO = new UserDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        String email = request.getParameter("Email");
        User obj = new User();
        obj.setEmail(email);
        obj.setUsername(username);
        obj.setUser_pass(password);
        userDAO.save(obj);
        System.out.printf("Username : %s%nPassword: %s%nEmail: %s%n ",obj.getUsername(),obj.getUser_pass(),obj.getEmail());
    }
}
