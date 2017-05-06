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
public class Triangulo {

    private Point p, q, r;

    public Triangulo(Point a, Point b, Point c) {
        this.p = new Point(a);
        this.q = new Point(b);
        this.r = new Point(c);
    }

    public boolean esTriangulo() {
        boolean ret = true;

        double dpq = p.distance(q);
        double dpr = p.distance(r);
        double dqr = p.distance(r);
        double area = (dpq * dpr) / 2;
        double mayor = dqr;
        double resto = dpq + dpr;

        if (dpq > mayor) {
            mayor = dpq;
            resto = dpr + dqr;
        }
        if (dpr > mayor) {
            mayor = dpr;
            resto = dqr + dpq;
        }
        if (Math.abs(mayor - resto) + 0.001 >= 0.0) {
            ret = false;
        }

        return ret;
    }
}
