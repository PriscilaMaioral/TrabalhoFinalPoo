<%-- 
    Document   : cadastrofilme
    Created on : Dec 10, 2017, 5:03:06 AM
    Author     : LuizV1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Filme</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="WEB-INF/headerlogado.jspf"%>
    <center>
        <div class="col-sm-5" align="center" style="background-color:lavender; border-radius: 25px; margin: 30px;">
         <b>Nome do filme</b> <br>
         <input type="text" name="nmfilme"><br>
         <b>Nota do filme </b> <br>
         <input type="number" step="0.1"min="0" max="5" name="ntFilme"><br>
         <b>Genero do filme </b> <br>
         <select name="generos">
            <option value="terror">terror</option>
         </select><br>
         <b>Ator Principal</b><br>
         <select name="atores">
             <option value="caio castro">caio castro</option>
         </select><br>
         <input type="submit" style="margin: 10px;">
         </div>
    </center>    
    </body>
</html>
