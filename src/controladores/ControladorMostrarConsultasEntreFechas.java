package controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.ConsultaABM;
import negocio.PacienteABM;
import datos.Consulta;
import datos.Funciones;
import datos.Paciente;

public class ControladorMostrarConsultasEntreFechas extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	
	try {
		
		PacienteABM pacienteAbm = new PacienteABM();
		int dniPaciente = Integer.parseInt(request.getParameter("dniPaciente"));
		GregorianCalendar fechaDesde = Funciones.traerFecha(request.getParameter("fechaDesde"));
		GregorianCalendar fechaHasta = Funciones.traerFecha(request.getParameter("fechaHasta"));
		
		
		Paciente paciente = pacienteAbm.traerPacientePorDni(dniPaciente);
		ConsultaABM consultaabm=new ConsultaABM();
		
		
		List<Consulta> consultas=consultaabm.traerConsulta(paciente,fechaDesde, fechaHasta);
		
		request.setAttribute("consultas", consultas);
		request.setAttribute("paciente", paciente);
		
		request.getRequestDispatcher("/vistaConsultasEntreFechas.jsp").forward(request ,response);
	
	} catch (Exception e) {
		response.sendError(500, "el DNI Ingresado no existe en la base de datos.");
	}

	}
}
