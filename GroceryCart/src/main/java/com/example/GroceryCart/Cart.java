package com.example.GroceryCart;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/Cart")
public class Cart extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        String[] items = request.getParameterValues("items");

        String newItems1 = request.getParameter("newItems");

        pw.println("<html><body>");
        Object[] s;

        if (items == null) {

            pw.println("No items in cart yet");
        }

        else if (items != null && newItems1 != null) {

            s =  Arrays.stream(items).filter(i -> !(i.equals(newItems1))).toArray();

            String[] new_S = new String[s.length];
            System.arraycopy(s, 0, new_S, 0, s.length);
            Reuse re=new Reuse();
            re.reuse(request,response,new_S);
        }


        else if (items != null && newItems1 == null) {
            Reuse re=new Reuse();
            re.reuse(request,response,items);
        }
        pw.println("<form action='AddToCart' >");
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                pw.println("<input type=hidden name='items' value='" + items[i] + "'>");
            }
        }
        pw.println("<br><input type=submit value='Add more items'>");
        pw.println("</form></body></html>");

        pw.println("<form action='Payment.jsp'>");
        s =  Arrays.stream(items).filter(item -> !(item.equals(newItems1))).toArray();
        for (int i = 0; i < s.length; i++) {

            pw.println("<input type=hidden name='items' value='" + s[i] + "'>");

        }
        pw.println("<br><input type='submit' value='Proceed to Buy'>");
        pw.println("</form>");


    }
}
