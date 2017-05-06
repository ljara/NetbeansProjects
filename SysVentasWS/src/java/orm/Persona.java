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

public class Persona {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_PERMISOS_PERSONA) {
			return ORM_permisos_persona;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_COMPRA) {
			return ORM_compra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private String apellido_p;
	
	private String apellido_m;
	
	private String email;
	
	private String password;
	
	private orm.Proveedor proveedor;
	
	private java.util.Set ORM_permisos_persona = new java.util.HashSet();
	
	private java.util.Set ORM_compra = new java.util.HashSet();
	
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
	
	public void setApellido_p(String value) {
		this.apellido_p = value;
	}
	
	public String getApellido_p() {
		return apellido_p;
	}
	
	public void setApellido_m(String value) {
		this.apellido_m = value;
	}
	
	public String getApellido_m() {
		return apellido_m;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setProveedor(orm.Proveedor value) {
		if (this.proveedor != value) {
			orm.Proveedor lproveedor = this.proveedor;
			this.proveedor = value;
			if (value != null) {
				proveedor.setPersona(this);
			}
			if (lproveedor != null) {
				lproveedor.setPersona(null);
			}
		}
	}
	
	public orm.Proveedor getProveedor() {
		return proveedor;
	}
	
	private void setORM_Permisos_persona(java.util.Set value) {
		this.ORM_permisos_persona = value;
	}
	
	private java.util.Set getORM_Permisos_persona() {
		return ORM_permisos_persona;
	}
	
	public final orm.Permisos_personaSetCollection permisos_persona = new orm.Permisos_personaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERMISOS_PERSONA, orm.ORMConstants.KEY_PERMISOS_PERSONA_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Compra(java.util.Set value) {
		this.ORM_compra = value;
	}
	
	private java.util.Set getORM_Compra() {
		return ORM_compra;
	}
	
	public final orm.CompraSetCollection compra = new orm.CompraSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_COMPRA, orm.ORMConstants.KEY_COMPRA_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
