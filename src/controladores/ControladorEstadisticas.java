package controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.CategoriaDeConsultaABM;
import negocio.ConsultaABM;
import datos.categoriaDeConsulta;

public class ControladorEstadisticas extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}


	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		try {
			CategoriaDeConsultaABM categoriaabm=new CategoriaDeConsultaABM();
			ConsultaABM consulta = new ConsultaABM();
			List<categoriaDeConsulta> lista = categoriaabm.traerCategoria();
			int[] array = new int[lista.size()];
			int i = 0;
			for(categoriaDeConsulta categoria:lista){
				array[i] = consulta.traerCantConsulta(categoria.getIdCategoriaDeConsulta());
				i++;
			}
			
			request.setAttribute("valor", array);
			request.setAttribute("categoria", lista);
			request.getRequestDispatcher("/vistaEstadistica.jsp").forward(request ,response);
		
		} catch (Exception e) {
			response.sendError(500, "Ocurrio un problema al traer el listado.");
		}
	}
}