<%@include file="Include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="AddressDetails" class="com.example.GroceryCart.Address" scope="application"/>
<jsp:useBean id="CardDetails" class="com.example.GroceryCart.CardDetails" scope="application"/>
<jsp:setProperty name="AddressDetails" property="*"></jsp:setProperty>
<jsp:setProperty name="CardDetails" property="*"></jsp:setProperty>

<body>
<h3>Sent to</h3>
<jsp:getProperty property="name"  name="AddressDetails"/><br>
<jsp:getProperty property="d_no" name="AddressDetails"/><br>
<jsp:getProperty property="home_Town" name="AddressDetails" /><br>
<jsp:getProperty property="street" name="AddressDetails"/><br>

</body>
</html>



