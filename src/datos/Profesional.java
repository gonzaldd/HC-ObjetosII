package datos;

import java.util.Set;



public class Profesional {

	  private int idProfesional;
	  private Especialidad especialidad;
	  private int matriculaProfesional;
	  private boolean activoProfesional;
	  private Usuario usuario;
	  private ContactoProfesional contactoProfesional;
		private Set<Consulta> consultas;
	  
	  public Profesional() {}
	  
	  
	public Profesional(int matriculaProfesional, boolean activoProfesional) {
		
		this.matriculaProfesional = matriculaProfesional;
		this.activoProfesional = activoProfesional;
	}


	public int getIdProfesional() {
		return idProfesional;
	}


	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}




	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	public int getMatriculaProfesional() {
		return matriculaProfesional;
	}


	public void setMatriculaProfesional(int matriculaProfesional) {
		this.matriculaProfesional = matriculaProfesional;
	}


	public boolean isActivoProfesional() {
		return activoProfesional;
	}


	public void setActivoProfesional(boolean activoProfesional) {
		this.activoProfesional = activoProfesional;
	}

	

	

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	


	public ContactoProfesional getContactoProfesional() {
		return contactoProfesional;
	}


	public void setContactoProfesional(ContactoProfesional contactoProfesional) {
		this.contactoProfesional = contactoProfesional;
	}

	
	

	public Set<Consulta> getConsultas() {
		return consultas;
	}


	public void setConsultas(Set<Consulta> consultas) {
		this.consultas = consultas;
	}


	@Override
	public String toString() {
		return "Profesional [idProfesional=" + idProfesional
				+ ", especialidad=" + especialidad + ", matriculaProfesional="
				+ matriculaProfesional + ", activoProfesional="
				+ activoProfesional + "]";
	}



	  
	  
	
	
}
