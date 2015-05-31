package negocio;


import java.util.GregorianCalendar;

import dao.LoginDao;
import datos.Consulta;
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
	
	
	public Login traerLogin(int idLogin)throws Exception{
		
		Login c= dao.traerLogin(idLogin);
		
		if(c==null) throw new Exception("Login no existe.");
		
	return c;
	}
	
	
	public int agregarLogin( int usuarioLogin, String claveLogin,GregorianCalendar ultimoIngresoLogin,GregorianCalendar ultimoCambioClaveLogin,
			int tipoUsuario,boolean activoLogin) throws Exception{
		
		Login l = new Login(usuarioLogin, claveLogin, ultimoIngresoLogin, ultimoCambioClaveLogin,tipoUsuario, activoLogin);
		
		if(dao.traerLogin(usuarioLogin)!= null){
			
			throw new Exception("Logueo ya existe");
		}
		
	return dao.agregarLogin(l);
	}
	
	
}
