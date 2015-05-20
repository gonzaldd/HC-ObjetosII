package datos;

import java.util.Set;

public class categoriaDeConsulta {

	private int idCategoriaDeConsulta;
	private String nombreCategoriaDeConsulta;
	private Set<Consulta> consultas;

	public categoriaDeConsulta(){}

	public categoriaDeConsulta(String nombreCategoriaDeConsulta) {
		super();
		this.nombreCategoriaDeConsulta = nombreCategoriaDeConsulta;
	}
	
	public int getIdCategoriaDeConsulta() {
		return idCategoriaDeConsulta;
	}


	private void setIdCategoriaDeConsulta(int idCategoriaDeConsulta) {
		this.idCategoriaDeConsulta = idCategoriaDeConsulta;
	}


	public String getNombreCategoriaDeConsulta() {
		return nombreCategoriaDeConsulta;
	}


	public void setNombreCategoriaDeConsulta(String nombreCategoriaDeConsulta) {
		this.nombreCategoriaDeConsulta = nombreCategoriaDeConsulta;
	}


	public Set<Consulta> getConsultas() {
		return consultas;
	}


	public void setConsultas(Set<Consulta> consultas) {
		this.consultas = consultas;
	}

	@Override
	public String toString() {
		
		return "Categoria ID: "+this.idCategoriaDeConsulta+ "\nNombre: "+ this.nombreCategoriaDeConsulta;
	}	
	
	
	
}
