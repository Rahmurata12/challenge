<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/form.css" rel="stylesheet">
</head>
<body>

    <h2 class="titulo">Login:</h2>
    <br>
    <div class="form" id = "LoginScreen">
        <form name="frm" action="/simuladorCRUD/novoLogin" method="post">
            <div class="form-group">
                <label>Usuario</label> <br> <input type=text name="usuario" class="form-control" placeholder="Usuario da Conta"> <br>
                <label>Senha</label> <br> <input type="password" name="senha" class="form-control" placeholder="Senha do Usuario"> <br>
                <input type="hidden" name="cd_Pessoa" class="form-control">
            </div>
            <br> 
            <br> 
            <input type="submit" name="enviar" class="btn btn-primary" value="Enviar">
        </form>
    </div>
    <script src="script/teste.js"></script>
</body>
</html>
