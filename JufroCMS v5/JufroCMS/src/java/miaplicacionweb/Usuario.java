/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import jufroweb.JufroCMSConnection;
import miaplicacionweb.Rol;

/**
 *
 * @author Zimri
 */
public class Usuario {

    private Connection c;
    private String user;
    private String pass;
    private String email;
    private int idc = -1;

    private String error = "";

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean insert(String campos) {
        boolean ret = false;
        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
            System.out.println(campos);
            st.execute("INSERT INTO usuario(username,pass,email) VALUES (" + campos + ")");
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
            s.execute("Select id,username,pass,email from usuario");
            ResultSet r = s.getResultSet();
            if (r != null) {
                while (r.next()) {
                    ret += "\n<tr> ";
                    ret += "\n<td>" + "<a href=\"verUsuario.jsp?id=" + r.getInt("id") + "\">link</a></td>";
                    ret += "\n<td>" + r.getString("username") + "</td>";
                    ret += "\n<td>" + r.getString("pass") + "</td>";
                    ret += "\n<td>" + r.getString("email") + "</td>";
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
        this.idc = id;
        this.user = "";
        this.email = "";
        this.pass = "";
    }

    public String toHtml(int id) {
        String ret = "<table border='1'>";

        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            s.execute("Select id,username,pass,email from usuario where id=" + id);
            ResultSet r = s.getResultSet();
            if (r != null) {
                r.next();
                ret += "\n<tr> ";
                ret += "\n<td> <input type=text value='" + r.getString("username") + "'></td>";
                ret += "\n<td> <input type=text value='" + r.getString("pass") + "'></td>";
                ret += "\n<td> <input type=text value='" + r.getString("email") + "'></td>";

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

    public String rolesToHtml(int id) {
        String ret = "<table border='1'>";

        try {
            JufroCMSConnection c = new JufroCMSConnection();
            Statement s = c.createStatement();
            

            s.execute("select rolid from usuario_rol where usuarioid=" + id);
            ResultSet relaciones = s.getResultSet();
            ArrayList<Integer> rolesUsuarios = new ArrayList<Integer>();//roles del usuario
            //String idRoles = "";
            while (relaciones.next()) {
                //  idRoles += relaciones.getInt("rolid") + ",";
                rolesUsuarios.add(relaciones.getInt("rolid"));
            }
//            if (idRoles != null && idRoles.length() > 1) {
//                idRoles = idRoles.substring(0, idRoles.length() - 1);
//            }
            //System.out.println(idRoles);
            //s.execute("select id,tipo_rol from rol where id in (" + idRoles + ")");

            Rol rol = new Rol();
            ResultSet roles = rol.getAll();
            //System.out.println(roles.next());//true
            ret += "<table border='1'>";

            System.out.print("noooo while !!");
            while (roles.next()) {
                System.out.print("noooo while");

                if (rolesUsuarios.contains(roles.getInt("id"))) {
                    System.out.print("noooo ");
                    ret += "\n<tr> ";
                    String tipoRol = roles.getString("tipo_rol");
                    ret += "\n<td>" + tipoRol + "</td>";
                    ret += "\n<td> "
                            + "<input type='checkbox' name='"
                            + tipoRol + "' value='Asignar Permiso' checked></td>";
                    //con = r.getString("content");
                    ret += "\n<td>" + "<a href=\"verRol.jsp?id=" + roles.getInt("id") + "\">link</a></td>";
                    ret += "</tr>";
                } else {
                    ret += "\n<tr> ";
                    String tipoRol = roles.getString("tipo_rol");
                    ret += "\n<td>" + tipoRol + "</td>";
                    ret += "\n<td> "
                            + "<input type='checkbox' name='"
                            + tipoRol + "' value='Asignar Permiso'></td>";
                    //con = r.getString("content");
                    ret += "\n<td>" + "<a href=\"verRol.jsp?id=" + roles.getInt("id") + "\">link</a></td>";
                    ret += "</tr>";
                    //System.out.println(roles.getString("tipo_rol"));
                }
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

}
