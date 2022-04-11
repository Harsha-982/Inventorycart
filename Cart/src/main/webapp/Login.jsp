<html>
<head>
    <title>Login Page</title>
    <style>
        body{
            margin : 150px 100px 150px 80px;
        }
        table{
            border: 3px solid red;
        }
    </style>
<body>
<form method="post" action="Login">
    <table width="20%"  align="center">

        <tr>
            <td colspan=2><center><font size=5><b>Login/Sign In</b><br><br></font></center></td>
        </tr>

        <tr>
            <td>Username:</td>
            <td><input type="text" size='25px' name="userid"></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><input type="Password" size="25px" name="pwd"></td>
        </tr>

        <tr>
            <td><input type="submit" onclick="return check(this.form)" value="Login"></td>
        </tr>

    </table>
</form>
<script language="javascript">
    function check(form)
    {

        if(form.userid.value=="" || form.pwd.value=="" )
        {
            alert("Username or Password has not entered")
            return false;
        }
        else
        {
            return true;
        }
    }
</script>

</body>
</html>