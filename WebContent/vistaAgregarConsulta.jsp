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

<% Consulta consulta=(Consulta)request.getAttribute("consulta"); %>
<BR>
<FORM method="POST" action=" /HC/MostrarHistoriaClinica ">
<TABLE border="0">

<TR>
<TD>
<TD>Id Profesional:</TD>
	<TD><INPUT type="number"  name="idProfesional"></TD>
</TR>
<TR>
<TD>
<TD>Id Categoria de consulta:</TD>
	<TD><INPUT type="number" name="idCategoriaDeConsulta"></TD>
</TR>
<TR>
<TD>
<TD>Fecha:</TD>
	<TD><INPUT type="date" name="fechaDeAtencion"></TD>
</TR>
<TR>
<TD>
<TD>Diagnostico:</TD>
	<TD><textarea name="diagnostico" rows="10" cols="30"></textarea></TD>
</TR>
<TR>
<TD>
<BR>
<INPUT type="submit" value="Agregar Consulta">
</TD>
</TR>
</TABLE>
</FORM>


<BR>

<BR>
<A href="/HC/index.html">Volver...</A>
</BODY>
</html>