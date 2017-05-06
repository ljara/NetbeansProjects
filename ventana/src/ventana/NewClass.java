import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author kalt
 */
public class Prueba implements ActionListener {
    private List<JButton> listaBotones = new ArrayList<>();
    private JTextField tf;
    JFrame frame;
    private JPanel panelContenedor, panelAux;
    private JButton boton;
    
    public Prueba() {
        frame = new JFrame("Botones en tiempo de ejecucion!");
        frame.getContentPane().setLayout(new BorderLayout());
        
        boton = new JButton("Dame clic");
        boton.addActionListener(this);
        
        tf = new JTextField(10);
        
        panelContenedor = new JPanel();
        panelContenedor.setLayout(new GridLayout(5,5));
       
        panelAux = new JPanel();
        panelAux.setLayout(new FlowLayout());
        panelAux.add(tf);
        panelAux.add(boton);
        
        frame.add(panelAux, BorderLayout.NORTH);
        frame.add(panelContenedor, BorderLayout.CENTER);
        
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int numero = Integer.parseInt(tf.getText());
        //Primero llenamos con el numero de elementos requeridos
        for(int i = 0; i < numero; i++) {
           listaBotones.add(new JButton("Boton "+i));
        }
        //Despues lo agregamos al panel
        Iterator<JButton> itera = listaBotones.listIterator();
        while(itera.hasNext()) {
            panelContenedor.add(itera.next());
        }
        frame.validate();
                
    }
    public static void main(String args[]) {
      new Prueba();
    }
}/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author Luis
 */
public class NewClass {
    
}
