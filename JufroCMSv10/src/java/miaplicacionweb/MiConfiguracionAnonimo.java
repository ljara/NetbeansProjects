/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionweb;

import jufroweb.JufroApplication;
import jufroweb.JufroMenu;

/**
 *
 * @author Zimri
 */
public class MiConfiguracionAnonimo extends JufroApplication {

    public MiConfiguracionAnonimo() {
                String ruta ="C:\\Users\\Luis\\Documents\\NetBeansProjects\\JufroCMS\\web\\";
        this.setLayout(ruta+"layout.html");
        this.addWidgetFromFile(ruta+"widget1.html");
        this.addWidgetFromFile(ruta+"widget2.html");
        this.setFooter("Zhurdazo Productions Co.<br>+562345321, Techmuco EcoSoftware Space<br>Powered by &copy; JUFRO");
        this.setHeader("Can&iacute;bales del Tiempo, RAD to your life");
        JufroMenu mimenu = new JufroMenu();
        
        //mimenu.addMenuItemFromJSP("Iniciar sesion", "index_1.jsp");
        //mimenu.addMenuItemFromHtml("abc", ruta+"layout.html");
        mimenu.addMenuItemFromContent("Home",1);
        mimenu.addMenuItemFromContent("Servicios",2);
        mimenu.addMenuItemFromHtml("Productos",ruta+"estatico.html");
        mimenu.addMenuItemFromJSP("Servicios","dinamico.jsp");
        this.setMenu(mimenu);
    }
    
    
}
