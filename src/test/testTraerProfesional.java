package test;

import negocio.ProfesionalABM;
import datos.Profesional;

public class testTraerProfesional {

	public static void main(String[] args) {
		
		ProfesionalABM proAbm=new ProfesionalABM();
		
		
		//traer profesional por id
		try{
		int id= 1;	
		Profesional pro = proAbm.traerProfesional(id);
		System.out.println(pro);
		
		}catch (Exception e){
			
		}

	}

}
