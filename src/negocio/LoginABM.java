package negocio;


import dao.LoginDao;
import datos.Login;

public class LoginABM {

	LoginDao dao = new LoginDao();
	
	
	public Login loginValido (int usuarioLogin/*, String claveLogin*/) throws Exception{
		

		
		Login log = dao.loginValido(usuarioLogin);
		
		if(log==null) throw new Exception ("Usuario o contraseña inválida");
		
		return log;
		
		
		
		
		
	}
	
	
}
