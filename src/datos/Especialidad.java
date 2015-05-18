package datos;

public class Especialidad {
	
	private int idEspecialidad;
	private int idArea;//preguntar como se plasta esto en java pq es un fk!!!!
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

	public int getIdArea() {
		return idArea;
	}

	private void setIdArea(int idArea) {//preguntar este tema de la fk!!!
		this.idArea = idArea;
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
