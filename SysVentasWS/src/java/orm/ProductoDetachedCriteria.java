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

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final IntegerExpression proveedorId;
	public final AssociationExpression proveedor;
	public final StringExpression nombre;
	public final IntegerExpression precio;
	public final IntegerExpression stock;
	public final CollectionExpression producto_compra;
	
	public ProductoDetachedCriteria() {
		super(orm.Producto.class, orm.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.id", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new IntegerExpression("precio", this.getDetachedCriteria());
		stock = new IntegerExpression("stock", this.getDetachedCriteria());
		producto_compra = new CollectionExpression("ORM_Producto_compra", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.id", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new IntegerExpression("precio", this.getDetachedCriteria());
		stock = new IntegerExpression("stock", this.getDetachedCriteria());
		producto_compra = new CollectionExpression("ORM_Producto_compra", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria createCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("categoria"));
	}
	
	public ProveedorDetachedCriteria createProveedorCriteria() {
		return new ProveedorDetachedCriteria(createCriteria("proveedor"));
	}
	
	public Producto_compraDetachedCriteria createProducto_compraCriteria() {
		return new Producto_compraDetachedCriteria(createCriteria("ORM_Producto_compra"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

