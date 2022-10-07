<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.jdbc.model.Pessoa"%>
<%@ page import="br.com.fiap.jdbc.dao.PessoaDAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%
PessoaDAO PessoaDAO = new PessoaDAO();
Pessoa Pessoa = new Pessoa();
List<Pessoa> listarPessoas = new ArrayList<Pessoa>();
listarPessoas = PessoaDAO.listarTodos();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Pessoass</title>
</head>
<body>
	<table class="table" id="tabela">
		<thead>
			<tr>
				<th>CD_PESSOA</th>
				<th>NOME</th>
				<th>RG</th>
				<th>CPF</th>
				<th>DATA_NASCIMENTO</th>
				<th>GENERO</th>
				<th>Opções</th>
			<tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < listarPessoas.size(); i++) {
				Pessoa = listarPessoas.get(i);
			%>
			<tr>
				<td><%=Pessoa.getCd_pessoa()%></td>
				<td><%=Pessoa.getNome() %></td>
				<td><%=Pessoa.getRG()%></td>
				<td><%=Pessoa.getCPF()%></td>
				<td><%=Pessoa.getData_nascimento()%></td>
				<td><%=Pessoa.getCd_genero()%></td>
				<td>
					<input type="button" value="Excluir" class="btn btn-outline-dark" onclick="excluirPessoas(<%=Pessoa.getCd_pessoa()%>)" >
					<input type="button" value="Editar" class="btn btn-outline-dark" onclick="editarPessoas(<%=Pessoa.getCd_pessoa()%>)" >
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	
	<a href="/simuladorCRUD/novoPessoa">Novo</a>
	<script src="script/pessoa.js"></script>
</body>
</html>