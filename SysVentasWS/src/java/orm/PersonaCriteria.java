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

public class PersonaCriteria extends AbstractORMCriteria {
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
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		apellido_p = new StringExpression("apellido_p", this);
		apellido_m = new StringExpression("apellido_m", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		proveedorId = new IntegerExpression("proveedor.id", this);
		proveedor = new AssociationExpression("proveedor", this);
		permisos_persona = new CollectionExpression("ORM_Permisos_persona", this);
		compra = new CollectionExpression("ORM_Compra", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public ProveedorCriteria createProveedorCriteria() {
		return new ProveedorCriteria(createCriteria("proveedor"));
	}
	
	public Permisos_personaCriteria createPermisos_personaCriteria() {
		return new Permisos_personaCriteria(createCriteria("ORM_Permisos_persona"));
	}
	
	public CompraCriteria createCompraCriteria() {
		return new CompraCriteria(createCriteria("ORM_Compra"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

