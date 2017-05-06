/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
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

    public int insertar(String campos) {
        /*
        JufroCMSConnection c= new JufroCMSConnection();
        Statement st = c.createStatement();//preparamos la consulta
        st.execute("insert into usuario(usuario,pass,email) values ("+campos+")");
        System.out.println();
       */
        
       return 0; 
    }

}
