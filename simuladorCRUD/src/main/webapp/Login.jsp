<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/Login.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

   <div class="container-login100">
        <div class="wrap-login100">

            <div class="form" id = "LoginScreen">
                <form name="frm" action="/simuladorCRUD/novoLogin" method="post">


            <div class="container">
            <div class="row">
                 <div class="col-12 col-sm-12 col-md-6 col-lg-6">
                                <div class="login100-pic">
                                    <img src="images/img-01.png" alt="IMG">
                                </div>
                            </div>
                            <div class="col-12 col-sm-12 col-md-6 col-lg-6">
                            <div class="form-group">
                                <span class="login100-form-title" id="log">Login</span>
                                <label>Usuario</label> <br> <input type=text name="usuario" class="form-control" placeholder="Usuario da Conta"> <br>
                                
                                
                                <label>Senha</label> <br> <input type="password" name="senha" class="form-control" placeholder="Senha do Usuario"> <br>
                                <input type="hidden" name="cd_Pessoa" class="form-control">
                            	<input type="submit" name="enviar" class="btn btn-primary" value="Entrar">
                            </div>
                        </div>
            </div>
        </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
