/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

public class Nodo {
    public int valor;
    public Nodo sigue;

    public Nodo(int val, Nodo prox) {
	this.valor = val; sigue = prox;
    }

    public void fijarValor(int val) {
	this.valor = val;
    }

    public void fijarSigue(Nodo prox) {
	this.sigue = prox;
    }
    public String miDireccion(){
        return super.toString();
    }

    @Override
    public String toString() {
        String r;
	if (this.sigue==null) {
            r = "null";
        }
        else {
            r=this.sigue.miDireccion();
        }
        return this.miDireccion()+">> [valor:"+this.valor+"Puntero:"+r+"]";
    }
}
