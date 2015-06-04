package controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.CategoriaDeConsultaABM;
import datos.categoriaDeConsulta;

public class ControladorMostrarListaCategorias extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		try {
			CategoriaDeConsultaABM categoriaabm=new CategoriaDeConsultaABM();
			List<categoriaDeConsulta> categoria=categoriaabm.traerCategoria();
			request.setAttribute("categoria", categoria);
			request.getRequestDispatcher("/vistaCategoria.jsp").forward(request ,response);
		
		} catch (Exception e) {
			response.sendError(500, "la IDcategoria Ingresada no existe en la base de datos.");
		}
	}
}
