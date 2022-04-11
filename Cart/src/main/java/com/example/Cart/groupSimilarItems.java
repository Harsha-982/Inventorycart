package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class groupSimilarItems extends HttpServlet {
    private Products products=new Products();
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<String> Items =products.retriveItems();

    }
}
