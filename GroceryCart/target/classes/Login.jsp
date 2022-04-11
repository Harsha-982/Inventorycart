<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body style="text-align: center">
<h1><%= "Login/Sign form" %>
</h1>
<br/>
<form action="Login">
    <label for="user">
    <strong>Username</strong> :<input type="text" name="Username" placeholder="Username" id="user"><br>
    </label>
    <strong>EmailAddress</strong> :<input type="text" name="EmailAddress" placeholder="EmailAddress"><br>

    <strong>Password</strong> : <input type="text" name="Password" placeholder="Password"><br>

    <strong>ReTypePassword</strong> : <input type="text" name="RePassword" placeholder="Password"><br>
    <input type="submit">
</form>
</body>
</html>