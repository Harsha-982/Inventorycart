package com.example.GroceryCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

        PrintWriter pw = response.getWriter();
//        request.getRequestDispatcher("Include.jsp").include(request,response);

        HttpSession session=request.getSession();
        if(session.getAttribute("Username")==null){
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
        pw.println( "<html><head><title>Shopping Basket" + "</title></head><body>" );

        pw.println( "<form action='Cart' METHOD=GET>" );

        pw.println( "Add to Basket:<BR><BR>" );

        pw.println( "<input type='checkbox' name='items' VALUE='Mango  $10.0'>Mango  $10<br>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Apple  $30.0'>Apples  $30<BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Orange $6.0'>Orange  $6<BR>" );

        pw.println( "<input TYPE='checkbox' name='items' VALUE='Banana  $3.0'>Banana  $3<BR>" );


        String items[] = request.getParameterValues( "items" );

        if ( items != null ) {

            for ( int i=0; i < items.length; i++ ) {

                pw.println( "<input type='hidden' name='items' value='" + items[i] + "'>" );

            }
        }

        pw.println( "<br><input type=submit value='View Cart'>" );
    }
}
