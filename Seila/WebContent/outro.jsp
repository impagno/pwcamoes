<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Exemplo de JSP 3</title>
	</head>
	<body>
<%
	String nome = session
		.getAttribute("nome")
		.toString();
	out.print("<h1>Olá "
		+ nome
		+ "</h1>");
%>
	</body>
</html>