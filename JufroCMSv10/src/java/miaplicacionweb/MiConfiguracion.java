package miaplicacionweb;

import jufroweb.*;
import java.io.File;

public class MiConfiguracion extends JufroApplication {

    public MiConfiguracion() {

        String ruta = "C:\\Users\\Luis\\Documents\\NetBeansProjects\\JufroCMS\\web\\";
        this.setLayout(ruta + "layout.html");
        this.addWidgetFromFile(ruta + "widget1.html");
        this.addWidgetFromFile(ruta + "widget2.html");
        this.setFooter("Zhurdazo Productions Co.<br>+562345321, Techmuco EcoSoftware Space<br>Powered by &copy; JUFRO");
        this.setHeader("Can&iacute;bales del Tiempo, RAD to your life");
        JufroMenu mimenu = new JufroMenu();
        JufroMenu submenu = new JufroMenu();
        mimenu.addMenuItemFromJSP("Iniciar sesion", "login.jsp");

//mimenu.addMenuItemFromJSP("Iniciar sesion", "index_1.jsp");
        mimenu.addMenuItemFromJSP(
                "Gestion de Usuarios", "gestionUsuario.jsp");//esta opcion es del admin
        mimenu.getItem(
                "Gestion de Usuarios").addSubMenuItem(new Item("Editar Usuarios", "administradorUsuarios.jsp", Item.JSP));
        mimenu.addMenuItemFromJSP(
                "Gestion de Roles", "gestionRoles.jsp");
        mimenu.getItem(
                "Gestion de Roles").addSubMenuItem(new Item("IngresarRoles", "administradorRoles.jsp", Item.JSP));
        mimenu.getItem(
                "Gestion de Roles").addSubMenuItem(new Item("Eliminar Rol", "eliminarRolGestionRoles.jsp", Item.JSP));
        mimenu.addMenuItemFromJSP(
                "Gestion de Permisos", "gestionPermiso.jsp");
        //mimenu.addMenuItemFromHtml("abc", ruta+"layout.html");
        mimenu.addMenuItemFromContent(
                "Home", 1);
        mimenu.addMenuItemFromContent(
                "Servicios", 2);
        mimenu.addMenuItemFromContent(
                "Noticias", 3);
        mimenu.addMenuItemFromHtml(
                "Productos", ruta + "estatico.html");
        mimenu.addMenuItemFromJSP(
                "Servicios", "dinamico.jsp");


        this.setMenu(mimenu);
    }
}
