/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1s12015;

import java.awt.Point;
import taller1s12015.Nodo;

/**
 *
 * @author Luis
 */
public class Taller1s12015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Utilizando como mínimo y máximo UNA instrucción for, construya un
        programa Java que escriba en consola los números múltiplos de 9 entre 400 y 700. Estos
        múltiplos deben aparecer en grupos de a 6 por cada línea debidamente separados
        int a = 9;
        int resto = 0;
        int k = 0;
        
        for (int i = 400; i <= 700; i++) {
        if (i % a == resto) {
        System.out.print(" " + i);
        k += 1;
        if (k == 6) {
        System.out.println("\n");
        k = 0;
        }
        }
        }
         *
         */
        /*Suponga que el siguiente conjunto de puntos conforma un polígono irregular.
        Utilizando la clase Point de java.awt y el método distance de esta clase, construya un
        programa que reporte el perímetro de este polígono irregular.
        (1,1),(3,1),(4,2),(5,3),(2,5),(1,1)
        
        double p;
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 1);
        Point p3 = new Point(4, 2);
        Point p4 = new Point(5, 3);
        Point p5 = new Point(2, 5);
        Point p6 = new Point(1, 1);
        
        double d12 = p1.distance(p2);
        double d23 = p2.distance(p3);
        double d34 = p3.distance(p4);
        double d45 = p4.distance(p5);
        double d56 = p5.distance(p6);
        double d61 = p6.distance(p1);
        
        
        p = (d12 + d23 + d34 + d45 + d56 + d61);
        System.out.println("Perimetro " + p);
        
        Dada la clase Nodo vista en el Taller anterior, modifíquela para que el
        contenido en lugar del atributo valor sea un objeto de la clase Point. Modifique también la
        función toString para que muestre el valor de ambas coordenadas de cada punto. Construya
        una lista circular con 4 puntos (2,3),(8,2),(9,1)(5,9) apuntados el primero con un objeto
        llamado a. Muestre que su lista está bien al escribir a, a.sigue, a.sigue.sigue, y
        a.sigue.sigue.sigue.
        
         */



        Point p1 = new Point(2, 3);
        Point p2 = new Point(8, 2);
        Point p3 = new Point(9, 1);
        Point p4 = new Point(5, 9);


        Nodo N1 = new Nodo(p1);
        Nodo N2 = new Nodo(p2);
        Nodo N3 = new Nodo(p3);
        Nodo N4 = new Nodo(p4);

        N1.fijaSigue(N2);
        N2.fijaSigue(N3);
        N3.fijaSigue(N1);
        N4.fijaSigue(N1);

        System.out.println(N1 + " " + N1.sigue + N1 + " " + N1.sigue.sigue + N1 + " " + N1.sigue.sigue.sigue);

    }
}
