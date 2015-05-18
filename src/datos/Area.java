package datos;
import java.util.Set;

public class Area {
	
	private int idArea;
	private String nombreArea;
	private String descripcionArea;
	private Set<Especialidad> especialidades;
	
	public Area() {}
	
	public Area(String nombre, String descripcion) {
		super();
		this.nombreArea = nombre;
		this.descripcionArea = descripcion; 
	}

	public int getIdArea() {
		return idArea;
	}

	private void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getDescripcionArea() {
		return descripcionArea;
	}

	public void setDescripcionArea(String descripcionArea) {
		this.descripcionArea = descripcionArea;
	}

	public Set<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Set<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	
	
}
