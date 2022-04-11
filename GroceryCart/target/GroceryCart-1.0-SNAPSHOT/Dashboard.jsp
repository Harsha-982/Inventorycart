<%@ page import="java.io.PrintWriter" %>

<%@include file="Include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
You have Logged in Succesfully!...<br>
<%
    PrintWriter pw=response.getWriter();
    if(session.getAttribute("Username")==null){
        request.getRequestDispatcher("Login.jsp").forward(request,response);
    }
%>
<br>
<a href="Account.jsp">Your Account</a><br>
<a href="AddToCart">Products</a>

</body>
</html>
