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
public class Empleado extends Persona{
    
    public Empleado(String pNombre, String pApellido, String pDni, String pLegajo)
    {
        super(pNombre, pApellido, pDni);
        this.legajo = pLegajo;
        
    }
    private String legajo;

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }
    
    public void Trabajar()
    {}
    
    public void CobrarSueldo()
    {}
    
}
