package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.ConsultaABM;
import negocio.PacienteABM;
import datos.Consulta;
import datos.Paciente;

public class ControladorMostrarHistoriaClinica extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	
	try {
		
		PacienteABM pacienteAbm = new PacienteABM();
		int dniPaciente = Integer.parseInt(request.getParameter("dniPaciente"));
		Paciente paciente = pacienteAbm.traerPacientePorDni(dniPaciente);
		ConsultaABM consultaabm=new ConsultaABM();
		List<Consulta> consultas=consultaabm.traerConsulta1(paciente.getIdPaciente());
		
		request.setAttribute("consultas", consultas);
		request.setAttribute("paciente", paciente);
		
		request.getRequestDispatcher("/vistaHistoriaClinica.jsp").forward(request ,response);
	
	} catch (Exception e) {
		response.sendError(500, "el Id Ingresado no existe en la base de datos.");
	}

	}
}
