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

public class ProveedorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final StringExpression nombre;
	public final IntegerExpression rut;
	public final IntegerExpression fono;
	public final StringExpression direccion;
	public final CollectionExpression producto;
	
	public ProveedorDetachedCriteria() {
		super(orm.Proveedor.class, orm.ProveedorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new IntegerExpression("rut", this.getDetachedCriteria());
		fono = new IntegerExpression("fono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		producto = new CollectionExpression("ORM_Producto", this.getDetachedCriteria());
	}
	
	public ProveedorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ProveedorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new IntegerExpression("rut", this.getDetachedCriteria());
		fono = new IntegerExpression("fono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		producto = new CollectionExpression("ORM_Producto", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("ORM_Producto"));
	}
	
	public Proveedor uniqueProveedor(PersistentSession session) {
		return (Proveedor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Proveedor[] listProveedor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
	}
}

