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

public class CompraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression medio_pago;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression total_compra;
	public final StringExpression fecha;
	public final CollectionExpression producto_compra;
	
	public CompraDetachedCriteria() {
		super(orm.Compra.class, orm.CompraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medio_pago = new StringExpression("medio_pago", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		total_compra = new IntegerExpression("total_compra", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		producto_compra = new CollectionExpression("ORM_Producto_compra", this.getDetachedCriteria());
	}
	
	public CompraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.CompraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medio_pago = new StringExpression("medio_pago", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		total_compra = new IntegerExpression("total_compra", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		producto_compra = new CollectionExpression("ORM_Producto_compra", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public Producto_compraDetachedCriteria createProducto_compraCriteria() {
		return new Producto_compraDetachedCriteria(createCriteria("ORM_Producto_compra"));
	}
	
	public Compra uniqueCompra(PersistentSession session) {
		return (Compra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Compra[] listCompra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Compra[]) list.toArray(new Compra[list.size()]);
	}
}

