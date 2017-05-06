/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejemplo;

/**
 *
 * @author Luis
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
