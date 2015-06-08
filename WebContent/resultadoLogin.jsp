<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="static/css/bootstrap.min.css">
  <link rel="stylesheet" href="static/css/jquery.bxslider.css">
  <link rel="stylesheet" href="static/css/estilos.css">
<title>Resultado del login</title>
</head>
<body>


	<div>
		Situacion: <%= request.getAttribute("resultado") %>

		<form method="GET" action="/HC/login">
		   		<input type="submit" value="Volver al inicio" class="btn btn-primary">
		</form>
	
	</div>




</body>
</html>