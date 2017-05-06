/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.sql.SQLException;
import java.sql.Statement;
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
        private int idc=-1;
        private String error="";


	public boolean verficiarAcceso() {
		throw new UnsupportedOperationException();
	}

	public boolean accesoAdministrador() {
		throw new UnsupportedOperationException();
	}

	public boolean accesoUsuarioNormal() {
		throw new UnsupportedOperationException();
	}
        
        public boolean insert(String campos)  {
             boolean ret = false;
      try {
             JufroCMSConnection c = new JufroCMSConnection();
            Statement st = c.createStatement();
            System.out.println(campos);
            st.execute("INSERT INTO permiso(descripcion) VALUES ("+campos+")");
         //st.commit();
          System.out.println();
          ret=true; 
        }
      catch (SQLException e){
          this.tonull(-2);
          this.error = e.getMessage();
          System.out.println(e.getMessage());
      }
      catch (ClassNotFoundException e){
          this.tonull(-3);
      }
      System.out.println("no entro en el insert");
      return ret;
  }
      public void tonull(int id){
          if (id>=0) id=id*-1;
          this.idc = id;
          this.descripcion="";

      }
}
