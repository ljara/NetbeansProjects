/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import java.util.Vector;
import jufroweb.JufroCMSConnection;
import miaplicacionweb.Rol;
/**
 *
 * @author Zimri
 */
public class Usuario {
	private int _id;
	private String _administrador;
	private String _user;
	private String _pass;
	private String _email;
	public JufroCMSConnection _conexionBD;
	public Vector<Rol> _rol = new Vector<Rol>();
}
