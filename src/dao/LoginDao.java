package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.ContactoPaciente;
import datos.ContactoProfesional;
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
	
	//modificar Login
	public void modificarLogin(Login objeto) throws HibernateException {
		
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		
		} finally {
			session.flush();
			session.close();
		}
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
	
	
	public Login traerLogin(int idLogin) throws HibernateException {
		Login objeto = null;

		try {
			iniciaOperacion();
			objeto = (Login) session.get(Login.class, idLogin);

		} finally {
			session.close();
		}
	
	return objeto;
	}
	
	/*public ContactoProfesional traerMail (String mailProfesional) throws HibernateException {
		ContactoProfesional contactoProfesional= null;
		
		try {
			iniciaOperacion();
			contactoProfesional = (ContactoProfesional) session.get(ContactoProfesional.class, mailProfesional);
			
		} finally {
			session.close();
		}
		
		
		
		return contactoProfesional;
		
		
	}
	*/
	
	
	public int agregarLogin(Login objeto){
		
		int id=0;
		
		try{
			iniciaOperacion();
			id=Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		
		} catch(HibernateException he){
			manejaExcepcion(he);
			throw he;
		
		}finally{
			session.close();
		}
	
		return id;	
	}
	
}
