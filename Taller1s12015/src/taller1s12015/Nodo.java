/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1s12015;

import java.awt.Point;

/**
 *
 * @author Luis
 */
public class Nodo {

    public Point valor;
    public Nodo sigue;

    public Nodo(Point val, Nodo prox) {

        this.valor = val;
        this.sigue = prox;
    }

    public Nodo(Point val) {

        this.valor = val;
    }

    public void fijaValor(Point val) {

        this.valor = val;
    }

    public void fijaSigue(Nodo prox) {

        this.sigue = prox;
    }

    public String miDireccion() {

        return super.toString();
    }

    @Override
    public String toString() {

        String r;

        if (this.sigue == null) {

            r = "(null, null)";
        } else {

            r = this.sigue.miDireccion();
        }

        return this.miDireccion() + ">> [Valor: (" + this.valor.getX() + ", " + this.valor.getY() + ")" + " Puntero: " + r + "]";
    }
}
