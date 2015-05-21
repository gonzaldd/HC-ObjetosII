package datos;

public class Usuario {

	private int idUsuario;
	private Login login; 
	private String nombreUsuario;
	private String apellidoUsuario;
	private int dniUsuario;
	private Profesional profesional;

	
	  public Usuario () {}


	public Usuario(String nombreUsuario, String apellidoUsuario, int dniUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.dniUsuario = dniUsuario;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getApellidoUsuario() {
		return apellidoUsuario;
	}


	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}


	public int getDniUsuario() {
		return dniUsuario;
	}


	public void setDniUsuario(int dniUsuario) {
		this.dniUsuario = dniUsuario;
	}


	public Profesional getProfesional() {
		return profesional;
	}


	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}
	
	
	
	

}
