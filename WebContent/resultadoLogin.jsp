<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado del login</title>
</head>
<body>

Situacion: <%= request.getAttribute("resultado") %>


<form method="GET" action="/HC/login">
   		<input type="submit" value="Salir">
</form>
<h1><A href="/HC/logueo.jsp">Volver al logueo</A></h1>


</body>
</html>