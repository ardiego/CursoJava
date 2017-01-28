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
public class Administrativo extends Empleado{
    
    public Administrativo(String pNombre, String pApellido, String pDni, String pLegajo, int pSueldo)
    {
        super(pNombre, pApellido, pDni, pLegajo);
        this.sueldo = pSueldo;
    }
    
    private int sueldo;

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }
}
