<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="datos.Consulta"%>
<%@page import="java.util.List"%>
<%@page import="datos.Funciones"%>
<%@page import="datos.Paciente"%>
<%@page import="negocio.PacienteABM"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Historia Clinica</title>
	</head>
	<body>
		<%@ include file="/cabecera.jsp" %>
		<BR>
			Paciente
		<BR>
		<% Paciente p = (Paciente)request.getAttribute("paciente"); %>
		ID: <%= p.getIdPaciente() %><br>
		Apellido: <%= p.getApellidoPaciente() %><br>
		Nombre: <%= p.getNombrePaciente() %><br>
		DNI: <%= p.getDniPaciente() %>
		<BR>
			Historia Clinica
		<BR>
		<table border="1">
			<tr>
				<th>ID Consulta</th>
				<th>Fecha</th>
				<th>Diagnostico</th>
			</tr>
			<% List<Consulta> consultas=(List)request.getAttribute("consultas");
			for(Consulta consulta:consultas){ %>
			<tr>
				<td><%= consulta.getIdConsulta() %></td>
				<td><%= Funciones.traerFechaCorta(consulta.getFechaDeAtencion()) %></td>
				<td><%= consulta.getDiagnostico() %></td>
			</tr>
			<% } %>
		</table>
		<BR>
		<A href="/HC/index.html">Volver...</A>
	</body>
</html>