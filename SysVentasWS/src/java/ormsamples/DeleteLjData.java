/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteLjData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.LjPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Compra lormCompra = orm.CompraDAO.loadCompraByQuery(null, null);
			// Delete the persistent object
			orm.CompraDAO.delete(lormCompra);
			orm.Producto lormProducto = orm.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			orm.ProductoDAO.delete(lormProducto);
			orm.Categoria lormCategoria = orm.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			orm.CategoriaDAO.delete(lormCategoria);
			orm.Proveedor lormProveedor = orm.ProveedorDAO.loadProveedorByQuery(null, null);
			// Delete the persistent object
			orm.ProveedorDAO.delete(lormProveedor);
			orm.Permisos lormPermisos = orm.PermisosDAO.loadPermisosByQuery(null, null);
			// Delete the persistent object
			orm.PermisosDAO.delete(lormPermisos);
			orm.Permisos_persona lormPermisos_persona = orm.Permisos_personaDAO.loadPermisos_personaByQuery(null, null);
			// Delete the persistent object
			orm.Permisos_personaDAO.delete(lormPermisos_persona);
			orm.Producto_compra lormProducto_compra = orm.Producto_compraDAO.loadProducto_compraByQuery(null, null);
			// Delete the persistent object
			orm.Producto_compraDAO.delete(lormProducto_compra);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteLjData deleteLjData = new DeleteLjData();
			try {
				deleteLjData.deleteTestData();
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
