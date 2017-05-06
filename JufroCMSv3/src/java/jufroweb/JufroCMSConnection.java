/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jufroweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class JufroCMSConnection {
        private Connection c;
        
    public void init()throws ClassNotFoundException,SQLException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        this.c = DriverManager.getConnection("jdbc:derby://localhost:1527/webcontainer;user=admin;password=admin");
        //this.c.setSchema("ADMIN");
    }
    
    
    public Statement createStatement() throws ClassNotFoundException,SQLException {
        this.init();
        return this.c.createStatement();
    }
    

    
        /*
        private boolean ok;
        private String msg;
        
    public JufroCMSConnection ()  {
            try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        this.c = DriverManager.getConnection ("jdbc:derby://localhost:1527/webcontainer;user=admin;password=admin");
        this.ok = c.isValid(0);
        if(this.ok) {
            this.msg = c.getWarnings().getMessage();
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
            st = c.createStatement();
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
    
    public boolean modificar(String tabla, String campos, String condicion) {
        //campos y valores separados por , ; se asume todos los valores van entre comillas
        boolean ret = true;
        Statement st;
        String sql = "no sql";
        try {
            st = c.createStatement();
            sql = "UPDATE " + tabla + " SET " + campos + " WHERE id=" + condicion;
            st.execute(sql);
            ret = true;
            this.msg = " inserciÃ³n exitosa ";
        } catch (Exception e1) {
            ret = false;
            this.ok = false;
            this.msg = e1.getMessage() + " SQL:" + sql;
        }
        return ret;
    }
    
    public ResultSet buscar(String campos, String tabla) {

        ResultSet result = null;

        Statement st;
        String sql = "no sql";
        try {
            st = c.createStatement();
            sql = "SELECT * FROM " + tabla + " WHERE id=" + campos;
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }
    
    public ResultSet listar(String campos, String tabla) {

        ResultSet result = null;

        Statement st;
        String sql = "no sql";
        try {
            st = c.createStatement();
            sql = "SELECT " + campos + " FROM " + tabla;
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }
    
         public boolean isOK() {
         this.msg = "Probará validez de conexión";
         boolean ret;
         try {
         return ret = this.c.isValid(0);
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
     
   */ 
}