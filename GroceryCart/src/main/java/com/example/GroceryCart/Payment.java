package com.example.GroceryCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/Payment")
public class Payment extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        PrintWriter pw= response.getWriter();
        pw.println("<html><body>");
        pw.println("<form action='OrderPlaced.jsp'>");

        String[] data=request.getParameterValues("details");

        String[] items=request.getParameterValues("items");

        String cVV=request.getParameter("cVV");
        String cardNumber=request.getParameter("cardNumber");
        if(cVV.length()==3 && cardNumber.length()==12){
            request.getRequestDispatcher("process.jsp").include(request,response);
            Reuse re=new Reuse();
            re.reuse(request,response,items);

            pw.println("<input type=submit value=Place Order>");
            pw.println("</form></body></html>");
        }
        else{
            pw.println("Enter valid CVV and valid CardNumber");
        }

    }
}

