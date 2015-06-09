<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="static/css/bootstrap.min.css">
  <link rel="stylesheet" href="static/css/jquery.bxslider.css">
  <link rel="stylesheet" href="static/css/estilos.css">
<title>Inicio de sesi�n incorrecto</title>
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
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">Quienes somos<span class="caret"></span></a>
            	<ul class="dropdown-menu" role="menu">
            		<li><a href="contacto.html">Contacto</a></li>
					<!-- La clase "divider" sirve para poner un separador-->
					<li class="divider"></li>
					<li><a href="objetivo.html">Nuestro objetivo</a></li>
				</ul>
          </ul>

      		<form method="POST" action="/HC/login" class="navbar-form navbar-right" role="form">
      			<div class="input-group">
      				<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
      				<input  type="number" class="form-control"  name="user" placeholder="Usuario" autofocus>
      				
      				<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
      				<input type="password" class="form-control" name="pass" placeholder="Contrase�a">
      			</div>
      			<button id="inicio" type="submit" class="btn btn-primary"><a href="/HC/resultadoLogin.jsp"><span style="color: #FFFFFF; cursor:pointer;">Iniciar sesi�n</span></a></button>
      		</form>
        </div>
		  </div>
    </nav>      
  </header>

  
  <div class="container">
  	<h2 align="center"><span style="color:#8E0229; font-weight: bold;">Inicio de sesi�n incorrecto</span></h2>
	<hr>
	
		Situaci�n: <%= request.getAttribute("resultado") %><br>

		<form method="GET" action="/HC/login">
		   		<input type="submit" value="Volver al inicio" class="btn btn-primary">
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