<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Pessoa</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/form.css" rel="stylesheet">
</head>
<body>

	<h2 class="titulo">Nova Pessoa:</h2>
	<br>
	<div class="form">
		<form name="frm" action="/simuladorCRUD/novoPessoa" method="post">
			<div class="form-group">
				<label>Nome</label> <br> <input type=text name="nome" class="form-control nome" placeholder="nome"> <br>
				<label>RG</label> <br> <input type="text" name="rg" class="form-control rgcpf" placeholder="rg"> <br> 
				<label>CPF</label> <br> <input type=text name="cpf" class="form-control rgcpf" placeholder="cpf"> <br> 
				<label>Data de nascimento</label> <br> <input type=date name="dataNasc" class="form-control data" > <br> 
				<label for="categoria">Genero:</label> <br>
				<select name="cd_generoPessoa" class="form-select form-select-sm" aria-label="Default select example" id="genero">
					<option value=1>MASCULINO</option>
					<option value=2>FEMENINO</option>
					<option value=3>TRANSGÊNERO</option>
					<option value=4>GÊNERO NEUTRO</option>
					<option value=5>NÃO-BINÁRIO</option>
					<option value=6>AGÊNERO</option>
					<option value=7>PANGÊNERO</option>
					<option value=8>ASSEXUAL</option>
					<option value=9>CISGÊNERO</option>
					<option value=10>QUEER</option>
				</select> <br> <br>
			</div>
			<br> 
			<br> 
			<input type="submit" name="enviar" class="btn btn-primary" value="Enviar">
		</form>
	</div>
	
	
	<script src="script/teste.js"></script>
</body>
</html>