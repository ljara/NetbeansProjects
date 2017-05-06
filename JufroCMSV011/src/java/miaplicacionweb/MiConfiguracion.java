
package miaplicacionweb;
import jufroweb.*;
import java.io.File;


public class MiConfiguracion extends JufroApplication {
    
    public MiConfiguracion() {
        
        String ruta ="C:\\Users\\Luis\\Documents\\NetBeansProjects\\JufroCMS\\web\\";
        this.setLayout(ruta+"layout.html");
        this.addWidgetFromFile(ruta+"widget1.html");
        this.addWidgetFromFile(ruta+"widget2.html");
        this.setFooter("Zhurdazo Productions Co.<br>+562345321, Techmuco EcoSoftware Space<br>Powered by &copy; JUFRO");
        this.setHeader("Can&iacute;bales del Tiempo, RAD to your life");
        JufroMenu mimenu = new JufroMenu();
        JufroMenu submenu = new JufroMenu();
        mimenu.addMenuItemFromJSP("Iniciar sesion", "login.jsp");
        Usuario user= new Usuario();

        mimenu.addMenuItemFromContent("Home",1);
        mimenu.addMenuItemFromContent("Servicios",2);
        mimenu.addMenuItemFromContent("Noticias", 3);
        mimenu.addMenuItemFromHtml("Productos",ruta+"estatico.html");
        mimenu.addMenuItemFromJSP("Servicios","dinamico.jsp");
        this.setMenu(mimenu);
    }
}