/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateLjData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.LjPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : compra, permisos_persona, proveedor, password, email, apellido_m, apellido_p, nombre
			orm.PersonaDAO.save(lormPersona);
			orm.Compra lormCompra = orm.CompraDAO.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto_compra, fecha, total_compra, persona, medio_pago
			orm.CompraDAO.save(lormCompra);
			orm.Producto lormProducto = orm.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto_compra, stock, precio, nombre, proveedor, categoria
			orm.ProductoDAO.save(lormProducto);
			orm.Categoria lormCategoria = orm.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto, nombre
			orm.CategoriaDAO.save(lormCategoria);
			orm.Proveedor lormProveedor = orm.ProveedorDAO.createProveedor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : producto, direccion, fono, rut, nombre, persona
			orm.ProveedorDAO.save(lormProveedor);
			orm.Permisos lormPermisos = orm.PermisosDAO.createPermisos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : permisos_persona, desc
			orm.PermisosDAO.save(lormPermisos);
			orm.Permisos_persona lormPermisos_persona = orm.Permisos_personaDAO.createPermisos_persona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona, permisos
			orm.Permisos_personaDAO.save(lormPermisos_persona);
			orm.Producto_compra lormProducto_compra = orm.Producto_compraDAO.createProducto_compra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantidad, compra, producto
			orm.Producto_compraDAO.save(lormProducto_compra);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateLjData createLjData = new CreateLjData();
			try {
				createLjData.createTestData();
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
