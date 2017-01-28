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
public class Estudiante extends Persona{
    
    public Estudiante(String pNombre, String pApellido, String pDni, String pMaticula)
    {
        super(pNombre, pApellido, pDni);
        this.matricula = pMaticula;
        
    }
    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
   
}
