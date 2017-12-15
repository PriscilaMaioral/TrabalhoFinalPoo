

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="keywords" content="I.A,inteligência artificial, tensorflow, redes neurais, aprendizado de máquina, machine learning">
    <meta name="author" content="Rodrigo Garcia Topan Moreira">
    <meta name="description" content="Páginal Inicial de Apresentação do projeto">
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
							    <H2 class="display-4">CADASTRO USUÁRIO</H2>
							  </div>
							</div>
						</section>
							
							<div class="card">
							  <div class="jumbotron">
									<!--form cadastro ator-->
								  <form action="cadastro_genero.jsp" method="post">
								   <div class="form-group">
										<label for="c_nome_usuario">Nome:</label>
										<input type="text" class="form-control" name="c_nome_usuario" placeholder="Digite o nome">
								  	</div>
				    			   <div class="form-group">
										<label for="c_email_usuario">Email:</label>
										<input type="email" class="form-control" name="c_email_usuario" placeholder="Digite o email">
								  	</div>
								    <div class="form-group">
										<label for="senha_usuario">Senha:</label>
										<input type="password" class="form-control" name="c_senha_usuario" placeholder="Digite a senha">
								  	</div>
						  		    <div class="form-group">
										<label for="senha_usuario_confirm">Confirmar Senha:</label>
										<input type="password" class="form-control" name="senha_usuario_confirm" placeholder="Digite a senha">
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
