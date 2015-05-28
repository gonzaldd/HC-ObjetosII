package test;

import negocio.LoginABM;
import datos.Login;

public class testTraerLogin {

	
	public static void main (String[] args) {
		
		
		LoginABM login = new LoginABM ();
		
		
		try {

			int usuarioLogin = 1111;
			String claveLogin = "abc1111";

			Login log = login.loginValido(usuarioLogin);
			System.out.println(log);
			
			
			
		} catch (Exception e) {
			
		}
		
		
	}
	
}
