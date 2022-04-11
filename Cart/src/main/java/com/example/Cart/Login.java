package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="login", value="/Login")
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username=request.getParameter("userid");
        String Password=request.getParameter("pwd");
        if(Username.equals("Harshavardhini") & Password.equals("H")){
            HttpSession session=request.getSession();
            session.setAttribute("Username", Username);
            request.getRequestDispatcher("DashBoard.jsp").forward(request,response);
        }
        else{
            response.sendRedirect("error.jsp");
        }
    }
}
