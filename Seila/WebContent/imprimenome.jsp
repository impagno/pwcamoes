
<%@page import="java.text.NumberFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Exemplo de JSP 2</title>
	</head>
	<body>
<%
	double num1 = Double
		.parseDouble(
				request.getParameter("num1"));
		double num2 = Double
		.parseDouble(
				request.getParameter("num2"));
	String oper = request.getParameter("operacao");
	String operacao = "";
	double soma = 0.0;
	
	switch(oper) {
	case "soma":
		soma = num1 + num2;
		operacao = "soma";
	break;
	case "sub":
		soma = num1 - num2;
		operacao = "subtração";
	break;
	case "multi":
		soma = num1 * num2;
		operacao = "multiplicação";
	break;
	case "div":
		soma = num1 / num2;
		operacao = "divisão";
	break;
	}

	out.print("<h1>O resultado da operação de " 
		+ operacao + " é "
		+ NumberFormat.getInstance().format(soma)
		+ "</h1>");
%>
	</body>
</html>