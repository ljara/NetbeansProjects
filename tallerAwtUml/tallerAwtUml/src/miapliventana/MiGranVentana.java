/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapliventana;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author gera88t
 */
public abstract class MiGranVentana extends Frame implements WindowListener {

    private Button superior;
    private Button inferior;

    public MiGranVentana() {
        superior = new Button();
        inferior = new Button();
        BorderLayout aux = new BorderLayout();

        this.inferior = new Button();
        this.superior = new Button();
        this.add(this.superior);
        this.add(new Canvas());
        this.add(this.inferior);
        this.add(new Canvas());
        this.addWindowListener(this);
        this.setSize(400, 400);
        this.setLocation(400, 300);
        show();

    }
}

   