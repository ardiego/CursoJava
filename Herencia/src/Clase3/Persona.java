/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

/**
 *
 * @author educacionit
 */
public class Persona {
    
    public Persona(String pNombre, String pApellido, String pDni)
    {
        this.nombre     = pNombre;
        this.apellido   = pApellido;
        this.dni        = pDni;
    }
    private String nombre;
    private String apellido;
    private String dni;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
 
    public void hablar()
    {
        
    }
    
}
