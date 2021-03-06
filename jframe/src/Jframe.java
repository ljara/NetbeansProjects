import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultEditorKit;

public class Jframe extends JFrame {

private static final long serialVersionUID = 1L;

private JPanel jContentPane = null;

private JTextArea textArea = null;

private JButton buttonCopiar = null;

private JButton buttonCortar = null;

private JButton buttonPegar = null;

private JTextArea getTextArea() {
if (textArea == null) {
textArea = new JTextArea();
textArea.setBounds(new Rectangle(9, 49, 217, 98));
}
return textArea;
}

private JButton getButtonCopiar() {
if (buttonCopiar == null) {
buttonCopiar = new JButton( new DefaultEditorKit.CopyAction() );
buttonCopiar.setBounds(new Rectangle(87, 16, 63, 23));
buttonCopiar.setText("Copiar");
}
return buttonCopiar;
}

private JButton getButtonCortar() {
if (buttonCortar == null) {
buttonCortar = new JButton( new DefaultEditorKit.CutAction() );
buttonCortar.setBounds(new Rectangle(12, 16, 63, 23));
buttonCortar.setText("Cortar");

}
return buttonCortar;
}

private JButton getButtonPegar() {
if (buttonPegar == null) {
buttonPegar = new JButton( new DefaultEditorKit.PasteAction() );
buttonPegar.setBounds(new Rectangle(162, 16, 63, 23));
buttonPegar.setText("Pegar");
}
return buttonPegar;
}

public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
frame thisClass = new frame();
thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
thisClass.setVisible(true);
}
});
}

public Test_CopyCutPaste() {
super();
initialize();
}

private void initialize() {
this.setSize(246, 200);
this.setName("frameBase");
this.setContentPane(getJContentPane());
this.setTitle("Test Cut/Copy/Paste");
}

private JPanel getJContentPane() {
if (jContentPane == null) {
jContentPane = new JPanel();
jContentPane.setLayout(null);
jContentPane.add(getTextArea(), null);
jContentPane.add(getButtonCopiar(), null);
jContentPane.add(getButtonCortar(), null);
jContentPane.add(getButtonPegar(), null);
}
return jContentPane;
}

}