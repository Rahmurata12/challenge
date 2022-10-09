<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.jdbc.model.Pessoa"%>
<%@ page import="br.com.fiap.jdbc.dao.PessoaDAO"%>
<%
PessoaDAO pessoaDAO = new PessoaDAO();
Pessoa Pessoa = new Pessoa();
int cd_pessoa = Integer.parseInt(request.getParameter("cd_pessoa"));
Pessoa = pessoaDAO.buscaCd_pessoa(cd_pessoa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Pessoa</title>
<link href="css/NovoPessoa.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	
	<div class="form">
        <div class="container-login100">
            <div class="wrap-login100">
        <form name="frm" action="/simuladorCRUD/alterarPessoa" method="post">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12">
            <h2 class="titulo">Criar conta:</h2>
            <br>

            <div class="form-group">
                <input type="hidden" name="cd_pessoa" value="<%=Pessoa.getCd_pessoa()%>" class="caixaMenor">
				<label>Nome</label> <br> <input type=text name="nome" class="form-control nome" value="<%=Pessoa.getNome()%>"> <br>
				<label>RG</label> <br> <input type="text" name="rg" class="form-control rgcpf" value="<%=Pessoa.getRG()%>"> <br> 
				<label>CPF</label> <br> <input type=text name="cpf" class="form-control rgcpf" value="<%=Pessoa.getCPF()%>"> <br>
				<label>Email</label> <br> <input type="text" name="email" class="form-control" value="<%=Pessoa.getEMAIL()%>"> <br>  
				<label>Data de Nascimento</label> <br> <input type=date name="dataNasc" class="form-control data"> <br> 
				<label for="categoria">Generos:</label> <br>
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
            <input type="submit" name="enviar" class="btn btn-primary" value="Salvar">
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