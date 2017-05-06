package jufroweb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import miaplicacionweb.Usuario;

public class JufroApplication {

    private JufroMenu _menu = null;
    private Layout _lay = null;
    private String _footer = "";
    private String _header = "";
    private String _context = "";
    private String _user = "";
    private String _window = "";
    private String _content = "";
    private String error = "no error";
    private LinkedList<String> _widget = new LinkedList();
    String ruta = "C:\\Users\\Luis\\Documents\\NetBeansProjects\\JufroCMS\\web\\";

    public JufroApplication() {

    }

    public void setMenu(JufroMenu theMenu) {
        this._menu = theMenu;
    }

    public void setContent(String content, HttpServletRequest req, HttpSession ses) {
        String email = (String) ses.getAttribute("usuario");

        this._user = email;
        this._content = content;
        String ct = req.getParameter("content");
        String html = req.getParameter("htmlFile");
        Usuario user = new Usuario();
        System.out.println("El valor de la variable ct es : " + ct);
        System.out.println("El valor de la variable html es : " + html);
        System.out.println("El valor de la variable Layout es: " + this._lay);
        System.out.println("ver usuario NO en sesion: " + email);
        System.out.println("La url que esta acciendo es : " + req.getRequestURL());
        // String jsp = req.getParameter("jspFile");
        if (email != null) {
            if (user.esAdmin(email)) {
                agregarMenuAdministracion();
            }
            if (ct != null) {
                if (user.contenidoPorUsuario(ct, email)) {
                    this.setContentFromId(ct);
                } else {
                    if (user.esAdmin(email)) {
                        this.setContentFromId(ct);
                    } else {
                        this.setContentFromHtml(ruta + "403.html", ses);
                        System.out.println("Usuario sin permisos!!");
                    }
                }
            } else if (html != null) {
                if (user.htmlPorUsuario(email)) {
                    this.setContentFromHtml(html, ses);
                } else {
                    if (user.esAdmin(email)) {
                        this.setContentFromHtml(html, ses);
                    } else {
                        this.setContentFromHtml(ruta + "403.html", ses);
                        System.out.println("Usuario sin permisos!!");
                    }
                }
            }
        }
        if (this._lay != null) {
            this._lay.setContent(this._content);
        }

    }

    private void setContentFromHtml(String file, HttpSession session) {
        //String path = session.getServletContext().getContextPath();
        String web = this.readTextFile(file);
        if (web != null) {
            this._content = web;
        } else {
            this._content = "Problemas con archivo html " + file + " el error dice: " + this.error;
        }
    }


    /*
     private void setContentFromHtml(String file,HttpSession session){
     String path = session.getServletContext().getContextPath();
     String web = this.readTextFile(file);
     if (web!=null) this._content = web;
     else this._content = "Problemas con archivo html "+file+" el error dice: "+this.error;
     }*/
    private void setContentFromId(String ctid) {
        int id = Integer.parseInt(ctid);
        Content cbd = new Content();
        if (cbd.load(id)) {
            this._content = cbd.getContent();
        } else {
            this._content = "contenido de id " + id + " no fue posible recuperar, error: " + cbd.error();
        }
    }

    public void setWindowTitle(String window) {
        this._window = window;
        if (this._lay != null) {
            this._lay.setWindow(window);
        }
    }

    public void setFooter(String footer) {
        this._footer = footer;
        if (this._lay != null) {
            this._lay.setFooter(footer);
        }
    }

    public void setHeader(String header) {
        this._header = header;
        if (this._lay != null) {
            this._lay.setHeader(header);
        }
    }

    public void setLayout(String pathAndFile) {
        this._lay = new Layout(pathAndFile);
        //this._lay.setWindow(this._window);
        //this._lay.setFooter(this._footer);
        //this._lay.setHeader(this._header);
        //this._lay.setContent(this._content);
    }

    public String getWebPage() {
        this._lay.setWidgets(this.getWidgets());
        this._lay.setMenu(this._menu.getHtml());
        return this._lay.getWebPage();
    }

    private String getWidgets() {
        Iterator it = this._widget.iterator();
        String ret = "";
        while (it.hasNext()) {
            ret += it.next() + "<br/>";
        }
        return ret;
    }

    private String readTextFile(String pathFile) {
        String cadena = "";
        String ret = "";
        try {
            FileReader f = new FileReader(pathFile);
            BufferedReader b = new BufferedReader(f);

            while ((cadena = b.readLine()) != null) {
                ret += cadena;
            }
            b.close();
        } catch (FileNotFoundException e) {
            this.error = e.getMessage();
            return null;
        } catch (IOException e) {
            this.error = e.getMessage();
            return null;
        }

        return ret;

    }

    public boolean addWidgetFromFile(String pathFile) {
        String txt = this.readTextFile(pathFile);
        if (txt != null) {
            this._widget.add(txt);
            return true;
        } else {
            return false;
        }
    }

    public String getUser() {
        return _user;
    }

    public void setUser(String _user) {
        this._user = _user;
    }

    private void agregarMenuAdministracion() {
        this._menu.addMenuItemFromJSP("Gestion de Usuarios", "gestionUsuario.jsp");//esta opcion es del admin
        this._menu.getItem("Gestion de Usuarios").addSubMenuItem(new Item("Editar Usuarios", "administradorUsuarios.jsp", Item.JSP));
        this._menu.addMenuItemFromJSP("Gestion de Roles", "gestionRoles.jsp");
        this._menu.getItem("Gestion de Roles").addSubMenuItem(new Item("IngresarRoles", "administradorRoles.jsp", Item.JSP));
        this._menu.getItem("Gestion de Roles").addSubMenuItem(new Item("Eliminar Rol", "eliminarRolGestionRoles.jsp", Item.JSP));
        this._menu.addMenuItemFromJSP("Gestion de Permisos", "gestionPermiso.jsp");
    }

} //class
