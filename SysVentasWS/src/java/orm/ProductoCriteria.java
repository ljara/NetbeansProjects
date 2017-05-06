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

public class ProductoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final IntegerExpression proveedorId;
	public final AssociationExpression proveedor;
	public final StringExpression nombre;
	public final IntegerExpression precio;
	public final IntegerExpression stock;
	public final CollectionExpression producto_compra;
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		categoriaId = new IntegerExpression("categoria.id", this);
		categoria = new AssociationExpression("categoria", this);
		proveedorId = new IntegerExpression("proveedor.id", this);
		proveedor = new AssociationExpression("proveedor", this);
		nombre = new StringExpression("nombre", this);
		precio = new IntegerExpression("precio", this);
		stock = new IntegerExpression("stock", this);
		producto_compra = new CollectionExpression("ORM_Producto_compra", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public ProveedorCriteria createProveedorCriteria() {
		return new ProveedorCriteria(createCriteria("proveedor"));
	}
	
	public Producto_compraCriteria createProducto_compraCriteria() {
		return new Producto_compraCriteria(createCriteria("ORM_Producto_compra"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

