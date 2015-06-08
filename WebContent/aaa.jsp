<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Profesional"%>
<%@page import="datos.ContactoProfesional"%>
<%@page import="datos.Usuario"%>
<%@page import="datos.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Login login=(Login)request.getAttribute("login"); %>
<% Usuario usuario=(Usuario)request.getAttribute("usuario"); %>
<% Profesional profesional=(Profesional)request.getAttribute("profesional"); %>
<% ContactoProfesional contactoProfesional=(ContactoProfesional)request.getAttribute("contactoProfesional"); %>

</body>
</html>