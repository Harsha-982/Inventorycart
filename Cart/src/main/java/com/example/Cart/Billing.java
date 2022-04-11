package com.example.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "billing",value="/Billing")
public class Billing extends HttpServlet {
    private Products products=new Products();

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList items=products.retriveItems();
        float total=0.0f;
        for(int i=0;i<items.size();i++) {
            int positionOfPound = items.get(i).toString().indexOf(" ") + 1;
            String numberStr = items.get(i).toString().substring(positionOfPound);
            float price = Float.parseFloat(numberStr);
            total= total + price;
        }
        request.setAttribute("total",total);
        request.setAttribute("items", items);
        request.getRequestDispatcher("/billing.jsp").forward(request,response);
    }
}
