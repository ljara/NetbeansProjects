/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.servlet.http.HttpSession;
import miaplicacionweb.Rol;
import jufroweb.Content;
import jufroweb.JufroCMSConnection;

/**
 *
 * @author Zimri
 */
public class Permiso {

    private HttpSession _session;
    private String descripcion;
    private int idc = -1;
    private String error = "";

    public boolean verficiarAcceso() {
        throw new UnsupportedOperationException();
    }

    public boolean accesoAdministrador() {
        throw new UnsupportedOperationException();
    }

    public boolean accesoUsuarioNormal() {
        throw new UnsupportedOperationException();
    }

    public boolean insert(String campos) {
        System.out.println("Insertando valores : " + campos + " en Permisos");
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
         
            st.execute("INSERT INTO permiso (rolid,descripcion) VALUES (" + campos + ")");
            //st.commit();
            System.out.println();
            ret = true;
        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        System.out.println("no entro en el insert");
        return ret;
    }

    public void tonull(int id) {
        if (id >= 0) {
            id = id * -1;
        }
        this.idc = id;
        this.descripcion = "";

    }

    public String allToHtml() {

        String ret = "<table border='1'>";
        String con;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select descripcion,rolid,id from permiso");
            ResultSet r = s.getResultSet();
            if (r != null) {
                while (r.next()) {
                    ret += "\n<tr> ";
                    ret += "\n<td>" + "<a href=\"verPermiso.jsp?id=" + r.getInt("id") + "\">link</a></td>";
                    ret += "\n<td>" + r.getString("descripcion") + "</td>";
                    ret += "\n<td>" + r.getString("rolid") + "</td>";
                    ret += "\n<td>" + r.getString("id") + "</td>";
                    //con = r.getString("content");
                    ret += "</tr>";
                }
            }
            ret += "</table>";
        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        return ret;
    }

    public boolean eliminarPermiso(int id) {
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();

            st.execute("delete from permiso where id =" + id);
            System.out.println();
            ret = true;
        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        System.out.println("no entro en el delete");
        return ret;
    }
    
        public boolean asignarContent(ArrayList<Integer> permisos, int id) {
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();

            st.execute("delete from permiso where rolid =" + id);//cuando le asigno el rol al usuario no 
                                                                         //no me puede salir el mismo usuario
            //st.commit();
            for (Integer rolid : permisos) {
                st.execute("insert into permiso (rolid,rolid) values( " + id + "," + rolid + ")");
            }
            st.execute("");
            System.out.println();
            ret = true;
        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        System.out.println("no entro en el insert");
        return ret;
    }
        
        public String mostrarPermisos() {
        String ret = "<table border='1'>";
        String con;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select id,rolid,descripcion from permiso");
            System.out.println("entro");
            ResultSet r = s.getResultSet();
            if (r != null) {
                System.out.println("entro al if");
                while (r.next()) {
                    ret += "\n<tr> ";
                    ret += "\n<td>" + "<a href=\"gestionPermisos.jsp?id=" + r.getInt("id") + "\">link</a></td>";
                    ret += "\n<td>" + r.getString("rolid") + "</td>";
                    ret += "\n<td>" + r.getString("descripcion") + "</td>";
                    //con = r.getString("content");
                    ret += "</tr>";
                }
            }
            ret += "</table>";
        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        return ret;
    }
}
