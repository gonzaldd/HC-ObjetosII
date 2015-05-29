package test;

import java.util.GregorianCalendar;

import negocio.LoginABM;
import datos.Login;
import datos.Paciente;

public class testTraerLogin {

	
	public static void main (String[] args) {
		
		
		LoginABM login = new LoginABM ();
		
		
		try {

			int usuario = 2221;
			String claveLogin = "abd2222";
			Login objeto =login.usuarioValido(usuario);

			if(objeto != null){			
					if(login.passValida(claveLogin, objeto))System.out.println("Usuario logueado");
					else System.out.println("Contraseña incorrecta");
			}else System.out.println("No existe el usuario");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
