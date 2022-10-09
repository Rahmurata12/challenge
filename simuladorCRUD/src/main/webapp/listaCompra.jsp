<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.jdbc.model.Compra"%>
<%@ page import="br.com.fiap.jdbc.dao.CompraDAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="br.com.fiap.jdbc.model.Pessoa"%>
<%@ page import="br.com.fiap.jdbc.dao.PessoaDAO"%>
<%
CompraDAO CompraDAO = new CompraDAO();
Compra Compra = new Compra();
int cd_pessoa = Integer.parseInt(request.getParameter("cd_pessoa"));
List<Compra> listarCompras = new ArrayList<Compra>();
listarCompras = CompraDAO.listarTodos(cd_pessoa);
%>
<%
PessoaDAO pessoaDAO = new PessoaDAO();
Pessoa Pessoa = new Pessoa();
Pessoa = pessoaDAO.buscaCd_pessoa(cd_pessoa);
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
                                            <span class="login100-form-title" id="log"><%=Pessoa.getNome()%></span>
                                            <table class="table" id="tabela">
                                    
                                                <div class="Categorias">
         
                                                </div>
                                                <thead>
                                                    <tr>
                                                    	<th>Código da Pessoa</th>
                                                        <th>Data da compra</th>
                                                        <th>Status</th>
                                                        <th>Local da compra</th>
                                                    <tr>
                                                </thead>
                                              <tbody>
			<%
			for (int i = 0; i < listarCompras.size(); i++) {
				Compra = listarCompras.get(i);
			%>
			<tr>
				<td><%=Compra.getCd_pessoa()%></td>
				<td><%=Compra.getDate_compra() %></td>
				<td><%=Compra.getStatus()%></td>
				<td><%=Compra.getLocal_compra()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
                                            </table>
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