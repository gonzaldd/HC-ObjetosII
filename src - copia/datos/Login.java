package datos;

import java.util.GregorianCalendar;


public class Login {
	  private int idLogin;
	  private int usuarioLogin;
	  private String claveLogin;
	  private GregorianCalendar ultimoIngresoLogin;
	  private GregorianCalendar ultimoCambioClaveLogin;
	  private int tipoUsuario;
	  private boolean activoLogin;
	  private Usuario usuario;
	  
	  public Login () {}

	public Login(int usuarioLogin, String claveLogin,GregorianCalendar ultimoIngresoLogin,GregorianCalendar ultimoCambioClaveLogin,
			int tipoUsuario, boolean activoLogin) {
		super();
		this.usuarioLogin = usuarioLogin;
		this.claveLogin = claveLogin;
		this.ultimoIngresoLogin = ultimoIngresoLogin;
		this.ultimoCambioClaveLogin = ultimoCambioClaveLogin;
		this.tipoUsuario = tipoUsuario;
		this.activoLogin = activoLogin;
	}

	public int getIdLogin() {
		return idLogin;
	}

	private void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	public int getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(int usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public String getClaveLogin() {
		return claveLogin;
	}

	public void setClaveLogin(String claveLogin) {
		this.claveLogin = claveLogin;
	}

	public GregorianCalendar getUltimoIngresoLogin() {
		return ultimoIngresoLogin;
	}

	public void setUltimoIngresoLogin(GregorianCalendar ultimoIngresoLogin) {
		this.ultimoIngresoLogin = ultimoIngresoLogin;
	}

	public GregorianCalendar getUltimoCambioClaveLogin() {
		return ultimoCambioClaveLogin;
	}

	public void setUltimoCambioClaveLogin(GregorianCalendar ultimoCambioClaveLogin) {
		this.ultimoCambioClaveLogin = ultimoCambioClaveLogin;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public boolean getActivoLogin() {
		return activoLogin;
	}

	public void setActivoLogin(boolean activoLogin) {
		this.activoLogin = activoLogin;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	  
	  
}