/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.awt.Point;

/**
 *
 * @author Luis
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Nodo a,b,c;
   b = new Nodo(2,null);
   a = new Nodo(4,b);
   b.fijarSigue(a);
   
   System.out.println(a);
    
    
    }
}
