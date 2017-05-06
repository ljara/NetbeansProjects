/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejemplo;

/**
 *
 * @author Luis
 */
public class HerenciaEjemplo  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor Profesor1 = new Profesor("Luis", "Jara", 24);
        Profesor Profesor2 = new Profesor("as", "as", 1);
        Profesor1.setIdprofesor("AyudanteSIA");
        Profesor1.mostrarPersona();
    }
}
