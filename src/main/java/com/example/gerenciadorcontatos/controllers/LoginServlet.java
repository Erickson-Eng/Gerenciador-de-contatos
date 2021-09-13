package com.example.gerenciadorcontatos.controllers;

import com.example.gerenciadorcontatos.model.dao.UserDAO;
import com.example.gerenciadorcontatos.model.dao.exceptions.ObjectNotFound;
import com.example.gerenciadorcontatos.model.dto.response.UserResponse;
import com.example.gerenciadorcontatos.model.entities.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private final UserDAO dao = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            UserResponse user = dao.authorizeAccess(email, password);
            if (user != null) {
                response.sendRedirect("/gerenciador/contact?userId="+user.getId());
            }
        } catch (ObjectNotFound e){
            response.sendRedirect("/gerenciador/index.jsp");
        }


    }
}
