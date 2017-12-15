<%@page import="com.domain.web.Atores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String ErrorMessage = null;
    if(request.getParameter("Ator")!= null){
        String nome = request.getParameter("nm_ator");
        double nascimento = Double.parseDouble("dt_nascimentoString");
        String nacionalidade = request.getParameter("ds_nacionalidade");
        try{
            Atores.addAtores (nome, nascimento, nacionalidade);
            response.sendRedirect(request.getRequestURI());
        }
        catch (Exception e){
            ErrorMessage = e.getMessage();
        }
    }
%>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="keywords" content="I.A,inteligÃªncia artificial, tensorflow, redes neurais, aprendizado de mÃ¡quina, machine learning">
    <meta name="author" content="Rodrigo Garcia Topan Moreira">
    <meta name="description" content="PÃ¡ginal Inicial de ApresentaÃ§Ã£o do projeto">
    <title>Projeto Filmes</title>
    <link rel="stylesheet" type="text/css" href="css/projeto2.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  </head>
  <body style="background-image: url('img/BANN1.jpg'); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">
<!--<?php include('includes/menu.php');?>-->
<div class="row">
		<div class="container col-md-6 col-sm-12">
			 <main role="main">
				<section id="top-title" align="left">
				<br>
						<section id="top-title">
						<br><br><br>
							<div class="card">
							  <div class="card-body">
							    <H2 class="display-4">CADASTRO ATORES</H2>
							  </div>
							</div>
						</section>
							
							<div class="card">
							  <div class="jumbotron">
									<!--form cadastro ator-->
								  <form action="cadastro_ator.jsp" method="post">
								   <div class="form-group">
										<label for="c_nome">Nome:</label>
										<input type="text" class="form-control" name="c_nome_ator" placeholder="Digite o nome completo do ator">
								  	</div>
								   <div class="form-group">
										<label for="c_nacionalidade">Nacionalidade:</label>
										<input type="text" class="form-control" name="c_nacionalidade" placeholder="Nacionalidade do ator">
								  	</div>
									  <button type="submit" class="btn btn-primary">Cadastrar</button>		
								</form>
									<!--form-->
							 </div>
						   </div>
				</section>
		    </main>
		</div>
		</div>
		<br>
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  </body>
</html>