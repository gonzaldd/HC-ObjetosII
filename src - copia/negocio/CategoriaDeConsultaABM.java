package negocio;

import java.util.List;
import dao.CategoriaDeConsultaDao;
import datos.categoriaDeConsulta;


public class CategoriaDeConsultaABM {
	
	CategoriaDeConsultaDao dao=new CategoriaDeConsultaDao();
	
	//metodos
	
	//traer categoria de consulta por id
	public categoriaDeConsulta traerCategoria(int idCategoriaDeConsulta)throws Exception{
		
		categoriaDeConsulta c= dao.traerCategoria(idCategoriaDeConsulta);
		
		if(c==null) throw new Exception("Categoria de Consulta no existe.");
		
	return c;
	}
	
	//traer listado de categorias
	public List<categoriaDeConsulta> traerCategoria(){
		
		return dao.traerCategoria();
	}

	//modificar categoria de consulta
	@SuppressWarnings("null")
	public void modificarCategoria(categoriaDeConsulta c) throws Exception{
		
		if (c!=null){
			dao.modificarCategoriaConsulta(c);;
		}
			
		else{
			throw new Exception("Categoria de Consulta id: " +c.getIdCategoriaDeConsulta()+ " no existe para modificar.");
		}
	
	}
}
