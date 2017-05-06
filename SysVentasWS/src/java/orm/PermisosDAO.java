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

public class PermisosDAO {
	public static Permisos loadPermisosByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos getPermisosByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getPermisosByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos getPermisosByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getPermisosByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Permisos) session.load(orm.Permisos.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos getPermisosByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Permisos) session.get(orm.Permisos.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Permisos) session.load(orm.Permisos.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos getPermisosByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Permisos) session.get(orm.Permisos.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryPermisos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryPermisos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos[] listPermisosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listPermisosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos[] listPermisosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listPermisosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos as Permisos");
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
	
	public static List queryPermisos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos as Permisos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Permisos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos[] listPermisosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPermisos(session, condition, orderBy);
			return (Permisos[]) list.toArray(new Permisos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos[] listPermisosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPermisos(session, condition, orderBy, lockMode);
			return (Permisos[]) list.toArray(new Permisos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Permisos[] permisoses = listPermisosByQuery(session, condition, orderBy);
		if (permisoses != null && permisoses.length > 0)
			return permisoses[0];
		else
			return null;
	}
	
	public static Permisos loadPermisosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Permisos[] permisoses = listPermisosByQuery(session, condition, orderBy, lockMode);
		if (permisoses != null && permisoses.length > 0)
			return permisoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePermisosByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iteratePermisosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePermisosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iteratePermisosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePermisosByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos as Permisos");
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
	
	public static java.util.Iterator iteratePermisosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos as Permisos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Permisos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos createPermisos() {
		return new orm.Permisos();
	}
	
	public static boolean save(orm.Permisos permisos) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().saveObject(permisos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Permisos permisos) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().deleteObject(permisos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Permisos permisos)throws PersistentException {
		try {
			orm.Permisos_persona[] lPermisos_personas = permisos.permisos_persona.toArray();
			for(int i = 0; i < lPermisos_personas.length; i++) {
				lPermisos_personas[i].setPermisos(null);
			}
			return delete(permisos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Permisos permisos, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Permisos_persona[] lPermisos_personas = permisos.permisos_persona.toArray();
			for(int i = 0; i < lPermisos_personas.length; i++) {
				lPermisos_personas[i].setPermisos(null);
			}
			try {
				session.delete(permisos);
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
	
	public static boolean refresh(orm.Permisos permisos) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().refresh(permisos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Permisos permisos) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().evict(permisos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos loadPermisosByCriteria(PermisosCriteria permisosCriteria) {
		Permisos[] permisoses = listPermisosByCriteria(permisosCriteria);
		if(permisoses == null || permisoses.length == 0) {
			return null;
		}
		return permisoses[0];
	}
	
	public static Permisos[] listPermisosByCriteria(PermisosCriteria permisosCriteria) {
		return permisosCriteria.listPermisos();
	}
}
