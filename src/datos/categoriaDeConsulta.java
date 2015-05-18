package datos;

import java.util.Set;

public class CategoriaDeConsulta {

	private int idCategoriaDeConsulta;
	private String nombreCategoriaDeConsulta;
	private Set<Consulta> consultas;

	public CategoriaDeConsulta(){}

	public CategoriaDeConsulta(String nombreCategoriaDeConsulta) {
		super();
		this.nombreCategoriaDeConsulta = nombreCategoriaDeConsulta;
	}
	
	public int getIdCategoriaDeConsulta() {
		return idCategoriaDeConsulta;
	}


	public void setIdCategoriaDeConsulta(int idCategoriaDeConsulta) {
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
		
		return this.nombreCategoriaDeConsulta;
	}	
	
	
	
}
