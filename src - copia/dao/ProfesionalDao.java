package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Profesional;

public class ProfesionalDao {
	
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

	//modificar Profesional
	public void modificarProfesional(Profesional objeto) throws HibernateException {
		
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

	//traer Profesional por id
	public Profesional traerProfesional(int idProfesional) throws HibernateException {
		Profesional objeto = null;

		try {
			iniciaOperacion();
			objeto = (Profesional) session.get(Profesional.class, idProfesional);

		} finally {
			session.close();
		}
	
	return objeto;
	}
}
