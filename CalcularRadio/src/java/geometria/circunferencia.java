/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.Point;

/**
 *
 * @author Luis
 */
public class circunferencia {
    
     private Point p, q;
     private int r1,r2;

    public circunferencia(int a, int b, int c, int d, int e, int f) {
        this.p = new Point(a,b);
        this.q = new Point(d,e);
        this.r1 = c;
        this.r2 = f;
    }
    
    public boolean esCircunferencia(){
        boolean ret = true;
        
        double dist = p.distance(q);
            double sum = r1 + r2;
            
            if(dist <= sum){
                ret = true;
            }else{
                ret = false;
            }
        return ret;
    }
}
