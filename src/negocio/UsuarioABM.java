package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.UsuarioDao;
import datos.Login;
import datos.Profesional;
import datos.Usuario;

public class UsuarioABM {
	
	UsuarioDao dao=new UsuarioDao();
	
	//metodos
	
	//alta nuevo usuario
	public int agregarUsuario(int idLogin, String nombreUsuario, String apellidoUsuario, int dniUsuario, int idProfesional) throws Exception{
		
		Usuario u = new Usuario(nombreUsuario, apellidoUsuario, dniUsuario);
		LoginABM login = new LoginABM(); 
		ProfesionalABM profesional = new ProfesionalABM();
		Login l= new Login();
		
		u.setLogin(login.traerLogin(l.getIdLogin()));//traer nuevo login por id
	
		u.setProfesional(profesional.traerProfesional(idProfesional));
		
	return dao.agregarUsuario(u);
	}

	//modificar usuario
	@SuppressWarnings("null")
	public void modificarUsuario(Usuario u) throws Exception{
		
		if (u!=null){
			dao.modificarUsuario(u);
		}
			
		else{
			throw new Exception("Cliente DNI: " +u.getIdUsuario()+ " no existe para modificar.");
		}
	}
	
	
	
}