package test;

import java.util.List;

import negocio.ConsultaABM;
import negocio.CategoriaDeConsultaABM;
import datos.categoriaDeConsulta;

public class testTraerDatosEstadisticos {

	
	public static void main(String[] args) {
		
		ConsultaABM consulta = new ConsultaABM();
		CategoriaDeConsultaABM categoria = new CategoriaDeConsultaABM();
		
		List<categoriaDeConsulta> lista = categoria.traerCategoria();
		for(categoriaDeConsulta o: lista){
			System.out.println(o);
			System.out.println(consulta.traerCantConsulta(o.getIdCategoriaDeConsulta()));
			}

	}

}
