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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PermisosCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression desc;
	public final CollectionExpression permisos_persona;
	
	public PermisosCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		desc = new StringExpression("desc", this);
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this);
	}
	
	public PermisosCriteria(PersistentSession session) {
		this(session.createCriteria(Permisos.class));
	}
	
	public PermisosCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public Permisos_personaCriteria createPermisos_personaCriteria() {
		return new Permisos_personaCriteria(createCriteria("ORM_Permisos_persona"));
	}
	
	public Permisos uniquePermisos() {
		return (Permisos) super.uniqueResult();
	}
	
	public Permisos[] listPermisos() {
		java.util.List list = super.list();
		return (Permisos[]) list.toArray(new Permisos[list.size()]);
	}
}

