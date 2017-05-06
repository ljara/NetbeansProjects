/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Producto_compraDAO {
	public static Producto_compra loadProducto_compraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProducto_compraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra getProducto_compraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getProducto_compraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProducto_compraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra getProducto_compraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getProducto_compraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto_compra) session.load(orm.Producto_compra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra getProducto_compraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto_compra) session.get(orm.Producto_compra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_compra) session.load(orm.Producto_compra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra getProducto_compraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto_compra) session.get(orm.Producto_compra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_compra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryProducto_compra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_compra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryProducto_compra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra[] listProducto_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listProducto_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra[] listProducto_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listProducto_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_compra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Producto_compra as Producto_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto_compra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Producto_compra as Producto_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra[] listProducto_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto_compra(session, condition, orderBy);
			return (Producto_compra[]) list.toArray(new Producto_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra[] listProducto_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto_compra(session, condition, orderBy, lockMode);
			return (Producto_compra[]) list.toArray(new Producto_compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProducto_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProducto_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto_compra[] producto_compras = listProducto_compraByQuery(session, condition, orderBy);
		if (producto_compras != null && producto_compras.length > 0)
			return producto_compras[0];
		else
			return null;
	}
	
	public static Producto_compra loadProducto_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto_compra[] producto_compras = listProducto_compraByQuery(session, condition, orderBy, lockMode);
		if (producto_compras != null && producto_compras.length > 0)
			return producto_compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProducto_compraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateProducto_compraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_compraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateProducto_compraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_compraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Producto_compra as Producto_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProducto_compraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Producto_compra as Producto_compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto_compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra createProducto_compra() {
		return new orm.Producto_compra();
	}
	
	public static boolean save(orm.Producto_compra producto_compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().saveObject(producto_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Producto_compra producto_compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().deleteObject(producto_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Producto_compra producto_compra)throws PersistentException {
		try {
			if(producto_compra.getProducto() != null) {
				producto_compra.getProducto().producto_compra.remove(producto_compra);
			}
			
			if(producto_compra.getCompra() != null) {
				producto_compra.getCompra().producto_compra.remove(producto_compra);
			}
			
			return delete(producto_compra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Producto_compra producto_compra, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(producto_compra.getProducto() != null) {
				producto_compra.getProducto().producto_compra.remove(producto_compra);
			}
			
			if(producto_compra.getCompra() != null) {
				producto_compra.getCompra().producto_compra.remove(producto_compra);
			}
			
			try {
				session.delete(producto_compra);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Producto_compra producto_compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().refresh(producto_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Producto_compra producto_compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().evict(producto_compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto_compra loadProducto_compraByCriteria(Producto_compraCriteria producto_compraCriteria) {
		Producto_compra[] producto_compras = listProducto_compraByCriteria(producto_compraCriteria);
		if(producto_compras == null || producto_compras.length == 0) {
			return null;
		}
		return producto_compras[0];
	}
	
	public static Producto_compra[] listProducto_compraByCriteria(Producto_compraCriteria producto_compraCriteria) {
		return producto_compraCriteria.listProducto_compra();
	}
}
