<%@page import="com.domain.web.Atores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.domain.web.Filmes"%>
<%@page import="com.domain.web.Avaliacao"%>

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
    <body style="background:url(img/BANN1.jpg);">
          <!--<%@include file="WEB-INF/header.jspf"%>-->
        <center>
        <div class="container-fluid" style="margin-top: 10%;">
          <div class="col-md-8 col-sm-12 col-xs-12" align="center" style="background-color:white; border-radius: 20px;">
             <table class="table">
               <thead class="thead-dark">
                   
                   <tr>
                      <th></th>
                      <th>Genero</th>
                      <th>Duração</th>
                      <th>Lançamento</th>
                      <th>Diretor</th>
                      <th>Nota</th>
                   </tr>
              </thead>
              <tbody>
                  
                  <%try{%>
                  <% for(Filmes f : Filmes.listarTodosFilmes()){%>
                   <tr>
                       <td><%=f.getNm_filme()%></td>
                       <td><%=f.getDs_genero()%></td>
                       <td><%=f.getQt_duracao()%></td>
                       <td><%=f.getDt_lancamento()%></td>
                       <td><%=f.getNm_diretor()%></td>
                       <td><%=f.getNr_avaliacao()%></td>
                  </tr>
                  
                  <%}%>
                  <%}catch(Exception ex){%>
                <tr>
                    <td colspan="5">
                        Erro ao carregar a lista: <%=ex.getMessage()%>
                    </td>
                </tr>
           <%}%> 
              
                
           
                  <tr>
                      <td><%//Atores.buscaTESTE(1)%></td>
                       <td>Ação</td>
                       <td>1:40</td>
                       <td>10/07/2017</td>
                       <td>Peter Parker</td>
                       <td>pontuacao</td>
                  </tr>
               </tbody>
             </table> 
          </div>
       </div>
      </center>
    </body>
</html>