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

public class ProveedorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final StringExpression nombre;
	public final IntegerExpression rut;
	public final IntegerExpression fono;
	public final StringExpression direccion;
	public final CollectionExpression producto;
	
	public ProveedorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		nombre = new StringExpression("nombre", this);
		rut = new IntegerExpression("rut", this);
		fono = new IntegerExpression("fono", this);
		direccion = new StringExpression("direccion", this);
		producto = new CollectionExpression("ORM_Producto", this);
	}
	
	public ProveedorCriteria(PersistentSession session) {
		this(session.createCriteria(Proveedor.class));
	}
	
	public ProveedorCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public ProductoCriteria createProductoCriteria() {
		return new ProductoCriteria(createCriteria("ORM_Producto"));
	}
	
	public Proveedor uniqueProveedor() {
		return (Proveedor) super.uniqueResult();
	}
	
	public Proveedor[] listProveedor() {
		java.util.List list = super.list();
		return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
	}
}

