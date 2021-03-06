package datos;
import java.util.Set;

public class Especialidad {
	
	private int idEspecialidad;
	private Area area;
	private Set<Profesional> profesional;
	private String nombreEspecialidad;
	private String descripcionEspecialidad;
	
	public Especialidad() {}
	
	public Especialidad(String nombre, String descripcion) {
		super();
		this.nombreEspecialidad = nombre;
		this.descripcionEspecialidad = descripcion; 
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	private void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Set<Profesional> getProfesional() {
		return profesional;
	}

	public void setProfesional(Set<Profesional> profesional) {
		this.profesional = profesional;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getDescripcionEspecialidad() {
		return descripcionEspecialidad;
	}

	public void setDescripcionEspecialidad(String descripcionEspecialidad) {
		this.descripcionEspecialidad = descripcionEspecialidad;
	}


	
	
}
