package com.example.GroceryCart;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Reuse extends HttpServlet {
    public void reuse(HttpServletRequest request, HttpServletResponse response, String[] items) throws IOException {
        ArrayList newItems=new ArrayList();
        PrintWriter pw= response.getWriter();
        float count=0f;
        int aTimes[]=new int[items.length];

        for (int i = 0; i < items.length; i++) {
            newItems.add(items[i]);
            int positionOfPound = items[i].indexOf("$") + 1;
            pw.println(positionOfPound);
            String numberStr = items[i].substring(positionOfPound);
            pw.println(numberStr);
            float price = Float.parseFloat(numberStr);
            pw.println(price);
            count = count + price;
        }
        for (int i = 0; i < items.length; i++) {
            aTimes[i] = 1;
        }
        int c = 0;
        for (int i = 0; i < newItems.size(); i++) {
            for (int j = i + 1; j < newItems.size(); j++) {
                if (newItems.get(i).equals(newItems.get(j))) {
                    newItems.remove(j);
                    j = j - 1;
                    aTimes[i]++;
                }
            }
        }
        pw.println("<ul>");
        for (int i = 0; i < newItems.size(); i++) {
            pw.println("<form action='Cart'>");
            pw.println("<li>" + newItems.get(i) + "(" + aTimes[i] + ")" + "<input type=hidden name='newItems' value='" + newItems.get(i) + "'>");
            if (items != null) {
                for (int j = 0; j < items.length; j++) {
                    pw.println("<input type=hidden name='items' value='" + items[j] + "'>");
                }
            }
            pw.println("<input type='submit' value='Remove'></form>");
            pw.println("<br>");
        }
        pw.println("<br><br>SubTotal(" + items.length + "): $" + count);


    }
}
