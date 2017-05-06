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

public class Compra {
	public Compra() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_COMPRA_PRODUCTO_COMPRA) {
			return ORM_producto_compra;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_COMPRA_PERSONA) {
			this.persona = (orm.Persona) owner;
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
	
	private String medio_pago;
	
	private orm.Persona persona;
	
	private int total_compra;
	
	private String fecha;
	
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
	
	public void setMedio_pago(String value) {
		this.medio_pago = value;
	}
	
	public String getMedio_pago() {
		return medio_pago;
	}
	
	public void setTotal_compra(int value) {
		this.total_compra = value;
	}
	
	public int getTotal_compra() {
		return total_compra;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setPersona(orm.Persona value) {
		if (persona != null) {
			persona.compra.remove(this);
		}
		if (value != null) {
			value.compra.add(this);
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona(orm.Persona value) {
		this.persona = value;
	}
	
	private orm.Persona getORM_Persona() {
		return persona;
	}
	
	private void setORM_Producto_compra(java.util.Set value) {
		this.ORM_producto_compra = value;
	}
	
	private java.util.Set getORM_Producto_compra() {
		return ORM_producto_compra;
	}
	
	public final orm.Producto_compraSetCollection producto_compra = new orm.Producto_compraSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_COMPRA_PRODUCTO_COMPRA, orm.ORMConstants.KEY_PRODUCTO_COMPRA_COMPRA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
