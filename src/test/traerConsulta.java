package test;

import negocio.ConsultaABM;
import datos.Consulta;


public class traerConsulta {
	
	

	public static void main(String[] args) {
		
		
		
		ConsultaABM consulta = new ConsultaABM();
		
		try{
			
		Consulta c = consulta.traerConsulta(1);
		System.out.println(c);
		
		
		}catch (Exception e){
			
		}
		
		

	}

}
