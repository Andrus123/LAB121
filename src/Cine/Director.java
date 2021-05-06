/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Andrés Aquin
 */
public class Director extends Persona {
    private String tipo;
    
    public Director(String nombre, String tipo){
        super(nombre);
        this.tipo = tipo;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Director: " + getTipo());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
