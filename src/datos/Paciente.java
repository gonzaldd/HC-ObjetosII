package datos;

import java.util.Set;

public class Paciente {
	
	private int idPaciente;
	private String nombrePaciente;
	private String apellidoPaciente;
	private boolean activoPaciente;
	private int dniPaciente;
	private ContactoPaciente contacto;
	private Set<Consulta> consultas;

	public Paciente() {}

	public Paciente(String nombrePaciente, String apellidoPaciente,boolean activoPaciente, int dniPaciente) {
		super();
		this.nombrePaciente = nombrePaciente;
		this.apellidoPaciente = apellidoPaciente;
		this.activoPaciente = activoPaciente;
		this.dniPaciente = dniPaciente;
	}
	
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getApellidoPaciente() {
		return apellidoPaciente;
	}
	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}
	public boolean isActivoPaciente() {
		return activoPaciente;
	}
	public void setActivoPaciente(boolean activoPaciente) {
		this.activoPaciente = activoPaciente;
	}
	public int getDniPaciente() {
		return dniPaciente;
	}
	public void setDniPaciente(int dniPaciente) {
		this.dniPaciente = dniPaciente;
	}
	
	public Set<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(Set<Consulta> consultas) {
		this.consultas = consultas;
	}

	public ContactoPaciente getContacto() {
		return contacto;
	}

	public void setContacto(ContactoPaciente contacto) {
		this.contacto = contacto;
	}

	
}
