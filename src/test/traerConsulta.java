package test;

import negocio.ConsultaABM;
import datos.Consulta;
import datos.Paciente;


import java.util.List;


public class traerConsulta {
	
	

	public static void main(String[] args) {
		
		
		
		ConsultaABM consulta = new ConsultaABM();
		
		try{
			
		Consulta c = consulta.traerConsulta(1);
		System.out.println(c);
		
		List<Consulta> lista = consulta.traerConsulta1(2);
		for (Consulta o: lista) System.out.println(o);
		
		
		
		}catch (Exception e){
			
		}
		
		

	}

}
