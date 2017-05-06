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

public class CompraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression medio_pago;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression total_compra;
	public final StringExpression fecha;
	public final CollectionExpression producto_compra;
	
	public CompraCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		medio_pago = new StringExpression("medio_pago", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		total_compra = new IntegerExpression("total_compra", this);
		fecha = new StringExpression("fecha", this);
		producto_compra = new CollectionExpression("ORM_Producto_compra", this);
	}
	
	public CompraCriteria(PersistentSession session) {
		this(session.createCriteria(Compra.class));
	}
	
	public CompraCriteria() throws PersistentException {
		this(orm.LjPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public Producto_compraCriteria createProducto_compraCriteria() {
		return new Producto_compraCriteria(createCriteria("ORM_Producto_compra"));
	}
	
	public Compra uniqueCompra() {
		return (Compra) super.uniqueResult();
	}
	
	public Compra[] listCompra() {
		java.util.List list = super.list();
		return (Compra[]) list.toArray(new Compra[list.size()]);
	}
}

