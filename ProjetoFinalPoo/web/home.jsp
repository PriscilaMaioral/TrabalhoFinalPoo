<%-- 
    Document   : home
    Created on : 14/12/2017, 21:51:50
    Author     : Danilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="author" content="Rodrigo Garcia Topan Moreira">
    <meta name="description" content="Páginal Inicial de Apresentação">
    <title>PROJETO FILMES</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  </head>
  <body>

      <section id="section-1" style="width: 100%; height: 100%; min-height: 850px; background-image: url('img/BANN1.jpg'); background-repeat: no-repeat; background-attachment:static; background-size: cover;">
        <br><br><br><br>
        <div class="container-fluid">
          <div class="card" style="background-color: #222222; color: white;" align="center">
            <div class="card-body">
              <H2 class="display-4">PROJETO FILMES</H2>
              <H3 class="lead"> AVALIAÇÃO DE FILMES</H3>
            </div>
          </div>
          <br> 
          <div class="card">
          <div class="card-header">
             <h2 class="card-title">TOP FILMES</h2>
          </div>
          <div class="card-body">
            <p class="card-text" style="font-size: 120%;" align="justify">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            
          </div>
        </div>   

        </div>
      </section>

      <section id="section-2" style="width: 100%; height: 100%; min-height: 800px; background-image: url('img/BANN2.jpg'); background-repeat: no-repeat; background-attachment: static; background-size: cover;">
        <br><br><br><br>
        <div class="container-fluid">
          <div class="card">
            <div class="card-body">
              <H2 class="display-4">RECENTES</H2>
              <H3 class="lead">AVALIAÇÕES EM TEMPO REAL</H3>
            </div>
          </div>
        <table class="table" style="background-color: white;">
          <thead class="thead-dark" style="background-color: black;color: white;">
              <tr>
                <th>Nome do Filme</th>
                <th>Genero</th>
                <th>Duração</th>
                <th>Lançamento</th>
                <th>Elenco</th>
                <th>Nota</th>
              </tr>
          </thead>
          <tbody>
                   <tr>
                       <td>Avengers</td>
                       <td>Ação</td>
                       <td>1:39</td>
                       <td>10/07/2016</td>
                       <td>Tony Stark</td>
                       <td>4</td>
                  </tr>
                  <tr>
                       <td>Spider Man</td>
                       <td>Ação</td>
                       <td>1:40</td>
                       <td>10/07/2017</td>
                       <td>Peter Parker</td>
                       <td>3</td>
                  </tr>
          </tbody>
        </table>
      </section>
      <br><br><br>
      <section id="section-3" style="width: 100%; height: 100%; min-height: 400px;">
        <div class="container">
          <h2 class="display-4" align="center">ENTRAR</h2>
          <hr>
            <a href="cadastro_usuario.html"><h4 align="center">Não tenho conta</h4></a>
            <br>  
          <br><br>
          <center>
              <div class="col-md-6" style="height: 100%; min-height:200px;">
                <figure class="figure" align="center">
                <img src="img/cadastro.png" class="figure-img img-fluid rounded" alt="A generic square placeholder image with rounded corners in a figure.">
                <h4><a href="login.html">Entrar no meu perfil</a></h4>
                <hr>
              </figure>
              </div>
               <link href="https://snatchbot.me/sdk/webchat.css" rel="stylesheet" type="text/css"><script src="https://snatchbot.me/sdk/webchat.min.js"></script><script> Init('?botID=7113&appID=UWHbOGdOy8LpXhyFH5zy', 600, 600, 'https://dvgpba5hywmpo.cloudfront.net/media/image/1509641347sdAD86HhLi', 'bubble', '#00AFF0', 90, 90, 62.99999999999999, '', '0'); /* for authentication of its users, you can define your userID (add &userID={login}) */ </script>
          </center>        
        </div> 
      </section>
  </body>
</html>