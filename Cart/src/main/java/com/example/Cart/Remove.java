package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Remove")
public class Remove extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        String str=request.getParameter("item");
        HttpSession session=request.getSession();
        PrintWriter pw= response.getWriter();
        if(str!=null) {
            session.removeAttribute(str);
        }

        pw.println("<form action='Products.jsp'>");
        pw.println("<input type='submit' value='Add More'>");
        pw.println("</form>");
    }
}
