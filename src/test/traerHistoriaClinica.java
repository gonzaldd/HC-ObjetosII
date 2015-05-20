package test;

import java.util.List;

import negocio.ConsultaABM;
import negocio.PacienteABM;
import datos.Paciente;
import datos.Consulta;

public class traerHistoriaClinica {

	public static void main(String[] args) {

		PacienteABM pacAbm=new PacienteABM();
		ConsultaABM consulta = new ConsultaABM();
		
		try{
			int dni=22222222;
			Paciente p = pacAbm.traerPacientePorDni(dni);
			System.out.println(p);		
		
			List<Consulta> c = consulta.traerConsulta1(p.getIdPaciente());
			for(Consulta o: c){System.out.println(o);}
		}catch (Exception e){}

	}

}
