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

public class Permisos_personaDAO {
	public static Permisos_persona loadPermisos_personaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisos_personaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona getPermisos_personaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getPermisos_personaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisos_personaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona getPermisos_personaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return getPermisos_personaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Permisos_persona) session.load(orm.Permisos_persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona getPermisos_personaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Permisos_persona) session.get(orm.Permisos_persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Permisos_persona) session.load(orm.Permisos_persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona getPermisos_personaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Permisos_persona) session.get(orm.Permisos_persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos_persona(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryPermisos_persona(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos_persona(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return queryPermisos_persona(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona[] listPermisos_personaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listPermisos_personaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona[] listPermisos_personaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return listPermisos_personaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPermisos_persona(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos_persona as Permisos_persona");
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
	
	public static List queryPermisos_persona(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos_persona as Permisos_persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Permisos_persona", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona[] listPermisos_personaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPermisos_persona(session, condition, orderBy);
			return (Permisos_persona[]) list.toArray(new Permisos_persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona[] listPermisos_personaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPermisos_persona(session, condition, orderBy, lockMode);
			return (Permisos_persona[]) list.toArray(new Permisos_persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisos_personaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return loadPermisos_personaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Permisos_persona[] permisos_personas = listPermisos_personaByQuery(session, condition, orderBy);
		if (permisos_personas != null && permisos_personas.length > 0)
			return permisos_personas[0];
		else
			return null;
	}
	
	public static Permisos_persona loadPermisos_personaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Permisos_persona[] permisos_personas = listPermisos_personaByQuery(session, condition, orderBy, lockMode);
		if (permisos_personas != null && permisos_personas.length > 0)
			return permisos_personas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePermisos_personaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iteratePermisos_personaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePermisos_personaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.LjPersistentManager.instance().getSession();
			return iteratePermisos_personaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePermisos_personaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos_persona as Permisos_persona");
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
	
	public static java.util.Iterator iteratePermisos_personaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Permisos_persona as Permisos_persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Permisos_persona", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona createPermisos_persona() {
		return new orm.Permisos_persona();
	}
	
	public static boolean save(orm.Permisos_persona permisos_persona) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().saveObject(permisos_persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Permisos_persona permisos_persona) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().deleteObject(permisos_persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Permisos_persona permisos_persona)throws PersistentException {
		try {
			if(permisos_persona.getPermisos() != null) {
				permisos_persona.getPermisos().permisos_persona.remove(permisos_persona);
			}
			
			if(permisos_persona.getPersona() != null) {
				permisos_persona.getPersona().permisos_persona.remove(permisos_persona);
			}
			
			return delete(permisos_persona);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Permisos_persona permisos_persona, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(permisos_persona.getPermisos() != null) {
				permisos_persona.getPermisos().permisos_persona.remove(permisos_persona);
			}
			
			if(permisos_persona.getPersona() != null) {
				permisos_persona.getPersona().permisos_persona.remove(permisos_persona);
			}
			
			try {
				session.delete(permisos_persona);
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
	
	public static boolean refresh(orm.Permisos_persona permisos_persona) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().refresh(permisos_persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Permisos_persona permisos_persona) throws PersistentException {
		try {
			orm.LjPersistentManager.instance().getSession().evict(permisos_persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Permisos_persona loadPermisos_personaByCriteria(Permisos_personaCriteria permisos_personaCriteria) {
		Permisos_persona[] permisos_personas = listPermisos_personaByCriteria(permisos_personaCriteria);
		if(permisos_personas == null || permisos_personas.length == 0) {
			return null;
		}
		return permisos_personas[0];
	}
	
	public static Permisos_persona[] listPermisos_personaByCriteria(Permisos_personaCriteria permisos_personaCriteria) {
		return permisos_personaCriteria.listPermisos_persona();
	}
}
