<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DashBaord</title>
    <style>
        body {
            font-family: "Lato", sans-serif;
        }

        .sidenav {
            height: 100%;
            width: 200px;
            position: fixed;
            z-index: 1;
            top: 0;
            background-color: #111;
            padding-top: 20px;
        }
        .sidenav a:hover {
            color: #f1f1f1;
        }

    </style>
</head>
<body>
<%
    String Username= (String) session.getAttribute("Username");
%>
<div class="sidenav">
    <a href="Account.jsp">Account</a><br><br>
    <a href="Products.jsp">Products</a><br><br>
    <a href="AddToCart">Cart</a><br><br>
</div>
</body>
</html>
