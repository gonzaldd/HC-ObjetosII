package negocio;

import dao.ProfesionalDao;
import datos.Profesional;

public class ProfesionalABM {
	
	ProfesionalDao dao=new ProfesionalDao();
	
	//metodos
	
	//traer Profesional por ID
	public Profesional traerProfesional(int idProfesional)throws Exception{
		
		Profesional p= dao.traerProfesional(idProfesional);
		
		if(p==null) throw new Exception("Profesional no Encontrado.");
	
	return p;
	}
	
	
	//modificar Profesional
	@SuppressWarnings("null")
	public void modificarProfesional(Profesional p) throws Exception{
		
		if (p!=null){
			dao.modificarProfesional(p);
		}
			
		else{
			throw new Exception("Paciente DNI: " +p.getIdProfesional()+ " no existe para modificar.");
		}
	}

}

