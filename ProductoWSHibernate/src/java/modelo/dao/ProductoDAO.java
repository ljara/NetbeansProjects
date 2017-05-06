/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import modelo.pojos.Producto;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author Luis
 */
public class ProductoDAO {

    public void ingresarProducto(Producto p) { //Este método recibe el pojo preparado
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try {
            sf = NewHibernateUtil.getSessionFactory(); //obtener acceso a la factoría de sesiones
            sesion = sf.openSession(); // iniciar la sesión
            tx = sesion.beginTransaction(); //iniciar una transacción
            sesion.save(p); //para guardar la transacción
            tx.commit();//confinar los cambios que se hacen en la base de datos
            sesion.close(); //para cerrar la sesión
        } catch (Exception ex) {
            tx.rollback(); //volver un paso atrás
            throw new RuntimeException("No se pudo guardar el producto");
        }
    }

    public String consultarProducto(int codigo) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();//obtener acceso a la factoría de sesiones
        Session sesion = sf.openSession();// iniciar la sesión
        Producto p = (Producto) sesion.get(Producto.class, codigo);//instanciamos p, el metodo sesion.get
        //obtiene un poducto de la tabla Producto y el campo que corresponde a su clave primaria que es codigo , debemos fozar a que el objeto obtenido sea de tipo Producto.sesion.close();

        if (p
                != null) {
            return "El producto de codigo " + p.getCodigo() + " cuyo nombre es " + p.getNombre()
                    + " cuesta " + p.getPrecio() + " tiene stock " + p.getStock() + " y su descripcion es "
                    + p.getDescripcion();
        } else {
            return "El producto de codigo " + codigo + " no existe";
        }
    }

    public List<Producto> verProductos() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();//obtener acceso a la factoría de sesiones
        Session sesion = sf.openSession();// iniciar la sesión
        Query query = sesion.createQuery("from Producto");//definimos una query y una consulta, esta consulta es en base al pojo por eso con mayúscula, luego hibérnate mapea a la tabla
        List<Producto> lista = query.list();//en una lista se rescata los objetos por medio de objeto c/u de las tuplas. Cada una de los tuplas se guarda como objeto en una lista
        sesion.close();
        return lista;
    }
}