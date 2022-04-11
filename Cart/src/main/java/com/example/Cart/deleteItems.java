package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deleteItems")
public class deleteItems extends HttpServlet {
    private Products products=new Products();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        products.deleteItems(request.getParameter("items"));
        request.setAttribute("items",products.retriveItems());
        request.getRequestDispatcher("/Cart.jsp").forward(request,response);
    }
}
