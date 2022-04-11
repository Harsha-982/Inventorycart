<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="DashBoard.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cart</title>
        <style>
            div.display{
                margin-left: 200px;
                padding: 1px 16px;
            }
        </style>
</head>
<body>
<div class="display">
    Your Items
    <ol>
    <c:forEach items="${items}" var="item">
        <li>
            ${item} <a href="/deleteItems?items=${item}">Delete</a>
            <br><br>
            <a href="visitList">Add to visit later</a>
        </li>
    </c:forEach>
    </ol>
    <a href="/Billing">Proceed to pay</a>
</div>
<a href="Products.jsp">Add More</a>
</body>
</html>
