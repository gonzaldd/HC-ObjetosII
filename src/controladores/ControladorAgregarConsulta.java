package controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.CategoriaDeConsultaABM;
import negocio.ConsultaABM;
import negocio.PacienteABM;
import negocio.ProfesionalABM;
import datos.Consulta;
import datos.Funciones;
import datos.Paciente;
import datos.Profesional;
import datos.categoriaDeConsulta;

public class ControladorAgregarConsulta extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	
	try {
		 
		ConsultaABM consultaAbm=new ConsultaABM();
		Consulta consulta= new Consulta();
		
		PacienteABM pacienteAbm = new PacienteABM();
		int dniPaciente = Integer.parseInt(request.getParameter("dniPaciente"));
		Paciente paciente = pacienteAbm.traerPacientePorDni(dniPaciente);
		
		/*ProfesionalABM profesionalAbm= new ProfesionalABM();
		int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
		Profesional profesional = profesionalAbm.traerProfesional(idProfesional);
		
		CategoriaDeConsultaABM categoriaAbm= new CategoriaDeConsultaABM();
		int idCategoriaDeConsulta = Integer.parseInt(request.getParameter("idCategoriaDeConsulta"));
		categoriaDeConsulta categoria = categoriaAbm.traerCategoria(idCategoriaDeConsulta);
		*/
		/*
		int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
		int idCategoriaDeConsulta= Integer.parseInt(request.getParameter("idCategoriaDeConsulta"));
		int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
		*/
		/*
		GregorianCalendar fechaDeAtencion = Funciones.traerFecha(request.getParameter("fechaDeAtencion"));
		String diagnostico = request.getParameter("diagnostico");
		*/
		
		//int idConsulta = consultaAbm.agregarConsulta(paciente.getIdPaciente(), profesional.getIdProfesional(), categoria.getIdCategoriaDeConsulta(), fechaDeAtencion, diagnostico);
		//request.setAttribute("idConsulta", idConsulta);
		request.setAttribute("paciente", paciente);
		/*request.setAttribute("dniPaciente", dniPaciente);
		request.setAttribute("idCategoriaDeConsulta", idCategoriaDeConsulta);
		request.setAttribute("idProfesional", idProfesional);
		request.setAttribute("fechaDeAtencion", fechaDeAtencion);
		request.setAttribute("diagnostico", diagnostico);
		*/
		request.getRequestDispatcher("/vistaAgregarConsulta.jsp").forward(request ,response);
	
	} catch (Exception e) {
		response.sendError(500, "la consulta ya existe en la base de datos.");
	}

	}
}
