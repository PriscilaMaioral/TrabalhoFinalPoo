<%-- 
    Document   : listafilmes
    Created on : 14/12/2017, 02:34:09
    Author     : Danilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de filmes</title>
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
          <div class="col-sm-8" align="center" style="background-color:white; border-radius: 20px; margin: 30px;">
             <table class="table">
               <thead class="thead-dark">
                   <tr>
                      <th>Nome do Filme</th>
                      <th>Nota</th>
                      <th>descrição</th>
                   </tr>
              </thead>
              <tbody>
                   <tr>
                       <td>Pocaroupa</td>
                       <td>69</td>
                       <td>o pai de pouca roupa não quer deixar ela dar</td>
                  </tr>
                  <tr>
                       <td>O gay leão</td>
                       <td>24</td>
                       <td>pq oq eu quero mais é ser gay</td>
                  </tr>
               </tbody>
             </table> 
          </div>
        </center>
    </body>
</html>
