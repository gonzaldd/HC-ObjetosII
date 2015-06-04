package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Consulta;
import datos.Usuario;

public class UsuarioDao {
	
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

	
	//alta nuevo usuario
	public int agregarUsuario(Usuario objeto) {
		
		int id = 0;
		
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		
		} finally {
			session.close();
		}
	return id;
	}
	
	
	public void modificarUsuario(Usuario objeto) throws HibernateException {
		
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
	
	

	public Usuario traerUsuario(int idLogin) throws HibernateException {
		Usuario objeto = null;

		try {
			iniciaOperacion();
			objeto = (Usuario) session.get(Usuario.class, idLogin);

		} finally {
			session.close();
		}
		
	return objeto;
	}
	
	
}
