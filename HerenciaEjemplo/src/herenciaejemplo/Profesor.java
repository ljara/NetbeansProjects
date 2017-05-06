/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejemplo;

/**
 *
 * @author Luis
 */
public class Profesor extends Persona {
    
    private String idprofesor;
    
    public Profesor(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        idprofesor = "No se sabe";
    }

    public void setIdprofesor(String idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getIdprofesor() {
        return idprofesor;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: " + getNombre() + " Apellido: " + getApellido()+ " ID: " + getIdprofesor());
    }
    
    
    
    
}
