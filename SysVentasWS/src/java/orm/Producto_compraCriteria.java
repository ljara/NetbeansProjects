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

public class Producto_compraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression compraId;
	public final AssociationExpression compra;
	public final IntegerExpression cantidad;
	
	public Producto_compraCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		productoId = new IntegerExpression("producto.id", this);
		producto = new AssociationExpression("producto", this);
		compraId = new IntegerExpression("compra.id", this);
		compra = new AssociationExpression("compra", this);
		cantidad = new IntegerExpression("cantidad", this);
	}
	
	public Producto_compraCriteria(PersistentSession session) {
		this(session.createCriteria(Producto_compra.class));
	}
	
	public Producto_compraCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createProductoCriteria() {
		return new ProductoCriteria(createCriteria("producto"));
	}
	
	public CompraCriteria createCompraCriteria() {
		return new CompraCriteria(createCriteria("compra"));
	}
	
	public Producto_compra uniqueProducto_compra() {
		return (Producto_compra) super.uniqueResult();
	}
	
	public Producto_compra[] listProducto_compra() {
		java.util.List list = super.list();
		return (Producto_compra[]) list.toArray(new Producto_compra[list.size()]);
	}
}

