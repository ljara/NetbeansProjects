/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package awttest1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MiGranVentana extends Frame implements WindowListener {

    private Button superior;
    private Button inferior;

    public MiGranVentana() {

        BorderLayout aux = new BorderLayout();

        this.inferior = new Button("-");
        this.superior = new Button("+");
        this.add(this.superior, "North");
        this.add(new Canvas());
        this.add(this.inferior, "South");
        this.add(new Canvas());
        this.addWindowListener(this);
        this.setSize(400, 400);
        this.setLocation(400, 300);
        show();
        this.inferior.setVisible(true);
        this.superior.setVisible(true);
        superior.setSize(40, 40);
        inferior.setSize(40, 40);

    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
        //System.out.println("cerrar");
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
