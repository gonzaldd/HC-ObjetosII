package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Login;
import datos.Paciente;

public class LoginDao {
	
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
	
	public Login usuarioValido(int usuario) throws HibernateException {
		
		Login objeto = null;
		
		try {
			iniciaOperacion();
			objeto = (Login)session.createQuery("from Login where usuarioLogin = "+Integer.toString(usuario)).uniqueResult();

		}catch(HibernateException he){
			manejaExcepcion(he);
			throw he;
		
		}finally {
			session.close();
		}
		
		return objeto;
	
	}
	
	

}
