/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Luis
 */
import java.awt.List;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;
import java.util.Iterator;

public class ventanaBotones extends JFrame {
    //private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JButton botones = null;
    ArrayList<JButton> nombreArrayList = new ArrayList<JButton>();
    
    private JButton getbotones() {
        if (botones == null) {
            botones = new JButton(new DefaultEditorKit.CopyAction());
            botones.setBounds(new Rectangle(87, 16, 80, 23));
            botones.setText("");
     
        }
        return botones;
    }



    public ventanaBotones() {
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 300);
        this.setName("frameBase");
        this.setContentPane(getJContentPane());
        this.setTitle("Botones");
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getbotones(), null);
            
        }
        return jContentPane;
    }
}