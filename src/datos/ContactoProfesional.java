package datos;

import java.util.GregorianCalendar;

public class ContactoProfesional {
	
	private int idProfesional;
	private String telefonoProfesional;
	private String direccionProfesional;
	private String mailProfesional;
	private GregorianCalendar fechaDeNacimiento;
	
	public ContactoProfesional() {}
	
	public ContactoProfesional(String telefono, String direccion, String mail, GregorianCalendar fechaDeNacimiento) {
		super();
		this.telefonoProfesional = telefono;
		this.direccionProfesional = direccion; 
		this.mailProfesional = mail;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	private void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getTelefonoProfesional() {
		return telefonoProfesional;
	}

	public void setTelefonoProfesional(String telefonoProfesional) {
		this.telefonoProfesional = telefonoProfesional;
	}

	public String getDireccionProfesional() {
		return direccionProfesional;
	}

	public void setDireccionProfesional(String direccionProfesional) {
		this.direccionProfesional = direccionProfesional;
	}

	public String getMailProfesional() {
		return mailProfesional;
	}

	public void setMailProfesional(String mailProfesional) {
		this.mailProfesional = mailProfesional;
	}

	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
