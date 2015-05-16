package datos;
import java.util.GregorianCalendar;

public class Consulta {

	private int idConsulta;
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

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
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
	
	
	
	
}
