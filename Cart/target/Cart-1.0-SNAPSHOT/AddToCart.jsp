<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.jar.Attributes" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<%
    String item= (String) session.getAttribute("item");

%>
    <form action="Remove">
        <li><label for="item"><%=item%></label>
        <input type="hidden" id="item" name="item" value="<%=item%>">
        <input type="submit" value="Remove"><br><br>
    </form>
<form action="Products.jsp">
    <input type="submit" value="Add More">
</form>
</body>
</html>
