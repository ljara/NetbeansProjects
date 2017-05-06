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

public class Proveedor {
	public Proveedor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PROVEEDOR_PRODUCTO) {
			return ORM_producto;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private orm.Persona persona;
	
	private String nombre;
	
	private int rut;
	
	private int fono;
	
	private String direccion;
	
	private java.util.Set ORM_producto = new java.util.HashSet();
	
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
	
	public void setRut(int value) {
		this.rut = value;
	}
	
	public int getRut() {
		return rut;
	}
	
	public void setFono(int value) {
		this.fono = value;
	}
	
	public int getFono() {
		return fono;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setPersona(orm.Persona value) {
		if (this.persona != value) {
			orm.Persona lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setProveedor(this);
			}
			if (lpersona != null) {
				lpersona.setProveedor(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	private void setORM_Producto(java.util.Set value) {
		this.ORM_producto = value;
	}
	
	private java.util.Set getORM_Producto() {
		return ORM_producto;
	}
	
	public final orm.ProductoSetCollection producto = new orm.ProductoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PROVEEDOR_PRODUCTO, orm.ORMConstants.KEY_PRODUCTO_PROVEEDOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
