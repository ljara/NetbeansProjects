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

public class Permisos_personaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression permisosId;
	public final AssociationExpression permisos;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	
	public Permisos_personaDetachedCriteria() {
		super(orm.Permisos_persona.class, orm.Permisos_personaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		permisosId = new IntegerExpression("permisos.id", this.getDetachedCriteria());
		permisos = new AssociationExpression("permisos", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
	}
	
	public Permisos_personaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Permisos_personaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		permisosId = new IntegerExpression("permisos.id", this.getDetachedCriteria());
		permisos = new AssociationExpression("permisos", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
	}
	
	public PermisosDetachedCriteria createPermisosCriteria() {
		return new PermisosDetachedCriteria(createCriteria("permisos"));
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public Permisos_persona uniquePermisos_persona(PersistentSession session) {
		return (Permisos_persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Permisos_persona[] listPermisos_persona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Permisos_persona[]) list.toArray(new Permisos_persona[list.size()]);
	}
}

