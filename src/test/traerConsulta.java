package test;

import java.util.GregorianCalendar;
import negocio.ConsultaABM;
import datos.Consulta;
import datos.Funciones;
import datos.Paciente;



import java.util.List;


public class traerConsulta {
	
	

	public static void main(String[] args) {
		
		
		
		ConsultaABM consulta = new ConsultaABM();
		GregorianCalendar fechaDesde = new GregorianCalendar(2009,1,23);
		GregorianCalendar fechaHasta = new GregorianCalendar(2015,2,22);
		
		try{
			
		/*Consulta c = consulta.traerConsulta(1);
		System.out.println(c);
		
		List<Consulta> lista = consulta.traerConsulta1(1);
		for (Consulta o: lista) {System.out.println(o);}
		
		lista = consulta.traerConsulta(fechaDesde, fechaHasta);
		for (Consulta o: lista) {System.out.println(o);}*/
		List<Consulta> lista;
		
		Paciente paciente = new Paciente();
		paciente.setIdPaciente(1);
		
		lista = consulta.traerConsulta(paciente,fechaDesde, fechaHasta);
		for (Consulta o: lista) {System.out.println(o);}
		
		
		}catch (Exception e){
			
		}
		
		

	}

}
