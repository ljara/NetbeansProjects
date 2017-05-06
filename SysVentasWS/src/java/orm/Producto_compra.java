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

public class Producto_compra {
	public Producto_compra() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PRODUCTO_COMPRA_PRODUCTO) {
			this.producto = (orm.Producto) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PRODUCTO_COMPRA_COMPRA) {
			this.compra = (orm.Compra) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Producto producto;
	
	private orm.Compra compra;
	
	private int cantidad;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCantidad(int value) {
		this.cantidad = value;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setProducto(orm.Producto value) {
		if (producto != null) {
			producto.producto_compra.remove(this);
		}
		if (value != null) {
			value.producto_compra.add(this);
		}
	}
	
	public orm.Producto getProducto() {
		return producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Producto(orm.Producto value) {
		this.producto = value;
	}
	
	private orm.Producto getORM_Producto() {
		return producto;
	}
	
	public void setCompra(orm.Compra value) {
		if (compra != null) {
			compra.producto_compra.remove(this);
		}
		if (value != null) {
			value.producto_compra.add(this);
		}
	}
	
	public orm.Compra getCompra() {
		return compra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Compra(orm.Compra value) {
		this.compra = value;
	}
	
	private orm.Compra getORM_Compra() {
		return compra;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
