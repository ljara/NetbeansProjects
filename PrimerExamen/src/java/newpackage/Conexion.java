/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.*;

/**
 *
 * @author Zisi
 */
public class Conexion {
 
	private Connection con;
	private boolean ok;
	private String msg;
   
     public Conexion() {
    
     try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        this.con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/prueba","root","1234");
        //this.con = DriverManager.getConnection ("jdbc:mysql://200.10.22.121:3306/iis410","iis410","iis410todos");
        this.ok = con.isValid(0);
        if(this.ok) {
            this.msg = con.getWarnings().getMessage();
            if (this.msg.isEmpty()) this.msg="OK DB Connection";
        }
        else 
            this.msg = "NO DB Connection";
        }
     catch(Exception e1) {
            this.msg = e1.getMessage();
            this.ok = false;
        }
     }
     public boolean insercion(String tabla,String campos,String valores) {
        //campos y valores separados por , ; se asume todos los valores van entre comillas
        boolean ret=true;
        Statement st;
        String sql="no sql";
        try {
            st = con.createStatement();
            sql = "INSERT INTO "+tabla+" ("+campos+") VALUES ";
            sql +="("+valores+")";
            st.execute(sql);
            ret = true;
            this.msg=" inserción exitosa ";
        }
        catch (Exception e1) {
            ret=false;
            this.ok =false;
            this.msg = e1.getMessage()+" SQL:"+sql;
        }
         
     return ret;
     }
     
     
     public ResultSet select(String campos,String tabla) {
         
        ResultSet result = null;
        
        Statement st;
        String sql="no sql";
        try {
            st = con.createStatement();
            sql = "SELECT "+campos+ " FROM "+tabla;
            result = st.executeQuery(sql);
            
                       
        } catch (SQLException ex) {
           
           System.err.println(ex.getMessage());
        }
        
         
     return result;
     }
     
     /**
	 * <p>
	 * Elimina registro(s) de la DB según una condición dada
	 * </p>
	 * 
	 * @param tabla
	 *            tabla objetivo
	 * @param campo
	 *            campo a evaluar
	 * @param prefijo
	 *            =,<,>
	 * @param condicion
	 *            condición que debe cumplir el campo
	 * @return
	 */
	public boolean eliminacion(String tabla, String campo, String prefijo,
			String condicion) {
		boolean ret = true;
		Statement st;
		String sql = "no sql";
		try {
			st = con.createStatement();
			sql = "DELETE FROM " + tabla + " WHERE " + campo + prefijo
					+ condicion;
			st.execute(sql);
			ret = true;
			this.msg = " eliminación exitosa ";
		} catch (Exception e1) {
			ret = false;
			this.ok = false;
			this.msg = e1.getMessage() + " SQL:" + sql;
		}
 
		return ret;
	}
     public boolean isOK() {
         this.msg = "Probará validez de conexión";
         boolean ret;
         try {
         return ret = this.con.isValid(0);
         }
         catch (Exception e){
             this.msg= "Problema en conexión";
             ret = false;
         }
         return ret;
     }
     
     public String ultimomensaje() {
         return this.msg;
     }
     
    
     
    public ResultSet selectBuscar(String tabla, String campos, String prefijo,
			String campo, String condicion) {
 
		Statement st;
		ResultSet ret = null;
		String sql = "no sql";
		try {
			st = con.createStatement();
			ret = st.executeQuery("Select " + campos + " from " + tabla
					+ " where " + campo + prefijo + condicion);
 
			this.msg = " Select ok ";
		} catch (Exception e1) {
			ret = null;
			this.ok = false;
			this.msg = e1.getMessage() + " SQL:" + sql;
		}
		return ret;
	}
    
 
    
}
