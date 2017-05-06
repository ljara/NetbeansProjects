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

public class Permisos_personaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression permisosId;
	public final AssociationExpression permisos;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	
	public Permisos_personaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		permisosId = new IntegerExpression("permisos.id", this);
		permisos = new AssociationExpression("permisos", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
	}
	
	public Permisos_personaCriteria(PersistentSession session) {
		this(session.createCriteria(Permisos_persona.class));
	}
	
	public Permisos_personaCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public PermisosCriteria createPermisosCriteria() {
		return new PermisosCriteria(createCriteria("permisos"));
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Permisos_persona uniquePermisos_persona() {
		return (Permisos_persona) super.uniqueResult();
	}
	
	public Permisos_persona[] listPermisos_persona() {
		java.util.List list = super.list();
		return (Permisos_persona[]) list.toArray(new Permisos_persona[list.size()]);
	}
}

