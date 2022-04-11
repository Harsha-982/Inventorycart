package com.example.GroceryCart;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String Username=request.getParameter("Username");
        String EmailAddress=request.getParameter("EmailAddress");
        String Password= request.getParameter("Password");
        String ConfirmMailpsw=request.getParameter("RePassword");
        PrintWriter aPW=response.getWriter();
        aPW.println("<html><body>");
        if(Username.equals("h") && Password.equals("t") && EmailAddress.endsWith("@gmail.com") && Password.equals(ConfirmMailpsw)){
            HttpSession session= request.getSession();
            session.setAttribute("Username",Username);
            response.sendRedirect("Dashboard.jsp");
        }
        if(!(Password.equals(ConfirmMailpsw))){
            aPW.println("EnteredPassword is Wrong please click on back");
            aPW.println("<a href='Login.jsp'>Back</a>");
            aPW.println("</body></html>");
        }
        else if(Username.equals("") || Username==null || Password==null || Password.equals("")){
            response.sendRedirect("error.jsp");
        }
    }
}
