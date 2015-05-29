package negocio;


import dao.LoginDao;
import datos.Login;
import datos.Paciente;

public class LoginABM {

	LoginDao dao = new LoginDao();
	
	
	public Login usuarioValido (int usuario) throws Exception{
		
		Login logueo = dao.usuarioValido(usuario);
		return logueo;
		
	}
	
	public boolean passValida(String pass,Login usuario){
		boolean valido = false;
		if(usuario.getClaveLogin().equals(pass)){
				valido = true;
				}	
		return valido;
	}
	
	
}
