package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="addToCart",value="/AddToCart")
public class AddToCart extends HttpServlet {
    private Products products=new Products();
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        String items=request.getParameter("items");
        if(items!=null) {
            products.addItems(items);
        }
        request.setAttribute("items", products.retriveItems());
        request.getRequestDispatcher("/Cart.jsp").forward(request, response);
    }
}