/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package verificador;

/**
 *
 * @author Luis
 */
public class verificador {

    public boolean verificarTriangulo() {
        boolean respuesta = false;
        int intx1 = Integer.parseInt(x1);
        int inty1 = Integer.parseInt(y1);
        int intx2 = Integer.parseInt(x2);
        int inty2 = Integer.parseInt(y2);
        int intx3 = Integer.parseInt(x3);
        int inty3 = Integer.parseInt(y3);

        if (((inty1 - inty2) / (intx1 - intx2)) == ((inty3 - inty2) / (intx3 - intx2))) {
            respuesta = true;
        }

        return respuesta;
    }
}