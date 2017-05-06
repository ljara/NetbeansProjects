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

public class Producto {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PRODUCTO_PRODUCTO_COMPRA) {
			return ORM_producto_compra;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PRODUCTO_CATEGORIA) {
			this.categoria = (orm.Categoria) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PRODUCTO_PROVEEDOR) {
			this.proveedor = (orm.Proveedor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Categoria categoria;
	
	private orm.Proveedor proveedor;
	
	private String nombre;
	
	private int precio;
	
	private int stock;
	
	private java.util.Set ORM_producto_compra = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(int value) {
		this.precio = value;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setStock(int value) {
		this.stock = value;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setCategoria(orm.Categoria value) {
		if (categoria != null) {
			categoria.producto.remove(this);
		}
		if (value != null) {
			value.producto.add(this);
		}
	}
	
	public orm.Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria(orm.Categoria value) {
		this.categoria = value;
	}
	
	private orm.Categoria getORM_Categoria() {
		return categoria;
	}
	
	public void setProveedor(orm.Proveedor value) {
		if (proveedor != null) {
			proveedor.producto.remove(this);
		}
		if (value != null) {
			value.producto.add(this);
		}
	}
	
	public orm.Proveedor getProveedor() {
		return proveedor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Proveedor(orm.Proveedor value) {
		this.proveedor = value;
	}
	
	private orm.Proveedor getORM_Proveedor() {
		return proveedor;
	}
	
	private void setORM_Producto_compra(java.util.Set value) {
		this.ORM_producto_compra = value;
	}
	
	private java.util.Set getORM_Producto_compra() {
		return ORM_producto_compra;
	}
	
	public final orm.Producto_compraSetCollection producto_compra = new orm.Producto_compraSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PRODUCTO_PRODUCTO_COMPRA, orm.ORMConstants.KEY_PRODUCTO_COMPRA_PRODUCTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
