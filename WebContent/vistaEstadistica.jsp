<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="datos.categoriaDeConsulta"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Estadisticas</title>
	</head>
	<body>
	<%@ include file="/cabecera.jsp" %>
	<h1 align = "center">Estadisticas de categorias de consulta:</h1>
		<script src="static/js/Chart.min.js"></script>
		<div id="canvas-holder" align = "center">
			<canvas id="chart-area" width="500" height="500"></canvas>
		</div>
		<script>
			<% int[] array = (int[])request.getAttribute("valor");
				int i = 0;%>
			<% List<categoriaDeConsulta> categorias=(List)request.getAttribute("categoria");%>
				var pieData = [
				<%for(categoriaDeConsulta categoria:categorias){ %>
				{value:<%= array[i]%>,color:dame_color_aleatorio(),highlight: dame_color_aleatorio(),label: "<%= categoria.getNombreCategoriaDeConsulta() %>"},
				<% i++;} %>
		 
			];
			var ctx = document.getElementById("chart-area").getContext("2d");	
			window.myPie = new Chart(ctx).Doughnut(pieData);	
		</script>

	</body>
</html>