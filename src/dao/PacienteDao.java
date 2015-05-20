package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Paciente;

public class PacienteDao {
	
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException {
		
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	//modificar Paciente
	public void modificarPaciente(Paciente objeto) throws HibernateException {
		
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		
		} finally {
			session.close();
		}
	}

	//traer Paciente por id
	public Paciente traerPacientePorId(int idPaciente) throws HibernateException {
		Paciente objeto = null;

		try {
			iniciaOperacion();
			objeto = (Paciente) session.get(Paciente.class, idPaciente);

		} finally {
			session.close();
		}
	
	return objeto;
	}
	
	//traer Paciente por dni 
	public Paciente traerPacientePorDni(int dni) throws HibernateException {
		
		Paciente objeto = null;
		
		try {
			iniciaOperacion();
			objeto = (Paciente) session.createQuery("from Paciente p where p.dniPaciente ="+ Integer.toString(dni)).uniqueResult();

		} finally {
			session.close();
		}
	
	return objeto;
	}


}
