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
public class Actor extends Persona{
    private String personaje;
    
    public Actor(String nombre){
        super(nombre);
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Personaje: " + getPersonaje());
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
