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
public class Persona {
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void mostrar(){
        System.out.println("Nombre: "+ getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
