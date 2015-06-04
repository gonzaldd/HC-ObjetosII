package test;

import negocio.CategoriaDeConsultaABM;
import datos.categoriaDeConsulta;


public class traerCategoriaDeConsulta {

	public static void main(String[] args) {
		
		CategoriaDeConsultaABM catAbm=new CategoriaDeConsultaABM();
		
		
		//traer categoria por id
		try{
			
		categoriaDeConsulta c = catAbm.traerCategoria(1);
		System.out.println(c);
		
		}catch (Exception e){
			
		}
		
		System.out.print("\n------------------------------\n");
		
		
		//traer listado de categorias
		try{
		System.out.print("Listado de categorias:\n");
		for(categoriaDeConsulta c: catAbm.traerCategoria()){
		System.out.println(c+ "\n");
		}
		
		}catch (Exception e){
		
		}
		
		
	}

}
