package test;

import negocio.PacienteABM;
import datos.Paciente;


public class traerPaciente {

	public static void main(String[] args) {
		
		PacienteABM pacAbm=new PacienteABM();
		
		
		//traer paciente por id
		try{
			
		Paciente p = pacAbm.traerPacientePorId(100000);
		System.out.println(p);
		
		}catch (Exception e){
			
		}
		
		System.out.print("\n------------------------------\n");
		
		//traer paciente por dni
		try{
		int dni=22222222;
		Paciente p = pacAbm.traerPacientePorDni(dni);
		System.out.println(p);
		
			
		}catch (Exception e){
			
		}
		
	
	}

}
