import Main.*;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            
                Ventana v1 = new Ventana();
                v1.setVisible(true);
                
                ventanaBotones v2 = new ventanaBotones();
                v2.setVisible(true);
                
            }
        });
    }
}