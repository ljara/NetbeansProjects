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

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido_p;
	public final StringExpression apellido_m;
	public final StringExpression email;
	public final StringExpression password;
	public final IntegerExpression proveedorId;
	public final AssociationExpression proveedor;
	public final CollectionExpression permisos_persona;
	public final CollectionExpression compra;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_p = new StringExpression("apellido_p", this.getDetachedCriteria());
		apellido_m = new StringExpression("apellido_m", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.id", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this.getDetachedCriteria());
		compra = new CollectionExpression("ORM_Compra", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_p = new StringExpression("apellido_p", this.getDetachedCriteria());
		apellido_m = new StringExpression("apellido_m", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.id", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this.getDetachedCriteria());
		compra = new CollectionExpression("ORM_Compra", this.getDetachedCriteria());
	}
	
	public ProveedorDetachedCriteria createProveedorCriteria() {
		return new ProveedorDetachedCriteria(createCriteria("proveedor"));
	}
	
	public Permisos_personaDetachedCriteria createPermisos_personaCriteria() {
		return new Permisos_personaDetachedCriteria(createCriteria("ORM_Permisos_persona"));
	}
	
	public CompraDetachedCriteria createCompraCriteria() {
		return new CompraDetachedCriteria(createCriteria("ORM_Compra"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

