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
                                <title>Lista Pessoas</title>
                                <link href="css/ListaPessoa.css" rel="stylesheet">
                                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
                                    rel="stylesheet"
                                    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
                                    crossorigin="anonymous">
                            </head>

                            <body>
                                <div class="container-login100" id="fundo">
                                    <div class="wrap-login100">
                                        <div class="col-12 col-sm-12 col-md-12 col-lg-12">
                                            <span class="login100-form-title" id="log">Lista Pessoas</span>
                                            <table class="table" id="tabela">
                                    
                                                <div class="Categorias">
         
                                                </div>
                                                <thead>
                                                    <tr>
                                                        <th>CD_PESSOA</th>
                                                        <th>NOME</th>
                                                        <th>RG</th>
                                                        <th>CPF</th>
                                                        <th>Email</th>
                                                        <th>DATA_NASCIMENTO</th>
                                                        <th>GENERO</th>
                                                        <th></th>
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
				<td><%=Pessoa.getEMAIL()%></td>
				<td><%=Pessoa.getData_nascimento()%></td>
				<td><%=Pessoa.getCd_genero()%></td>
				<td>
					<input type="button" value="Excluir" class="btn btn-info" onclick="excluirPessoas(<%=Pessoa.getCd_pessoa()%>)" >
					<input type="button" value="Editar" class="btn btn-info" onclick="editarPessoas(<%=Pessoa.getCd_pessoa()%>)" >
					<input type="button" value="Compras" class="btn btn-info" onclick="compraPessoas(<%=Pessoa.getCd_pessoa()%>)" >
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
                                            </table>

								<input type="button" value="Novo" class="btn btn-info" onclick="novoPessoa()" >									
                                        </div>
                                    </div>
                                </div>
                                <script src="script/pessoa.js"></script>
                                <script
                                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                                    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                                    crossorigin="anonymous"></script>
                            </body>
                            </html>