package test;

import java.util.GregorianCalendar;

import negocio.ConsultaABM;
import negocio.UsuarioABM;


public class testAltaUsuario {

	public static void main(String[] args) {
		
		UsuarioABM abm=new UsuarioABM();
		

		try {
			
			abm.agregarUsuario(1, "nombreUsuario",  "apellidoUsuario", 90909090, 2);
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

		

	}

}
