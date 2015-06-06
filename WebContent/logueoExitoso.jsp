<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="datos.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="static/css/bootstrap.min.css">
  <link rel="stylesheet" href="static/css/jquery.bxslider.css">
  <link rel="stylesheet" href="static/css/estilos.css">
<title>Inicio</title>
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
		            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">Funciones<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Agregar consulta</a></li>
									<!-- La clase "divider" sirve para poner un separador-->
									<li class="divider"></li>
									<li><a href="/HC/historiaClinica.html">Ver historia cl�nica</a></li>
									<li class="divider"></li>
									<li><a href="#" value="Salir">Ver consultas entre fechas</a></li>
									<li class="divider"></li>
									<li><a href="#" value="Salir">Ver estad�sticas de consultas</a></li>
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
	


  <script src="static/js/jquery.js"></script>
  <script src="static/js/bootstrap.min.js"></script>
  <script src="static/js/jquery2.js"></script>

</body>
</html>