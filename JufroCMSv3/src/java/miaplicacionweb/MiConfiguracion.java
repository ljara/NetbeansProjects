
package miaplicacionweb;
import jufroweb.*;


public class MiConfiguracion extends JufroApplication {
    
    private String ruta = "C:\\Users\\Luis\\Documents\\NetBeansProjects\\JufroCMS\\web\\";
    public MiConfiguracion() {
        this.setLayout(ruta + "layout.html");
        this.addWidgetFromFile(ruta + "widget1.html");
        this.addWidgetFromFile(ruta + "widget2.html");
        this.setFooter("Zhurdazo Productions Co.<br>+562345321, Techmuco EcoSoftware Space<br>Powered by &copy; JUFRO");
        this.setHeader("Can&iacute;bales del Tiempo, RAD to your life");
        JufroMenu mimenu = new JufroMenu();
        
        mimenu.addMenuItemFromContent("Home",1);
        mimenu.addMenuItemFromContent("Servicios",2);
        mimenu.addMenuItemFromHtml("Productos",ruta + "estatico.html");
        mimenu.addMenuItemFromJSP("Servicios","dinamico.jsp");
        this.setMenu(mimenu);
        
    }
}
