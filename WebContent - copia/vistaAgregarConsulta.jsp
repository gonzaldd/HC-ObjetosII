<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="datos.Consulta"%>
<%@page import="datos.Paciente"%>
<%@ page import="java.util.*" %>
<%@ page import="datos.Funciones" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HC Consulta</title>
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

<% int idConsulta=(int)request.getAttribute("consulta"); %>
<BR>
Consulta agregada con exito. ID Consulta: <%=idConsulta%>
<BR>
<BR>
<A href="/HC/historiaClinica.html">Ver Historia Clinica...</A>
<BR>
<BR>
<A href="/HC/index.html">Volver...</A>
</BODY>
</html>