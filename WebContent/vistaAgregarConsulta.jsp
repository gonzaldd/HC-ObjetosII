<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="datos.Consulta"%>
<%@page import="datos.Paciente"%>
<%@ page import="java.util.*" %>
<%@ page import="datos.Funciones" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="static/css/bootstrap.min.css">
		<link rel="stylesheet" href="static/css/jquery.bxslider.css">
		<link rel="stylesheet" href="static/css/estilos.css">
		<title>�Consulta agregada exitosamente!</title>
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

		          <a href="#" class="navbar-brand">Hospital Lan�s</a>
		          
		        </div>
		        <!-- Inicia Menu -->
		        <div class="collapse navbar-collapse" id="navegacion-fm">
		          <ul class="nav navbar-nav">
		          	<li class="dropdown">
		            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-labelledby="dLabel">Funciones<span class="caret"></span></a>
			            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu">
			              <li><a href="/HC/agregarConsulta.html">Agregar consulta</a></li>
			              <li class="divider"></li>
			              <li><a href="/HC/historiaClinica.html">Buscar historia cl�nica</a></li>
			              <li class="divider"></li>
			              <li><a href="/HC/consultasEntreFechas.html">Ver consultas entre fechas</a></li>
						  <li class="divider"></li>
			              <li class="dropdown-submenu">
			                <a tabindex="-1" href="#">Ver estad�sticas de consultas</a>
			                <ul class="dropdown-menu">
			                  <li><a tabindex="-1" href="/HC/chart">Estad�stica est�tica</a></li>
			                  <li class="dropdown-submenu">
			                    <!-- <a href="#">Para un tercer nivel</a>
			                    <ul class="dropdown-menu">
			                        <li><a href="#">Link de tercer nivel</a></li>
			                        <li><a href="#">Link de tercer nivel</a></li>
			                    </ul> -->
			                  </li>
			                  <li><a href="#">Estad�stica din�mica</a></li>
			                </ul>
			              </li>
			            </ul>
		            <li class="dropdown">
		            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">Mi perfil<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/HC/cambioClave.jsp">Cambiar clave</a></li>
									<!-- La clase "divider" sirve para poner un separador-->
									<li class="divider"></li>
									<li><a href="/HC/login" value="Salir">Cerrar sesi�n</a></li>
								</ul>
		          </ul>


		          	<form method="post" action="/HC/MostrarHistoriaClinica" class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" name="dniPaciente" class="form-control" placeholder="Buscar historia cl�nica..." autofocus>
						</div>
						<button type="submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</form>
					
		        </div>
		    </div>
	    </nav>      
  </header>
  

<% Paciente paciente=(Paciente)request.getAttribute("paciente"); %>

<div class="container">
    <h2 align="center"><span style="color:#8E0229; font-weight: bold;">�Consulta agregada exitosamente!</span></h2>
    <hr>
    <div class="row">
        <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h2 class="panel-title"><span style="font-weight: bold;">Paciente:</span></h2>
                <span style="font-weight: bold;">ID del paciente:</span> <%= paciente.getIdPaciente() %>
                <span style="font-weight: bold;">Apellido y nombre: </span><%= paciente.getApellidoPaciente() %>, <%= paciente.getNombrePaciente() %>.
                <span style="font-weight: bold;">DNI:</span> <%= paciente.getDniPaciente() %>
            </div>
            <% int idConsulta=(int)request.getAttribute("consulta"); %>
			<BR>
			Consulta agregada con exito. ID Consulta: <%=idConsulta%>


        </div>

		</div>
		
		 <form method="post" action="/HC/MostrarHistoriaClinica" class="navbar-form navbar-left" role="search">
			<button id="inicio" name="dniPaciente" type="submit" class="btn btn-primary" value="<%= paciente.getDniPaciente() %>"><a href="/HC/MostrarHistoriaClinica"><span style="color: #FFFFFF; cursor:pointer;">Ver historia cl�nica del paciente</span></a></button>
		</form>
		</div>
		
			<div>
	<footer>
		<div class="container">
	      <div class="row">
	        <div class="col-xs-6">
	          <p id="pie">Barros Bruno Jair - Cascardo Sebasti�n - De Domingo Gonzalo - Rodr�guez Esteban</p>
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