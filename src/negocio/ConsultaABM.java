package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;

import dao.ConsultaDao;
import datos.Consulta;
import datos.Paciente;
import datos.categoriaDeConsulta;
import negocio.PacienteABM;
import negocio.ProfesionalABM;
import negocio.CategoriaDeConsultaABM;


public class ConsultaABM {
	
	ConsultaDao dao=new ConsultaDao();
	
	//metodos
	
	//traer consulta por id
	
	public Consulta traerConsulta(int idConsulta)throws Exception{
		
		Consulta c= dao.traerConsulta(idConsulta);
		
		if(c==null) throw new Exception("Consulta no existe.");
		
	return c;
	}
	
	//traer consulta por dni paciente
	
	public Consulta traerConsulta(Paciente p)throws Exception{
		
		Consulta c= dao.traerConsulta(p.getDniPaciente());
		
		if(c==null) throw new Exception("Consulta no existe.");
	
	return c;
	}
	
	public List<Consulta> traerConsulta1(int id)throws Exception{
		
		List<Consulta> c= dao.traerConsulta1(id);
		
		if(c==null) throw new Exception("Consulta no existe.");
	
	return c;
	}

	//modificar consulta
	@SuppressWarnings("null")
	public void modificar(Consulta c) throws Exception{
		
		if (c!=null){
			dao.modificarConsulta(c);
		}
			
		else{
			throw new Exception("Consulta id: " +c.getIdConsulta()+ " no existe para modificar.");
		}
	
	}

	//traer listado de consultas por fecha
	
	//Tengo q revisar la implmentacion de este metodo, para q reste las fechas!!
	public List<Consulta> traerConsulta(GregorianCalendar fechaDesde, GregorianCalendar fechaHasta){
		
	return dao.traerConsulta(fechaDesde, fechaHasta);
	
	}
	
	public List<Consulta> traerConsulta(Paciente paciente,GregorianCalendar fechaDesde, GregorianCalendar fechaHasta){
		
		return dao.traerConsulta(paciente,fechaDesde, fechaHasta);
		
		}
	
	//Devuelve la cantidad de consultas por idCategoriaDeConsulta
	public int traerCantConsulta(int idCategoria) throws HibernateException {
			
		
		return dao.traerCantidadConsulta(idCategoria);
	}
	
	//agregar consulta a un paciente
	public int agregarConsulta( int idPaciente, int idCategoriaDeConsulta,int idProfesional, GregorianCalendar fechaDeAtencion, String diagnostico) throws Exception{
		
		Consulta c = new Consulta(fechaDeAtencion, diagnostico);
		CategoriaDeConsultaABM categoria = new CategoriaDeConsultaABM(); 
		PacienteABM paciente = new PacienteABM();
		ProfesionalABM profesional = new ProfesionalABM();
		
		c.setCategoriaDeConsulta(categoria.traerCategoria(idCategoriaDeConsulta));
		c.setPaciente(paciente.traerPacientePorId(idPaciente));
		c.setProfesional(profesional.traerProfesional(idProfesional));
		
		/*int idConsulta= c.getIdConsulta(); 
		
		if(dao.traerConsulta(idConsulta)!= null){
			
			throw new Exception("Consulta ya existe");
		}*/
		
		//PREGUNTAR SI ES ASI, ALTO ACOPLAMIENTO!!!
		
	return dao.agregarConsulta(c);
	}
	
	public List<Consulta> traerConsulta(){
		
		return dao.traerConsulta();}
	
	public int[] devolverCantidad(List<categoriaDeConsulta> lista){
		
		int[] array = new int[lista.size()];
		int i = 0;
		for(categoriaDeConsulta categoria:lista){
			array[i] = dao.traerCantidadConsulta(categoria.getIdCategoriaDeConsulta());
			i++;
		}
		
	return array;
	}
	
	
	//fijarse en cliente traer listado de clientes y contarlos con un for, pero lo hago para consultas!!!
	
	
	/*
	public int cantidadTotalDeConsultas(){
		int cont=0;
		
		
		while(consulta !=null){
			
			cont++;
		}
		return cont;
			
		}
	}
	*/
}

