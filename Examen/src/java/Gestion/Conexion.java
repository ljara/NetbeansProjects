package Gestion;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
import java.sql.*;

public class Conexion {

    private Connection con;
    private boolean ok;
    private String msg;

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prueba", "root", "1234");
            this.ok = con.isValid(0);
            if (this.ok) {
                this.msg = con.getWarnings().getMessage();
                if (this.msg.isEmpty()) {
                    this.msg = "OK DB Connection";
                }
            } else {
                this.msg = "NO DB Connection";
            }
        } catch (Exception e1) {
            this.msg = e1.getMessage();
            this.ok = false;
        }
    }

    public boolean insercion(String tabla, String campos, String valores) {
//campos y valores separados por , ; se asume todos los valores van entre comillas
        boolean ret = true;
        Statement st;
        String sql = "no sql";
        try {
            st = con.createStatement();
            sql = "INSERT INTO " + tabla + " (" + campos + ") VALUES ";
            sql += "(" + valores + ")";
            st.execute(sql);
            ret = true;
            this.msg = " inserción exitosa ";
        } catch (Exception e1) {
            ret = false;
            this.ok = false;
            this.msg = e1.getMessage() + " SQL:" + sql;
        }

        return ret;
    }

    public ResultSet extraccion(String tabla, String campos) {

        Statement st;
        ResultSet ret = null;
        String sql = "no sql";
        try {
            st = con.createStatement();
            ret = st.executeQuery("Select " + campos + " from " + tabla);

            this.msg = " Select ok ";
        } catch (Exception e1) {
            ret = null;
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
        } catch (Exception e) {
            this.msg = "Problema en conexión";
            ret = false;
        }
        return ret;
    }

    public String ultimomensaje() {
        return this.msg;
    }
}