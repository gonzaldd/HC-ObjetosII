package test;

import negocio.ConsultaABM;
import datos.Consulta;
import datos.Paciente;


public class traerConsulta {
	
	

	public static void main(String[] args) {
		
		
		
		ConsultaABM consulta = new ConsultaABM();
		
		try{
			
		Consulta c = consulta.traerConsulta(1);
		System.out.println(c);
		Paciente p = c.getPaciente();
		System.out.println(p);
		
		
		}catch (Exception e){
			
		}
		
		

	}

}
