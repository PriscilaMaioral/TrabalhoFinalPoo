<%-- 
    Document   : loginusuario
    Created on : 14/12/2017, 01:49:01
    Author     : Danilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </head>
    <body>
    <%@include file="WEB-INF/header.jspf"%>
    <center>
        <div class="col-sm-5" align="center" style="background-color:lavender; border-radius: 25px; margin: 30px;">
            <h2>Login de usuario</h2>
        <form>
            <b>E-mail</b> <br>
            <input type="email" name="email"><br>
            <b> Senha </b> <br>
            <input type="password" name="pass"><br>
            <input type="submit" style="margin: 10px;">
        </form>
        </div> 
    </center>
    </body>
</html>
