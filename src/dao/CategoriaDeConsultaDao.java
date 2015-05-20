package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.categoriaDeConsulta;


public class CategoriaDeConsultaDao {
	
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

	//modificar
	public void modificarCategoriaConsulta(categoriaDeConsulta objeto) throws HibernateException {
		
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

	//traer categoria consulta por id
	public categoriaDeConsulta traerCategoria(int idCategoriaDeConsulta) throws HibernateException {
		categoriaDeConsulta objeto = null;

		try {
			iniciaOperacion();
			objeto = (categoriaDeConsulta) session.get(categoriaDeConsulta.class, idCategoriaDeConsulta);

		} finally {
			session.close();
		}
	
	return objeto;
	}
	
	//traer listado de categorias
	@SuppressWarnings("unchecked")
	public List<categoriaDeConsulta> traerCategoria() throws HibernateException {
		
		List<categoriaDeConsulta> lista=null;

		try {
			iniciaOperacion();
			lista=session.createQuery("from categoriaDeConsulta c order by c.idCategoriaDeConsulta asc").list();
		
		} finally {
			session.close();
		}

	return lista;
	}
}
