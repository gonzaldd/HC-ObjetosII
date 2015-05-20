package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.PacienteABM;
import datos.Paciente;

public class ControladorMostrarPacientePorDNI extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	
	try {
		int dniPaciente = Integer.parseInt(request.getParameter("dniPaciente"));
		PacienteABM pacienteabm=new PacienteABM();
		Paciente paciente=pacienteabm.traerPacientePorDni(dniPaciente);
		request.setAttribute("paciente", paciente);
		request.getRequestDispatcher("/vistaPaciente.jsp").forward(request ,response);
	
	} catch (Exception e) {
		response.sendError(500, "el DNI Ingresado no existe en la base de datos.");
	}

	}
}
