<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="datos.Consulta"%>
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


<% Consulta consulta=(Consulta)request.getAttribute("consulta"); %>
<BR>

ID: <%= consulta.getIdConsulta() %><BR>
Fecha : <%= Funciones.traerFechaCorta(consulta.getFechaDeAtencion()) %><BR>
Diagnostico : <%= consulta.getDiagnostico() %><BR>

<BR>
<A href="/HC/index.html">Volver...</A>
</BODY>
</html>