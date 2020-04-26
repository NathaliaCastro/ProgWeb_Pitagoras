<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title> Tela de Login </title> 
</head>

<% // Escritura em Java
 
 	String erro = null;

	if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null) {		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		// O usuário será admin e a senha também admin. Caso contrário, retornará erro
		
	if ("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(senha)) {
		} else {
			erro = "Os dados digitados são inválidos, tente novamente.";
		}
	}
%>

<body style="background-color: rgb(213, 235, 240)">
	<h2 style="text-align: center;"> Login </h2> 
	<hr>
	
<%
		if (erro != null) { %>
			<span style="color: red;">  
				<% out.print(erro); %>
			</span>
		<% 
		}
%>
	
	<br> <br>
	<form method="post" style="text-align: center;">
		<b> Usuario <input type="text" name="usuario" /> </b> <br> <br>
		<b> Senha <input type="password" name="senha" /> </b>
		<div id="button"> <br>
			<button type="submit" name="submit"> Entrar </button>
			<button type="reset"> Resetar senha </button>
		</div>
	</form>

</body>
</html>