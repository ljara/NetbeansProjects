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

public class Producto_compraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression compraId;
	public final AssociationExpression compra;
	public final IntegerExpression cantidad;
	
	public Producto_compraDetachedCriteria() {
		super(orm.Producto_compra.class, orm.Producto_compraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		compraId = new IntegerExpression("compra.id", this.getDetachedCriteria());
		compra = new AssociationExpression("compra", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
	}
	
	public Producto_compraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Producto_compraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		compraId = new IntegerExpression("compra.id", this.getDetachedCriteria());
		compra = new AssociationExpression("compra", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("producto"));
	}
	
	public CompraDetachedCriteria createCompraCriteria() {
		return new CompraDetachedCriteria(createCriteria("compra"));
	}
	
	public Producto_compra uniqueProducto_compra(PersistentSession session) {
		return (Producto_compra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto_compra[] listProducto_compra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto_compra[]) list.toArray(new Producto_compra[list.size()]);
	}
}

