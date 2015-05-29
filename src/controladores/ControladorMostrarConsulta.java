package controladores;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.ConsultaABM;
import datos.Consulta;

public class ControladorMostrarConsulta extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sesion = request.getSession();
		
		if(sesion.getAttribute("usuario") != null){
		
		try {
			int idConsulta = Integer.parseInt(request.getParameter("idConsulta"));
			ConsultaABM consultaabm=new ConsultaABM();
			Consulta consulta=consultaabm.traerConsulta(idConsulta);
			request.setAttribute("consulta", consulta);
			request.getRequestDispatcher("/vistaConsulta.jsp").forward(request ,response);
		
		} catch (Exception e) {
			response.sendError(500, "la idConsulta Ingresada no existe en la base de datos.");
		}
	}else response.sendRedirect("/HC/logueo.jsp");
	}
}
