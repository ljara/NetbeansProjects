package org;


import java.awt.Point;
import java.awt.Polygon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Poligono extends Polygon{

    private Point[] puntos;
    
    public Poligono(int[][] duplas) {
        puntos =  new Point[duplas.length];
        
        for (int i = 0; i < duplas.length; i++) {
            int[] is = duplas[i];
            puntos[i]  = new Point(is[0], is[1]);
        }
    }
    
    private double polygonArea(Point[] polygon, int N){
        int i,j;
        double area = 0;
        
        for(i = 0; i<N; i++){
            j  = (i+1)%N;
            area += polygon[i].x*polygon[j].y;
            area -= polygon[i].y*polygon[j].x;            
        }
        area /= 2.0;
        return (Math.abs(area));
    }
    
    public float getArea(){
        return (float) polygonArea(puntos, puntos.length);

    }
  
}
