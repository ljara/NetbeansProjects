package utils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Utilidades {
    public static int[] convertir(String[] arreglo){
        
        int [] duplas = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            duplas[i] = Integer.parseInt(arreglo[i]);
            
        }
        return duplas;
    }
}
