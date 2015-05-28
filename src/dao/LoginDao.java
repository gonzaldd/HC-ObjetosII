package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Login;


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
	
	
	//traer login por usuarioy contraseña
	
	public Login loginValido (int usuarioLogin/*, String claveLogin*/) throws HibernateException {
		
		Login l = null;
		
		try {
			iniciaOperacion();
			l = (Login)session.createQuery("from Login l where l.usuarioLogin ="+
			Integer.toString(usuarioLogin)); /*+
			"and l.claveLogin = " +
			(claveLogin));*/
			
			
			
		} finally {
			session.close();
		}
		return l;
		
		
		
		
	}
	
	
	
}
