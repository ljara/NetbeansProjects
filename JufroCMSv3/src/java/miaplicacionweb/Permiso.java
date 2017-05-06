/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.util.Vector;
import javax.servlet.http.HttpSession;
import miaplicacionweb.Rol;
import jufroweb.Content;
import jufroweb.Menu;

/**
 *
 * @author Zimri
 */
public class Permiso {
        private HttpSession _session;
	private String _descripcion;
	public Vector<Rol> _rol = new Vector<Rol>();
	public Vector<Content> _content = new Vector<Content>();
	public Menu _unnamed_Menu_;

	public boolean verficiarAcceso() {
		throw new UnsupportedOperationException();
	}

	public boolean accesoAdministrador() {
		throw new UnsupportedOperationException();
	}

	public boolean accesoUsuarioNormal() {
		throw new UnsupportedOperationException();
	}
}
