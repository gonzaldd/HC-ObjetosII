<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.net.InetAddress" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de usuarios</title>
</head>
<body>

<form method="POST" action="/HC/login">
   <input type="text" name="user" placeholder="Usuario" autofocus><br>
   <input type="password" name="pass" placeholder="Contraseņa"><br>
   <input type="submit" value="Enviar">
</form>

</body>
</html>