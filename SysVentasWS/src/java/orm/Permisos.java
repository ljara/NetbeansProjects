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

public class Permisos {
	public Permisos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERMISOS_PERMISOS_PERSONA) {
			return ORM_permisos_persona;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String desc;
	
	private java.util.Set ORM_permisos_persona = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setDesc(String value) {
		this.desc = value;
	}
	
	public String getDesc() {
		return desc;
	}
	
	private void setORM_Permisos_persona(java.util.Set value) {
		this.ORM_permisos_persona = value;
	}
	
	private java.util.Set getORM_Permisos_persona() {
		return ORM_permisos_persona;
	}
	
	public final orm.Permisos_personaSetCollection permisos_persona = new orm.Permisos_personaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERMISOS_PERMISOS_PERSONA, orm.ORMConstants.KEY_PERMISOS_PERSONA_PERMISOS, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
