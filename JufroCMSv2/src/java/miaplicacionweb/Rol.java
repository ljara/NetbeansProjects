/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;
import java.util.Vector;
import miaplicacionweb.Usuario;
import miaplicacionweb.Permiso;
/**
 *
 * @author Luis
 */
public class Rol {
	private int _id;
	private boolean _acceso;
	private String _tipoRol;
	public Vector<Usuario> _usuario = new Vector<Usuario>();
	public Vector<Permiso> _permiso = new Vector<Permiso>();
}