package datos;

import java.util.GregorianCalendar;

public class ContactoPaciente {

	private int idPaciente;
	private String telefonoPaciente;
	private String direccionPaciente;
	private String mailPaciente;
	private GregorianCalendar fechaDeNacimientoPaciente;
	private String nacionalidadPaciente;
	
	public ContactoPaciente() {}
	
	public ContactoPaciente(String telefono, String direccion, String mail, GregorianCalendar fechaDeNacimiento, String nacionalidad) {
		super();
		this.telefonoPaciente = telefono;
		this.direccionPaciente = direccion; 
		this.mailPaciente = mail;
		this.fechaDeNacimientoPaciente = fechaDeNacimiento;
		this.nacionalidadPaciente= nacionalidad;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	private void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTelefonoPaciente() {
		return telefonoPaciente;
	}

	public void setTelefonoPaciente(String telefonoPaciente) {
		this.telefonoPaciente = telefonoPaciente;
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}

	public String getMailPaciente() {
		return mailPaciente;
	}

	public void setMailPaciente(String mailPaciente) {
		this.mailPaciente = mailPaciente;
	}

	public GregorianCalendar getFechaDeNacimientoPaciente() {
		return fechaDeNacimientoPaciente;
	}

	public void setFechaDeNacimientoPaciente(
			GregorianCalendar fechaDeNacimientoPaciente) {
		this.fechaDeNacimientoPaciente = fechaDeNacimientoPaciente;
	}

	public String getNacionalidadPaciente() {
		return nacionalidadPaciente;
	}

	public void setNacionalidadPaciente(String nacionalidadPaciente) {
		this.nacionalidadPaciente = nacionalidadPaciente;
	}

}