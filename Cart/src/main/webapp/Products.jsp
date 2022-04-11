<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="DashBoard.jsp"%>
<head>
    <title>Products</title>
    <style>
        div.cont{
            margin-left: 200px;
            padding: 1px 16px;
        }
    </style>
</head>
<body>
<div class="cont">
    <form action="AddToCart">
        Shoes 599  : <button type="submit" value="Shoes 599"   name="items">Add</button><br><br>
        Sandles 328: <button type="submit" value="Sandles 328" name="items">Add</button><br><br>
        Wedges  759: <button type="submit" value="Wedges 759"  name="items">Add</button><br><br>
    </form>
</div>
</body>
</html>
