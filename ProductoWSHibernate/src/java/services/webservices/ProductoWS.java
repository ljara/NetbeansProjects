/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services.webservices;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.dao.ProductoDAO;
import modelo.pojos.Producto;

/**
 *
 * @author Luis
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarProducto")
    public String IngresarProducto(@WebParam(name = "codigo") int codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") int precio, @WebParam(name = "stock") int stock, @WebParam(name = "descripcion") String descripcion) {
        Producto p = new Producto(codigo, nombre, precio, stock, descripcion);
        ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.ingresarProducto(p);
        return "Ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarProducto")
    public String BuscarProducto(@WebParam(name = "codigo") int codigo) {
        ProductoDAO productoDAO = new ProductoDAO();
        return productoDAO.consultarProducto(codigo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarProductos")
    public List<Producto> ConsultarProductos() {
        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> listaProductos = productoDAO.verProductos();
        return listaProductos;
    }
}
