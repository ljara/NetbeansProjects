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

public class CompraDAO {
	public static Compra loadCompraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadCompraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getCompraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadCompraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getCompraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Compra) session.load(orm.Compra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Compra) session.get(orm.Compra.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.load(orm.Compra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.get(orm.Compra.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Compra as Compra");
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
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy, lockMode);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy, lockMode);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Compra as Compra");
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
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra createCompra() {
		return new orm.Compra();
	}
	
	public static boolean save(orm.Compra compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().saveObject(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Compra compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().deleteObject(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Compra compra)throws PersistentException {
		try {
			if(compra.getPersona() != null) {
				compra.getPersona().compra.remove(compra);
			}
			
			orm.Producto_compra[] lProducto_compras = compra.producto_compra.toArray();
			for(int i = 0; i < lProducto_compras.length; i++) {
				lProducto_compras[i].setCompra(null);
			}
			return delete(compra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Compra compra, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(compra.getPersona() != null) {
				compra.getPersona().compra.remove(compra);
			}
			
			orm.Producto_compra[] lProducto_compras = compra.producto_compra.toArray();
			for(int i = 0; i < lProducto_compras.length; i++) {
				lProducto_compras[i].setCompra(null);
			}
			try {
				session.delete(compra);
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
	
	public static boolean refresh(orm.Compra compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().refresh(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Compra compra) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().evict(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByCriteria(CompraCriteria compraCriteria) {
		Compra[] compras = listCompraByCriteria(compraCriteria);
		if(compras == null || compras.length == 0) {
			return null;
		}
		return compras[0];
	}
	
	public static Compra[] listCompraByCriteria(CompraCriteria compraCriteria) {
		return compraCriteria.listCompra();
	}
}
