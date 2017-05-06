/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListLjData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		int length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra...");
		orm.Compra[] ormCompras = orm.CompraDAO.listCompraByQuery(null, null);
		length = Math.min(ormCompras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCompras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		orm.Producto[] ormProductos = orm.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(ormProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		orm.Categoria[] ormCategorias = orm.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(ormCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Proveedor...");
		orm.Proveedor[] ormProveedors = orm.ProveedorDAO.listProveedorByQuery(null, null);
		length = Math.min(ormProveedors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProveedors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Permisos...");
		orm.Permisos[] ormPermisoses = orm.PermisosDAO.listPermisosByQuery(null, null);
		length = Math.min(ormPermisoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPermisoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Permisos_persona...");
		orm.Permisos_persona[] ormPermisos_personas = orm.Permisos_personaDAO.listPermisos_personaByQuery(null, null);
		length = Math.min(ormPermisos_personas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPermisos_personas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto_compra...");
		orm.Producto_compra[] ormProducto_compras = orm.Producto_compraDAO.listProducto_compraByQuery(null, null);
		length = Math.min(ormProducto_compras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormProducto_compras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		int length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Compra by Criteria...");
		orm.CompraCriteria lormCompraCriteria = new orm.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCompraCriteria.id.eq();
		lormCompraCriteria.setMaxResults(ROW_COUNT);
		orm.Compra[] ormCompras = lormCompraCriteria.listCompra();
		length =ormCompras== null ? 0 : Math.min(ormCompras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCompras[i]);
		}
		System.out.println(length + " Compra record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		orm.ProductoCriteria lormProductoCriteria = new orm.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProductoCriteria.id.eq();
		lormProductoCriteria.setMaxResults(ROW_COUNT);
		orm.Producto[] ormProductos = lormProductoCriteria.listProducto();
		length =ormProductos== null ? 0 : Math.min(ormProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		orm.CategoriaCriteria lormCategoriaCriteria = new orm.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCategoriaCriteria.id.eq();
		lormCategoriaCriteria.setMaxResults(ROW_COUNT);
		orm.Categoria[] ormCategorias = lormCategoriaCriteria.listCategoria();
		length =ormCategorias== null ? 0 : Math.min(ormCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Proveedor by Criteria...");
		orm.ProveedorCriteria lormProveedorCriteria = new orm.ProveedorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProveedorCriteria.id.eq();
		lormProveedorCriteria.setMaxResults(ROW_COUNT);
		orm.Proveedor[] ormProveedors = lormProveedorCriteria.listProveedor();
		length =ormProveedors== null ? 0 : Math.min(ormProveedors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProveedors[i]);
		}
		System.out.println(length + " Proveedor record(s) retrieved."); 
		
		System.out.println("Listing Permisos by Criteria...");
		orm.PermisosCriteria lormPermisosCriteria = new orm.PermisosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPermisosCriteria.id.eq();
		lormPermisosCriteria.setMaxResults(ROW_COUNT);
		orm.Permisos[] ormPermisoses = lormPermisosCriteria.listPermisos();
		length =ormPermisoses== null ? 0 : Math.min(ormPermisoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPermisoses[i]);
		}
		System.out.println(length + " Permisos record(s) retrieved."); 
		
		System.out.println("Listing Permisos_persona by Criteria...");
		orm.Permisos_personaCriteria lormPermisos_personaCriteria = new orm.Permisos_personaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPermisos_personaCriteria.id.eq();
		lormPermisos_personaCriteria.setMaxResults(ROW_COUNT);
		orm.Permisos_persona[] ormPermisos_personas = lormPermisos_personaCriteria.listPermisos_persona();
		length =ormPermisos_personas== null ? 0 : Math.min(ormPermisos_personas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPermisos_personas[i]);
		}
		System.out.println(length + " Permisos_persona record(s) retrieved."); 
		
		System.out.println("Listing Producto_compra by Criteria...");
		orm.Producto_compraCriteria lormProducto_compraCriteria = new orm.Producto_compraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormProducto_compraCriteria.id.eq();
		lormProducto_compraCriteria.setMaxResults(ROW_COUNT);
		orm.Producto_compra[] ormProducto_compras = lormProducto_compraCriteria.listProducto_compra();
		length =ormProducto_compras== null ? 0 : Math.min(ormProducto_compras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormProducto_compras[i]);
		}
		System.out.println(length + " Producto_compra record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListLjData listLjData = new ListLjData();
			try {
				listLjData.listTestData();
				//listLjData.listByCriteria();
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
