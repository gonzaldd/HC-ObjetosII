package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.PacienteABM;
import datos.Paciente;

public class ControladorMostrarPacientePorID extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		try {
			int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
			PacienteABM pacienteabm=new PacienteABM();
			Paciente paciente=pacienteabm.traerPacientePorId(idPaciente);
			request.setAttribute("paciente", paciente);
			request.getRequestDispatcher("/vistaPaciente.jsp").forward(request ,response);
		
		} catch (Exception e) {
			response.sendError(500, "la idPaciente Ingresada no existe en la base de datos.");
		}
		
		
	}
}

