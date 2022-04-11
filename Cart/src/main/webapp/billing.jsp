<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="DashBoard.jsp"%>
<html>
<head>
    <title>PaymentPage</title>
    <style>
        div.cont{
            margin-left: 200px;
            padding: 1px 16px;
        }
    </style>
</head>
<body>
<div class="cont">
    <ol>
    <c:forEach items="${items}" var="item">
        <li>${item}</li>
    </c:forEach>
    </ol>
    ${total}
</div>
</body>
</html>
