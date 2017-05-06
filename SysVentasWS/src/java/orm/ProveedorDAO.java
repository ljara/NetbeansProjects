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

public class ProveedorDAO {
	public static Proveedor loadProveedorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProveedorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor getProveedorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getProveedorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProveedorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor getProveedorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getProveedorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Proveedor) session.load(orm.Proveedor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor getProveedorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Proveedor) session.get(orm.Proveedor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proveedor) session.load(orm.Proveedor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor getProveedorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Proveedor) session.get(orm.Proveedor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProveedor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryProveedor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProveedor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryProveedor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor[] listProveedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listProveedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor[] listProveedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listProveedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProveedor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Proveedor as Proveedor");
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
	
	public static List queryProveedor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Proveedor as Proveedor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proveedor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor[] listProveedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProveedor(session, condition, orderBy);
			return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor[] listProveedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProveedor(session, condition, orderBy, lockMode);
			return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProveedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadProveedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Proveedor[] proveedors = listProveedorByQuery(session, condition, orderBy);
		if (proveedors != null && proveedors.length > 0)
			return proveedors[0];
		else
			return null;
	}
	
	public static Proveedor loadProveedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Proveedor[] proveedors = listProveedorByQuery(session, condition, orderBy, lockMode);
		if (proveedors != null && proveedors.length > 0)
			return proveedors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProveedorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateProveedorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProveedorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iterateProveedorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProveedorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Proveedor as Proveedor");
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
	
	public static java.util.Iterator iterateProveedorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Proveedor as Proveedor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Proveedor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor createProveedor() {
		return new orm.Proveedor();
	}
	
	public static boolean save(orm.Proveedor proveedor) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().saveObject(proveedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Proveedor proveedor) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().deleteObject(proveedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Proveedor proveedor)throws PersistentException {
		try {
			if(proveedor.getPersona() != null) {
				proveedor.getPersona().setProveedor(null);
			}
			
			orm.Producto[] lProductos = proveedor.producto.toArray();
			for(int i = 0; i < lProductos.length; i++) {
				lProductos[i].setProveedor(null);
			}
			return delete(proveedor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Proveedor proveedor, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(proveedor.getPersona() != null) {
				proveedor.getPersona().setProveedor(null);
			}
			
			orm.Producto[] lProductos = proveedor.producto.toArray();
			for(int i = 0; i < lProductos.length; i++) {
				lProductos[i].setProveedor(null);
			}
			try {
				session.delete(proveedor);
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
	
	public static boolean refresh(orm.Proveedor proveedor) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().refresh(proveedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Proveedor proveedor) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().evict(proveedor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Proveedor loadProveedorByCriteria(ProveedorCriteria proveedorCriteria) {
		Proveedor[] proveedors = listProveedorByCriteria(proveedorCriteria);
		if(proveedors == null || proveedors.length == 0) {
			return null;
		}
		return proveedors[0];
	}
	
	public static Proveedor[] listProveedorByCriteria(ProveedorCriteria proveedorCriteria) {
		return proveedorCriteria.listProveedor();
	}
}
