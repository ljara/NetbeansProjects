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
import jufroweb.JufroCMSConnection;
import miaplicacionweb.Usuario;
import miaplicacionweb.Permiso;

/**
 *
 * @author Luis
 */
public class Rol {

    private int idc;
    private String tipoRol;
    private String error = "";

    /**
     * @return the idc
     */
    public int getIdc() {
        return idc;
    }

    /**
     * @param idc the idc to set
     */
    public void setIdc(int idc) {
        this.idc = idc;
    }

    /**
     * @return the tipoRol
     */
    public String getTipoRol() {
        return tipoRol;
    }

    /**
     * @param tipoRol the tipoRol to set
     */
    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public boolean insert(String campos) {
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
            System.out.println(campos);
            st.execute("INSERT INTO rol(tipo_rol) VALUES (" + campos + ")");
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

    public String allToHtml() {
        String ret = "<table border='1'>";
        String con;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select tipo_rol from rol");
            ResultSet r = s.getResultSet();
            if (r != null) {
                while (r.next()) {
                    ret += "\n<tr>\n<td>" + r.getInt("tipo_rol") + "</td>";
                    con = r.getString("rol");
                    //if (con.length()>15) con = con.substring(1,14)+"...";
                    ret += "\n<td>" + con + "...</td>";
                    // ret += "\n<td>" + r.getString("type") + "...</td></tr>";
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
        //Muestra los roles y permite redireccionar para eliminar.
          public String mostrarRoles() {
        String ret = "<table border='1'>";
        String con;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select id,tipo_rol from rol");
            ResultSet r = s.getResultSet();
            if (r != null) {
                while (r.next()) {
                    ret += "\n<tr> ";
                    ret += "\n<td>" + "<a href=\"eliminarRol.jsp?id=" + r.getInt("id") + "\">link</a></td>";
                    ret += "\n<td>" + r.getString("tipo_rol") + "</td>";

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

    public void tonull(int id) {
        if (id >= 0) {
            id = id * -1;
        }
        this.setIdc(id);
        this.setTipoRol("");

    }

    public boolean modificar(String tabla, String campos, String condicion) {
        boolean ret = false;
        // sql = "UPDATE " + tabla + " SET " + campos + " WHERE id=" + condicion;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
            System.out.println(campos);
            st.execute("UPDATE rol SET (usuario,pass,email) VALUES (" + campos + ")");
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

    public String toHtml(int id) {
        String ret = "<table border='1'>";

        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select id,tipo_rol from rol where id=" + id);
            ResultSet r = s.getResultSet();
            
            if (r != null) {
                r.next();
                ret += "\n<tr> ";
                ret += "\n<td>" + r.getString("tipo_rol") + "</td>";

                ret += "</tr>";
            }

            ret += "</table>";

            s.execute("select id,rolid,descripcion from permiso where rolid=" + id);
            ResultSet permisos = s.getResultSet();
            ret += "<table border='1'>";
            while (permisos.next()) {
                ret += "\n<tr> ";
                ret += "\n<td>" + permisos.getString("descripcion") + "</td>";
                ret +="\n<td>"+ "<a href=\"eliminarPermiso.jsp?rolid="+id+"&id="+permisos.getInt("id")+"\">Eliminar</a></td>";
                ret += "</tr>";
            }
            ret += "</table>";

        } catch (SQLException e) {
            this.tonull(-2);
            this.error = e.getMessage();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            this.tonull(-3);
        }
        return ret;

    }

    public ResultSet getAll() {
        ResultSet ret = null;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
            st.execute("select id,tipo_rol from rol");
            ret = st.getResultSet();//guarda

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
    
    public boolean eliminarRol(int id) {
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();

            st.execute("delete from rol where id =" + id);
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
}
