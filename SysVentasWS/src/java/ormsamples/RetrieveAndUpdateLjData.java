/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateLjData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.LjPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.Compra lormCompra = orm.CompraDAO.loadCompraByQuery(null, null);
			// Update the properties of the persistent object
			orm.CompraDAO.save(lormCompra);
			orm.Producto lormProducto = orm.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ProductoDAO.save(lormProducto);
			orm.Categoria lormCategoria = orm.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			orm.CategoriaDAO.save(lormCategoria);
			orm.Proveedor lormProveedor = orm.ProveedorDAO.loadProveedorByQuery(null, null);
			// Update the properties of the persistent object
			orm.ProveedorDAO.save(lormProveedor);
			orm.Permisos lormPermisos = orm.PermisosDAO.loadPermisosByQuery(null, null);
			// Update the properties of the persistent object
			orm.PermisosDAO.save(lormPermisos);
			orm.Permisos_persona lormPermisos_persona = orm.Permisos_personaDAO.loadPermisos_personaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Permisos_personaDAO.save(lormPermisos_persona);
			orm.Producto_compra lormProducto_compra = orm.Producto_compraDAO.loadProducto_compraByQuery(null, null);
			// Update the properties of the persistent object
			orm.Producto_compraDAO.save(lormProducto_compra);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Compra by CompraCriteria");
		orm.CompraCriteria lormCompraCriteria = new orm.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCompraCriteria.id.eq();
		System.out.println(lormCompraCriteria.uniqueCompra());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		orm.ProductoCriteria lormProductoCriteria = new orm.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProductoCriteria.id.eq();
		System.out.println(lormProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		orm.CategoriaCriteria lormCategoriaCriteria = new orm.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCategoriaCriteria.id.eq();
		System.out.println(lormCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Proveedor by ProveedorCriteria");
		orm.ProveedorCriteria lormProveedorCriteria = new orm.ProveedorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProveedorCriteria.id.eq();
		System.out.println(lormProveedorCriteria.uniqueProveedor());
		
		System.out.println("Retrieving Permisos by PermisosCriteria");
		orm.PermisosCriteria lormPermisosCriteria = new orm.PermisosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPermisosCriteria.id.eq();
		System.out.println(lormPermisosCriteria.uniquePermisos());
		
		System.out.println("Retrieving Permisos_persona by Permisos_personaCriteria");
		orm.Permisos_personaCriteria lormPermisos_personaCriteria = new orm.Permisos_personaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPermisos_personaCriteria.id.eq();
		System.out.println(lormPermisos_personaCriteria.uniquePermisos_persona());
		
		System.out.println("Retrieving Producto_compra by Producto_compraCriteria");
		orm.Producto_compraCriteria lormProducto_compraCriteria = new orm.Producto_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormProducto_compraCriteria.id.eq();
		System.out.println(lormProducto_compraCriteria.uniqueProducto_compra());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateLjData retrieveAndUpdateLjData = new RetrieveAndUpdateLjData();
			try {
				retrieveAndUpdateLjData.retrieveAndUpdateTestData();
				//retrieveAndUpdateLjData.retrieveByCriteria();
			}
			finally {
				orm.LjPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
