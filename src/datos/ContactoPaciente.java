package datos;

import java.util.GregorianCalendar;

public class ContactoPaciente {

	private int idPaciente;
	private String telefono;
	private String direccion;
	private String mail;
	private GregorianCalendar fechaDeNacimiento;
	
	public ContactoPaciente() {}
	
	public ContactoPaciente(String telefono, String direccion, String mail, GregorianCalendar fechaDeNacimiento) {
		super();
		this.telefono = telefono;
		this.direccion = direccion; 
		this.mail = mail;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	private void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
