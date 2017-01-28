/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Clase3.Administrativo;
import Clase3.Empleado;
import Clase3.Profesor;

/**
 *
 * @author educacionit
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado("Juan", "Perez", "10", "300");
        Administrativo a1 = new Administrativo("Julia", "Lopez", "11", "301", 10000);
        Profesor p1 = new Profesor("Juana", "Manso", "12","302",400,"Java");
        
        e1.Trabajar();
        p1.Trabajar();
        a1.CobrarSueldo();
        p1.CobrarSueldo();
    }
    
}
