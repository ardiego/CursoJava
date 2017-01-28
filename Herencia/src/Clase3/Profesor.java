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
public class Profesor extends Empleado{ 
    
    public Profesor(String pNombre, String pApellido, String pDni, String pLegajo,int pValorHora, String pLenguaje)
    {
        super(pNombre, pApellido, pDni, pLegajo);
        this.valorHora = pValorHora;
        this.lenguaje = pLenguaje;
    }
    private int valorHora;
    private String lenguaje;

    public void setValor(int valor) {
        this.valorHora = valor;
    }
    
    public int getValor() {
        return valorHora;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
  

    public String getLenguaje() {
        return lenguaje;
    }
    
     
    public void Trabajar()
    {
        System.out.println("Metodo con overid");
    }
    
}
