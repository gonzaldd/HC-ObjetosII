package datos;



public class Profesional {

	  private int idProfesional;
	  private Especialidad especialidad;
	  private int matriculaProfesional;
	  private boolean activoProfesional;
	  private Usuario usuario;
	  
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


	@Override
	public String toString() {
		return "Profesional [idProfesional=" + idProfesional
				+ ", especialidad=" + especialidad + ", matriculaProfesional="
				+ matriculaProfesional + ", activoProfesional="
				+ activoProfesional + "]";
	}



	  
	  
	
	
}
