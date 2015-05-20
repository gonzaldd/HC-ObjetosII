<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="datos.Paciente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HC Paciente</title>
</head>
<BODY>
<%@ include file="/cabecera.jsp" %>
<% Paciente paciente=(Paciente)request.getAttribute("paciente"); %>
<BR>

ID : <%= paciente.getIdPaciente() %><BR>
Apellido : <%= paciente.getApellidoPaciente() %><BR>
Nombre: <%= paciente.getNombrePaciente() %><BR>
DNI : <%= paciente.getDniPaciente() %><BR>
Activo : <%= paciente.isActivoPaciente() %><BR>

<BR>
<A href="/HC/index.html">Volver...</A>
</BODY>
</html>