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
		<link rel="stylesheet" href="static/css/bootstrap.min.css">
		<link rel="stylesheet" href="static/css/jquery.bxslider.css">
		<link rel="stylesheet" href="static/css/estilos.css">
		<title>¡Consulta agregada exitosamente!</title>
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
			              <li><a href="/HC/agregarConsulta.html">Agregar consulta</a></li>
			              <li class="divider"></li>
			              <li><a href="/HC/historiaClinica.html">Buscar historia clínica</a></li>
			              <li class="divider"></li>
			              <li><a href="/HC/consultasEntreFechas.html">Ver consultas entre fechas</a></li>
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
									<li><a href="/HC/cambioClave.jsp">Cambiar clave</a></li>
									<!-- La clase "divider" sirve para poner un separador-->
									<li class="divider"></li>
									<li><a href="/HC/login" value="Salir">Cerrar sesión</a></li>
								</ul>
		          </ul>


		          	<form method="post" action="/HC/MostrarHistoriaClinica" class="navbar-form navbar-right" role="search">
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
  

		<% Paciente p = (Paciente)request.getAttribute("paciente"); %>
		
<div class="container">
    <h2 align="center"><span style="color:#8E0229; font-weight: bold;">Historia clínica entre fechas determinadas</span></h2>
    <hr>
    <div class="row">
        <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h2 class="panel-title"><span style="font-weight: bold;">Paciente:</span></h2>
                <span style="font-weight: bold;">Apellido y nombre: </span><%= p.getApellidoPaciente() %>, <%= p.getNombrePaciente() %>.
                <span style="font-weight: bold;">DNI:</span> <%= p.getDniPaciente() %>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
            </div>
            <table class="table">
                <thead>
                    <tr class="filters">
                        <th><input type="text" class="form-control" placeholder="ID Consulta" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Fecha de consulta" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Diagnóstico" disabled></th>
                    </tr>
                </thead>
                <tbody>
		<% List<Consulta> consultas=(List)request.getAttribute("consultas");
			for(Consulta consulta:consultas){ %>
			<tr>
				<td><%= consulta.getIdConsulta() %></td>
				<td><%= Funciones.traerFechaCorta(consulta.getFechaDeAtencion()) %></td>
				<td><%= consulta.getDiagnostico() %></td>
			</tr>
			<% } %>
                </tbody>
            </table>
        </div>

		</div>
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
  <script type="text/javascript">
	  $(document).ready(function(){
	    $('.filterable .btn-filter').click(function(){
	        var $panel = $(this).parents('.filterable'),
	        $filters = $panel.find('.filters input'),
	        $tbody = $panel.find('.table tbody');
	        if ($filters.prop('disabled') == true) {
	            $filters.prop('disabled', false);
	            $filters.first().focus();
	        } else {
	            $filters.val('').prop('disabled', true);
	            $tbody.find('.no-result').remove();
	            $tbody.find('tr').show();
	        }
	    });
	
	    $('.filterable .filters input').keyup(function(e){
	        /* Ignore tab key */
	        var code = e.keyCode || e.which;
	        if (code == '9') return;
	        /* Useful DOM data and selectors */
	        var $input = $(this),
	        inputContent = $input.val().toLowerCase(),
	        $panel = $input.parents('.filterable'),
	        column = $panel.find('.filters th').index($input.parents('th')),
	        $table = $panel.find('.table'),
	        $rows = $table.find('tbody tr');
	        /* Dirtiest filter function ever ;) */
	        var $filteredRows = $rows.filter(function(){
	            var value = $(this).find('td').eq(column).text().toLowerCase();
	            return value.indexOf(inputContent) === -1;
	        });
	        /* Clean previous no-result if exist */
	        $table.find('tbody .no-result').remove();
	        /* Show all rows, hide filtered ones (never do that outside of a demo ! xD) */
	        $rows.show();
	        $filteredRows.hide();
	        /* Prepend no-result row if all rows are filtered */
	        if ($filteredRows.length === $rows.length) {
	            $table.find('tbody').prepend($('<tr class="no-result text-center"><td colspan="'+ $table.find('.filters th').length +'">No result found</td></tr>'));
	        }
	    });
	});
	</script>
  
		
	</body>
</html>