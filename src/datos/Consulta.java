package datos;
import java.util.GregorianCalendar;

public class Consulta {

	private int idConsulta;
	private Paciente paciente;
	//private Profesional idProfesional;
	private categoriaDeConsulta categoriaDeConsulta;
	private GregorianCalendar fechaDeAtencion;
	private String diagnostico; //VER EQUIVALENTE A VARCHAR
	
	
	public Consulta(){}

	public Consulta(GregorianCalendar fechaDeAtencion, String diagnostico) {
		super();
		this.fechaDeAtencion = fechaDeAtencion;
		this.diagnostico = diagnostico;
	}


	public int getIdConsulta() {
		return idConsulta;
	}

	private void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public categoriaDeConsulta getCategoriaDeConsulta() {
		return categoriaDeConsulta;
	}

	public void setCategoriaDeConsulta(categoriaDeConsulta categoriaDeConsulta) {
		this.categoriaDeConsulta = categoriaDeConsulta;
	}

	public GregorianCalendar getFechaDeAtencion() {
		return fechaDeAtencion;
	}

	public void setFechaDeAtencion(GregorianCalendar fechaDeAtencion) {
		this.fechaDeAtencion = fechaDeAtencion;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		
		return "ID: "+this.idConsulta+"\nFecha: "+ Funciones.traerFechaCorta(getFechaDeAtencion())+"\nDiagnostico: "+this.diagnostico;
	}
	
	
	
	
}
