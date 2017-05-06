/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorHTML;

/**
 *
 * @author Luis
 */
public class ColorHTML {
    
    public ColorHTML(){
        
    }
    public String cuadroTexto(String txt, String colFondo ){
        String r ="<div ";
        r += "style=\backgound-color:#"+colFondo;
        return r;
    }
    public String tablaColores() {
        String r = "<table border=\"1\">";
        String h[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        String c1, c2, c3;

        for (int i = 0; i < 14; i += 2) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 13; k += 3) {
                    c1 = h[i] + h[i] + h[j] + h[j] + h[k] + h[k];
                    c2 = h[i] + h[i] + h[j] + h[j] + h[k] + h[k + 1];
                    c3 = h[i] + h[i] + h[j] + h[j] + h[k] + h[k + 2];
                    r += "<tr><td>#" + c1 + "<td>";
                    r += "<td>#" + c1 + "</td><td style=\"background-color:#=" + c1 + ">color</td>";
                    r += "<td>#" + c2 + "</td>";
                    r += "<td>#" + c2 + "</td><td style=\"background-color:#=" + c2 + ">color</td>";
                    r += "<td>#" + c3 + "</td>";
                    r += "<td>#" + c3 + "</td><td style=\"background-color:#=" + c3 + ">color</td>";

                }
                r += "</tr>";
            }
        }
    return r;}
}