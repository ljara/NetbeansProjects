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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PermisosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression desc;
	public final CollectionExpression permisos_persona;
	
	public PermisosDetachedCriteria() {
		super(orm.Permisos.class, orm.PermisosCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		desc = new StringExpression("desc", this.getDetachedCriteria());
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this.getDetachedCriteria());
	}
	
	public PermisosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PermisosCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		desc = new StringExpression("desc", this.getDetachedCriteria());
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this.getDetachedCriteria());
	}
	
	public Permisos_personaDetachedCriteria createPermisos_personaCriteria() {
		return new Permisos_personaDetachedCriteria(createCriteria("ORM_Permisos_persona"));
	}
	
	public Permisos uniquePermisos(PersistentSession session) {
		return (Permisos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Permisos[] listPermisos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Permisos[]) list.toArray(new Permisos[list.size()]);
	}
}

