<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Pessoa</title>
<link href="css/NovoPessoa.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<div class="form">
        <div class="container-login100">
            <div class="wrap-login100">
        <form name="frm" action="/simuladorCRUD/novoPessoa" method="post">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12">
            <h2 class="titulo">Criar conta:</h2>
            <br>

            <div class="form-group">
                <label><b>Nome</b></label> <br> <input type=text name="nome" class="form-control nome" placeholder="nome"> <br>
                <label><b>RG</b></label> <br> <input type="text" name="rg" class="form-control rgcpf" placeholder="rg"> <br> 
                <label><b>CPF</b></label> <br> <input type="text" name="cpf" class="form-control rgcpf" placeholder="cpf"> <br> 
                <label><b>Email</b></label> <br> <input type="text" name="email" class="form-control" placeholder="email"> <br> 
                <label><b>Data de nascimento</b></label> <br> <input type=date name="dataNasc" class="form-control data" > <br> 
                <label for="categoria"><b>Genero</b></label> <br>
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
            <input type="submit" name="enviar" class="btn btn-primary" value="Junta-se a nós!">
                    </div>
                </div>
            </div>
        </form>
            </div>
        </div>
    </div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>