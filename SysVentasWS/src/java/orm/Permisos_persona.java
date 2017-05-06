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

public class Permisos_persona {
	public Permisos_persona() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERMISOS_PERSONA_PERMISOS) {
			this.permisos = (orm.Permisos) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERMISOS_PERSONA_PERSONA) {
			this.persona = (orm.Persona) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Permisos permisos;
	
	private orm.Persona persona;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPermisos(orm.Permisos value) {
		if (permisos != null) {
			permisos.permisos_persona.remove(this);
		}
		if (value != null) {
			value.permisos_persona.add(this);
		}
	}
	
	public orm.Permisos getPermisos() {
		return permisos;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Permisos(orm.Permisos value) {
		this.permisos = value;
	}
	
	private orm.Permisos getORM_Permisos() {
		return permisos;
	}
	
	public void setPersona(orm.Persona value) {
		if (persona != null) {
			persona.permisos_persona.remove(this);
		}
		if (value != null) {
			value.permisos_persona.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
