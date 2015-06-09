<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="datos.categoriaDeConsulta"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="static/css/bootstrap.min.css">
		<link rel="stylesheet" href="static/css/jquery.bxslider.css">
		<link rel="stylesheet" href="static/css/estilos.css">
		<title>Estadística de categorías de consultas</title>
	</head>
	<body>
		<header>
	    <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
	    	<div class="container">
		        <div class="navbar-header">
		          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-fm">
		            <span class="sr-only">Desplegar / Ocultar menu</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>

		          <a href="#" class="navbar-brand">Hospital Lanús</a>
		          
		        </div>
		        <!-- Inicia Menu -->
		        <div class="collapse navbar-collapse" id="navegacion-fm">
		          <ul class="nav navbar-nav">
		          	<li class="dropdown">
		            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-labelledby="dLabel">Funciones<span class="caret"></span></a>
			            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
			             
			              <li><a href="/HC/historiaClinicaExterno.html">Buscar historia clínica</a></li>
			              <li class="divider"></li>
			              <li><a href="/HC/consultasEntreFechasExterno.html">Ver consultas entre fechas</a></li>
						  <li class="divider"></li>
			              <li class="dropdown-submenu">
			                <a tabindex="-1" href="#">Ver estadísticas de consultas</a>
			                <ul class="dropdown-menu">
			                  <li><a tabindex="-1" href="/HC/chart">Estadística estática</a></li>
			                  <li class="dropdown-submenu">
			                    <!-- <a href="#">Para un tercer nivel</a>
			                    <ul class="dropdown-menu">
			                        <li><a href="#">Link de tercer nivel</a></li>
			                        <li><a href="#">Link de tercer nivel</a></li>
			                    </ul> -->
			                  </li>
			                  <li><a href="#">Estadística dinámica</a></li>
			                </ul>
			              </li>
			            </ul>
		            <li class="dropdown">
		            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">Mi perfil<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/HC/cambioClaveExterno.jsp">Cambiar clave</a></li>
									<!-- La clase "divider" sirve para poner un separador-->
									<li class="divider"></li>
									<li><a href="/HC/login" value="Salir">Cerrar sesión</a></li>
								</ul>
		          </ul>


		          	<form method="post" action="/HC/MostrarHistoriaClinicaExterno" class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" name="dniPaciente" class="form-control" placeholder="Buscar historia clínica..." autofocus>
						</div>
						<button type="submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</form>
					
		        </div>
		    </div>
	    </nav>      
  </header>
  
    <div>
      <figure>
      <img src="static/img/logo.jpg" HEIGHT="100" WIDTH="100" align="left"/>
    </figure>
    </div>
  
  
	<div class="container">
	    <h2 align="center"><span style="color:#8E0229; font-weight: bold;">Estadísticas de categorías de consulta</span></h2>
	    <hr>
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
			
	</div>
		
	<div>
	<footer>
		<div class="container">
	      <div class="row">
	        <div class="col-xs-6">
	          <p id="pie">Barros Bruno Jair - Cascardo Sebastián - De Domingo Gonzalo - Rodríguez Esteban</p>
	        </div>
	        <div class="col-xs-6">
	          <ul class="list-inline text-right">
	            <li><a href="contacto.html"><span style="font-weight: bold;">Contacto</span></a></li>
	            <li><a href="objetivo.html"><span style="font-weight: bold;">Nuestro objetivo</span></a></li>
	          </ul>
	        </div>
	      </div>
	    </div>
	</footer>
  </div>



  <script src="static/js/jquery.js"></script>
  <script src="static/js/bootstrap.min.js"></script>
  <script src="static/js/jquery2.js"></script>

</body>
</html>