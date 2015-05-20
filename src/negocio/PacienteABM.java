package negocio;

import dao.PacienteDao;
import datos.Paciente;

public class PacienteABM {
	
	PacienteDao dao=new PacienteDao();
	
	//metodos
	
	//traer Paciente por ID
	public Paciente traerPacientePorId(int idPaciente)throws Exception{
		
		Paciente p= dao.traerPacientePorId(idPaciente);
		
		if(p==null) throw new Exception("Paciente no Encontrado.");
	
	return p;
	}
	
	//traer Paciente por DNI
	public Paciente traerPacientePorDni(int dni)throws Exception{
		
		Paciente p= dao.traerPacientePorDni(dni);
		
		if(p==null) throw new Exception("Paciente no Encontrado");
	
	return p;
	}

	//modificar Paciente
	@SuppressWarnings("null")
	public void modificar(Paciente p) throws Exception{
		
		if (p!=null){
			dao.modificarPaciente(p);
		}
			
		else{
			throw new Exception("Paciente DNI: " +p.getDniPaciente()+ " no existe para modificar.");
		}
	}

}

