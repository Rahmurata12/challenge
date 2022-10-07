<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Produto Categoria</title>
</head>
<body>
	<div class="container-fluid px-4 pb-4" style="padding-top: 80px;">
		<h3 class="mb-4 border-bottom pb-2">Lista de Pessoas Por Genero</h3>
		
		<c:forEach items="${generos}" var="genero">
			<h4>${genero.nome}</h4>
			<div class="table-responsive">
				<table class="table table-hover mb-5">
				  <thead>
				    <tr>
				      <th scope="col" class="col-1">Id</th>
				      <th scope="col" class="col-4">Nome</th>
				      <th scope="col" class="col-5">Descricao</th>
				      <th scope="col" class="col-1">Remover</th>
				      <th scope="col" class="col-1">Editar</th>
				    </tr>
				  </thead>
				  <tbody>
				   <c:forEach items="${genero.pessoas}" var="genero">
					    <tr class="align-middle">
					      <td>
					      	${genero.cd_genero}
					      </td>
					      <td class="text-truncate">
					      	${produto.genero}
					      </td>
					      <td>
					      	<a href="/loja-virtual-web/removeProduto?id=${produto.id}" class="btn btn-danger">Remover</a>
					      </td>
					      <td>
					      	<a href="/loja-virtual-web/editaProduto?id=${produto.id}" class="btn btn-primary">Editar</a>
					      </td>
					    </tr>
				    </c:forEach>
				  </tbody>
				</table>
			</div>
		</c:forEach>
	</div>
</body>
</html>