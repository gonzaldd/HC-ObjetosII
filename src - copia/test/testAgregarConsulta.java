package test;

import java.util.GregorianCalendar;
import negocio.ConsultaABM;


public class testAgregarConsulta {

	public static void main(String[] args) {
		
		GregorianCalendar fechaHoy=new GregorianCalendar();
		String diagnostico="resfrio fuerte";
		
		ConsultaABM abm=new ConsultaABM();
		

		try {
	
			abm.agregarConsulta(1,1,1,fechaHoy, diagnostico);
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

		

	}

}
