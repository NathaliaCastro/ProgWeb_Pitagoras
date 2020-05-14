<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Tela de Login</title>

<!-- Inserindo BootStrap parte 1 -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>

<%
	// Escritura em Java
String erro = null;

if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null) {
%>
<jsp:useBean id="loginBean"
	class="br.com.nathaliacastro.TelaDeLogin.bean.LoginBean">
	<jsp:setProperty name="loginBean" property="*" />
</jsp:useBean>
<%
	if (loginBean.isValid()) {
	out.println("<h2> Bem vindo </h2>");
	out.println("Login realizado com sucesso.");
	return;
} else {
	erro = "Os dados digitados são inválidos. Por favor, tente novamente.";
}
%>
<%
	}
%>

<body style="background-color: rgb(213, 235, 240)">
	<h2 style="text-align: center;">Login</h2>
	<hr>

	<%
		if (erro != null) {
	%>
	<span class="text-danger"> <%
 	out.print(erro);
 %>
	</span>
	<%
		}
	%>

	<br>
	<br>
	<form method="post" style="text-align: center;">

		<b> Usuario <input type="text" name="usuario" placeholder="Digite seu usuário" aria-describedby="basic-addon1"/> </b> 
		<br> <br> 
		<b> Senha <input type="password" name="senha" placeholder="Digite sua senha" aria-describedby="basic-addon1"/> </b>
		<div id="button">
			<br>
			<button type="submit" name="submit" class="btn btn-success">Entrar</button>
			<button type="reset" class="btn btn-info">Limpar Campos</button>
		</div>
	</form>

<!-- Inserindo BootStrap parte 2 -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous">
		
	</script>

</body>
</html>