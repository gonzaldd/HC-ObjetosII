package negocio;


import java.util.GregorianCalendar;

import dao.LoginDao;
import datos.Consulta;
import datos.Login;
import datos.Paciente;
import datos.Usuario;

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
	
	public Login cambiarClave(Login usuario, String passNueva){
		GregorianCalendar horarioCambioNuevo = new GregorianCalendar();
		usuario.setUltimoCambioClaveLogin(horarioCambioNuevo);
		usuario.setClaveLogin(passNueva);

		dao.modificarLogin(usuario);

		return usuario;
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
	
	
	//modificar Login
	@SuppressWarnings("null")
	public void modificar(Login l) throws Exception{
		
		if (l!=null){
			dao.modificarLogin(l);
		}
			
		else{
			throw new Exception("Usuario: " +l.getUsuarioLogin()+ " no existe para modificar.");
		}
	}
	
	
}
