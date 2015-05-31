package controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.CategoriaDeConsultaABM;
import negocio.ConsultaABM;
import negocio.LoginABM;
import negocio.PacienteABM;
import negocio.ProfesionalABM;
<<<<<<< HEAD
=======
import negocio.UsuarioABM;
import datos.Consulta;
>>>>>>> origin/master
import datos.Funciones;
import datos.Login;
import datos.Paciente;
import datos.Profesional;
import datos.Usuario;
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
		
		PacienteABM pacienteAbm = new PacienteABM();
		int dniPaciente = Integer.parseInt(request.getParameter("dniPaciente"));
		Paciente paciente = pacienteAbm.traerPacientePorDni(dniPaciente);
		
		ProfesionalABM profesionalAbm= new ProfesionalABM();
		int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
		Profesional profesional = profesionalAbm.traerProfesional(idProfesional);
		
		CategoriaDeConsultaABM categoriaAbm= new CategoriaDeConsultaABM();
		int idCategoriaDeConsulta = Integer.parseInt(request.getParameter("idCategoriaDeConsulta"));
		categoriaDeConsulta categoria = categoriaAbm.traerCategoria(idCategoriaDeConsulta);
		
<<<<<<< HEAD
=======
		/*
		int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
		int idCategoriaDeConsulta= Integer.parseInt(request.getParameter("idCategoriaDeConsulta"));
		int idProfesional = Integer.parseInt(request.getParameter("idProfesional"));
		*/
		/*
>>>>>>> origin/master
		GregorianCalendar fechaDeAtencion = Funciones.traerFecha(request.getParameter("fechaDeAtencion"));
		String diagnostico = request.getParameter("diagnostico");
		
		
		int consulta = consultaAbm.agregarConsulta(paciente.getIdPaciente(), profesional.getIdProfesional(), categoria.getIdCategoriaDeConsulta(), fechaDeAtencion, diagnostico);
		
		request.setAttribute("paciente", paciente);
		request.setAttribute("consulta", consulta);
		
		request.getRequestDispatcher("/vistaAgregarConsulta.jsp").forward(request ,response);
	
	} catch (Exception e) {
		response.sendError(500, "la consulta ya existe en la base de datos.");
	}

	}
}
